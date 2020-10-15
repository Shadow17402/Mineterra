package net.kaindorf.mineterra.item.tool;

import net.kaindorf.mineterra.Mineterra;

public class ItemHoe extends net.minecraft.item.ItemHoe {

    private String name;

    public ItemHoe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

}