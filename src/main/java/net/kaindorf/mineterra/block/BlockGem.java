package net.kaindorf.mineterra.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

public class BlockGem extends BlockBase{

    private String oreName;
    private Item drop;

    public BlockGem(String name, String oreName,Item drop) {
        super(Material.ROCK, name, 3f);
        this.drop=drop;
        this.oreName = oreName;

        setResistance(5f);
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public BlockGem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return drop;
    }

}
