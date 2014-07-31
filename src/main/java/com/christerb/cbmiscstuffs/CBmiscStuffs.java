package com.christerb.cbmiscstuffs;

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

    @SidedProxy(clientSide = "com.christerb.cbmiscstuffs.proxy.ClientProxy", serverSide = "com.christerb.cbmiscstuffs.proxy.Serverproxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        /**
         * Load network handling, mod config, item and blocks
         */
    }

    @Mod.EventHandler
    public void  init (FMLInitializationEvent event)
    {
        /**
         * Registering GUIs, tile entities, crafting recipes etc
         */
    }

    @Mod.EventHandler
    public void  postInit (FMLPostInitializationEvent event)
    {
        /**
         * Wrap up... based on other mods etc...
         */
    }
}
