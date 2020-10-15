package net.kaindorf.mineterra.item.tool;

import net.kaindorf.mineterra.Mineterra;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe{

    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

}
