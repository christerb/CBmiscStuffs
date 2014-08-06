package com.christerb.cbmiscstuffs.item;

import com.christerb.cbmiscstuffs.creativetab.CreativeTabCBMS;
import com.christerb.cbmiscstuffs.reference.Material;
import com.christerb.cbmiscstuffs.reference.Names;
import com.christerb.cbmiscstuffs.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;


public class ItemEmeraldPickaxe extends ItemPickaxe
{

    public ItemEmeraldPickaxe()
    {
        super(Material.Tools.EMERALD);
        this.setCreativeTab(CreativeTabCBMS.CBMS_TAB);
        this.setUnlocalizedName(Names.Tools.EMERALD_PICKAXE);
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
