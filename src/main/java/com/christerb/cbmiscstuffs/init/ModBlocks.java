package com.christerb.cbmiscstuffs.init;

import com.christerb.cbmiscstuffs.block.BlockCBMS;
import com.christerb.cbmiscstuffs.block.BlockTestLamp;
import com.christerb.cbmiscstuffs.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCBMS testLamp = new BlockTestLamp();

    public static void init()
    {
        GameRegistry.registerBlock(testLamp, "testLamp");
    }

}
