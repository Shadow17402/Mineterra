package net.kaindorf.mineterra.item.tool;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {

    private String name;

    public ItemShovel(Item.ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

}