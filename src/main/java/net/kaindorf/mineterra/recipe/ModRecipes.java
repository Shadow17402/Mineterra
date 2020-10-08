package net.kaindorf.mineterra.recipe;

import net.kaindorf.mineterra.block.ModBlocks;
import net.kaindorf.mineterra.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init(){
        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);

        //Ore Dict
        ModBlocks.oreCopper.initOreDict();
        ModItems.ingotCopper.initOreDict();
    }

}
