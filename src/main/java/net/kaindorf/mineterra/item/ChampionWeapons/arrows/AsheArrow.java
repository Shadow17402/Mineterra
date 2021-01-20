package net.kaindorf.mineterra.item.ChampionWeapons.arrows;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AsheArrow extends ItemArrow {

    protected String name;

    public AsheArrow(String name){
        this.name = name;
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    public ECustomArrow makeTippedArrow(World world, ItemStack itemstack, EntityLivingBase shooter) {
        return new ECustomArrow(world, shooter);
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }
}
