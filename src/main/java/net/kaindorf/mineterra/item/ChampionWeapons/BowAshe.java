package net.kaindorf.mineterra.item.ChampionWeapons;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.item.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class BowAshe extends ItemBow {

    private float arrowDamage;

    protected String name;

    public BowAshe(final String name, final int maxUses, final float arrowDamage) {
        super();
        this.name = name;
        this.setUnlocalizedName(name);
        setRegistryName(name);
        this.setMaxDamage(maxUses);
        this.arrowDamage = arrowDamage;
        this.setCreativeTab(Mineterra.creativeTab);
    }

    

    @Override
    protected ItemStack findAmmo(EntityPlayer player) {
        return new ItemStack(ModItems.arrowAshe);
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }
}
