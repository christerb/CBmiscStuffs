package com.christerb.cbmiscstuffs.creativetab;

import com.christerb.cbmiscstuffs.init.ModItems;
import com.christerb.cbmiscstuffs.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCBMS
{
    public static final CreativeTabs CBMS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() { return ModItems.emeraldSword; }

    };
}
