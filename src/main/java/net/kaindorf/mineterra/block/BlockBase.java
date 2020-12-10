package net.kaindorf.mineterra.block;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name, float hardness) {
        super(material);

        this.name = name;
        setHardness(hardness);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Mineterra.creativeTab);
    }

    @Override
    public Block setHardness(float hardness) {
        return super.setHardness(hardness);
    }

    public void registerItemModel(Item itemBlock) {
        Mineterra.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
