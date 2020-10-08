package net.kaindorf.mineterra;

import net.kaindorf.mineterra.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs{
    public TutorialTab() {
        super(Mineterra.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotCopper);
    }
}
