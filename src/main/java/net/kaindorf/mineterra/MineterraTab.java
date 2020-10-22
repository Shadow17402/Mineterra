package net.kaindorf.mineterra;

import net.kaindorf.mineterra.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MineterraTab extends CreativeTabs{
    public MineterraTab() {
        super(Mineterra.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }
}
