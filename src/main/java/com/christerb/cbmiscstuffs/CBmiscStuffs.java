package com.christerb.cbmiscstuffs;

import com.christerb.cbmiscstuffs.configuration.ConfigurationHandler;
import com.christerb.cbmiscstuffs.proxy.IProxy;
import com.christerb.cbmiscstuffs.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

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
    }

    @Mod.EventHandler
    public void  init (FMLInitializationEvent event) //Registering GUIs, tile entities, crafting recipes etc
    {

    }

    @Mod.EventHandler
    public void  postInit (FMLPostInitializationEvent event) //Wrap up... based on other mods etc...
    {

    }
}
