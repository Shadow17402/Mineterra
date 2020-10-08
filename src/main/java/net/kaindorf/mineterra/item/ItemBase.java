package net.kaindorf.mineterra.item;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemBase extends Item {

    protected String name;

    private String oreName;

    public ItemBase(String name,String oreName) {
        this.name = name;
        this.oreName=oreName;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Mineterra.creativeTab);
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
