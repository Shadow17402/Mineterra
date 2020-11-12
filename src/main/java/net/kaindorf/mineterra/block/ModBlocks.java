package net.kaindorf.mineterra.block;

import net.kaindorf.mineterra.block.pedestal.BlockPedestal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper","oreCopper");
    public static BlockBase blockCopper = new BlockBase(Material.IRON,"block_copper");
    public static BlockPedestal pedestal = new BlockPedestal();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreCopper,
                blockCopper,
                pedestal
        );
        GameRegistry.registerTileEntity(pedestal.getTileEntityClass(),pedestal.getRegistryName().toString());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock(),
                blockCopper.createItemBlock(),
                pedestal.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
        blockCopper.registerItemModel(Item.getItemFromBlock(blockCopper));
        pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
    }

}
