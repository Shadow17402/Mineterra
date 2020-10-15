package net.kaindorf.mineterra.proxy;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.block.ModBlocks;
import net.kaindorf.mineterra.entity.EntityInit;
import net.kaindorf.mineterra.entity.render.RenderHandler;
import net.kaindorf.mineterra.item.ModItems;
import net.kaindorf.mineterra.recipe.ModRecipes;
import net.kaindorf.mineterra.world.ModWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Mineterra.MODID)
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
    }

    public void init(FMLInitializationEvent event){
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent event){

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.register(event.getRegistry());
        ModBlocks.registerItemBlocks(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.registerModels();
        ModBlocks.registerModels();
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }

}
