package net.kaindorf.mineterra.item;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.kaindorf.mineterra.item.tool.ItemSword;

public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper","ingotCopper");
    public static ItemSword copperSword = new ItemSword(Mineterra.copperToolMaterial, "copper_sword");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                copperSword
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        copperSword.registerItemModel();
    }

}
