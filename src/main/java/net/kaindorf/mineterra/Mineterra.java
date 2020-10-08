package net.kaindorf.mineterra;

import net.kaindorf.mineterra.block.ModBlocks;
import net.kaindorf.mineterra.item.ModItems;
import net.kaindorf.mineterra.proxy.CommonProxy;
import net.kaindorf.mineterra.recipe.ModRecipes;
import net.kaindorf.mineterra.world.ModWorldGeneration;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Mineterra.MODID, name = Mineterra.NAME, version = Mineterra.VERSION)
public class Mineterra
{
    public static final String MODID = "mineterra";
    public static final String NAME = "Mineterra Mod";
    public static final String VERSION = "1.0";
    public static final TutorialTab creativeTab = new TutorialTab();
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);

    @SidedProxy(serverSide = "net.kaindorf.mineterra.proxy.CommonProxy", clientSide = "net.kaindorf.mineterra.proxy.ClientProxy")
    public static CommonProxy proxy;


    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

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

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
