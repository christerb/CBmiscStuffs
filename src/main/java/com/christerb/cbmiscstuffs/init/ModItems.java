package com.christerb.cbmiscstuffs.init;

import com.christerb.cbmiscstuffs.item.*;
import com.christerb.cbmiscstuffs.reference.Names;
import com.christerb.cbmiscstuffs.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEmeraldSword emeraldSword = new ItemEmeraldSword();
    public static final ItemCBMS emeraldNetherSword = new ItemEmeraldNetherSword();
    public static final ItemCBMS obsidianStick = new ItemObsidianStick();
    public static final ItemEmeraldPickaxe emeraldPickaxe = new ItemEmeraldPickaxe();
    public static final ItemEmeraldAxe emeraldAxe = new ItemEmeraldAxe();

    public static void init()
    {
        GameRegistry.registerItem(emeraldSword, Names.Weapons.EMERALD_SWORD);
        GameRegistry.registerItem(emeraldNetherSword, Names.Weapons.EMERALD_NETHER_SWORD);
        GameRegistry.registerItem(obsidianStick, Names.Items.OBSIDIAN_STICK);
        GameRegistry.registerItem(emeraldPickaxe, Names.Tools.EMERALD_PICKAXE);
        GameRegistry.registerItem(emeraldAxe, Names.Tools.EMERALD_AXE);
    }

}
