package net.kaindorf.mineterra.world;

import net.kaindorf.mineterra.world.dimension.Void.Biome.BiomeVoidDim;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeVoid;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {

    public static final Biome VOID_DIMENSION = new BiomeVoidDim();

    public static void registerBiomes(){
        initBiome(VOID_DIMENSION,"Void",BiomeType.COOL,Type.MOUNTAIN,Type.DEAD);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome,types);
        BiomeManager.addBiome(biomeType,new BiomeEntry(biome,10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}
