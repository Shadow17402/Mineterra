package net.kaindorf.mineterra.item.tool;

import net.kaindorf.mineterra.Mineterra;

public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

}
