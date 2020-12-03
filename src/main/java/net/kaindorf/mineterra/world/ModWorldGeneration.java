package net.kaindorf.mineterra.world;

import net.kaindorf.mineterra.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0:
                generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
                break;
            case 2:
                generateVoid(random,chunkX,chunkZ,world,chunkGenerator,chunkProvider);
                break;
        }
    }

    private void generateVoid(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.VoidOre.getDefaultState(),world,random,chunkX * 16,chunkZ*16,0,50,2 + random.nextInt(3),6);
    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ModBlocks.oreCopper.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 4 + random.nextInt(4), 4);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
            WorldGenMinable generator = new WorldGenMinable(ore, size);
            if(world.provider.getDimension() == 2){
                generator = new WorldGenMinable(ore,size,BlockMatcher.forBlock(ModBlocks.VoidStone));
            }
            generator.generate(world, random, pos);
        }
    }

}
