package net.kaindorf.mineterra.item.ChampionWeapons;

import net.kaindorf.mineterra.item.tool.ItemSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SwordYi extends ItemSword {

    public SwordYi(ToolMaterial material, String name) {
        super(material, name);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED,200,1));
        playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,200,1));
        playerIn.getCooldownTracker().setCooldown(this,6000);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
