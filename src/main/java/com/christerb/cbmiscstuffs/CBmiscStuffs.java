package com.christerb.cbmiscstuffs;

import com.christerb.cbmiscstuffs.handler.ConfigurationHandler;
import com.christerb.cbmiscstuffs.init.ModBlocks;
import com.christerb.cbmiscstuffs.init.ModItems;
import com.christerb.cbmiscstuffs.init.Recipes;
import com.christerb.cbmiscstuffs.proxy.IProxy;
import com.christerb.cbmiscstuffs.reference.Reference;
import com.christerb.cbmiscstuffs.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class CBmiscStuffs
{
    @Mod.Instance(Reference.MOD_ID)
    public static CBmiscStuffs instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) //Load network handling, mod config, item and blocks
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) //Registering GUIs, tile entities, crafting recipes etc
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) //Wrap up... based on other mods etc...
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
