package com.christerb.cbmiscstuffs.item;


import com.christerb.cbmiscstuffs.creativetab.CreativeTabCBMS;
import com.christerb.cbmiscstuffs.reference.Material;
import com.christerb.cbmiscstuffs.reference.Names;
import com.christerb.cbmiscstuffs.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword

{
    public ItemEmeraldSword()
    {
        super(Material.Tools.EMERALD);
        this.setCreativeTab(CreativeTabCBMS.CBMS_TAB);
        //this.setNoRepair();
        this.maxStackSize = 1;
        this.setUnlocalizedName(Names.Weapons.EMERALD_SWORD);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }



    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }
}
