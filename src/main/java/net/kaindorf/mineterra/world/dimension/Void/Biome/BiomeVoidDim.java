package net.kaindorf.mineterra.world.dimension.Void.Biome;

import net.minecraft.world.biome.Biome;

public class BiomeVoidDim extends Biome {

    public BiomeVoidDim() {
        super(new BiomeProperties("Void").setBaseHeight(0.6F).setHeightVariation(0.4F).setRainDisabled().setTemperature(0.2F).setWaterColor(8991391));
    }


}
