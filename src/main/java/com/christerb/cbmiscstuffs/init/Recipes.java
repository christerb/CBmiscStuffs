package com.christerb.cbmiscstuffs.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.obsidianStick),       "O", "O",               'O', new ItemStack(Blocks.obsidian));
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldSword),        "E", "E", "S",          'E', new ItemStack(Items.emerald), 'S', new ItemStack(ModItems.obsidianStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldPickaxe),      "EEE", " S ", " S ",    'E', new ItemStack(Items.emerald), 'S', new ItemStack(ModItems.obsidianStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldAxe),          "EE", "ES", " S",    'E', new ItemStack(Items.emerald), 'S', new ItemStack(ModItems.obsidianStick));
        GameRegistry.addRecipe(new ItemStack(ModItems.emeraldNetherSword),  "E", "N", "S",          'E', new ItemStack(Items.emerald), 'N', new ItemStack(Items.nether_star), 'S', new ItemStack(ModItems.obsidianStick));
    }

}
