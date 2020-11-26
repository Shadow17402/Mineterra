package net.kaindorf.mineterra.world.dimension.Void;

import net.kaindorf.mineterra.world.BiomeInit;
import net.kaindorf.mineterra.world.DimensionInit;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionVoid extends WorldProvider {

    public DimensionVoid() {
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.VOID_DIMENSION);
    }

    @Override
    public DimensionType getDimensionType() {
        return DimensionInit.VOID;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorVoid(world,true, world.getSeed());
    }

    @Override
    public boolean canRespawnHere() {
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
