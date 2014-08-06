package com.christerb.cbmiscstuffs.block;

import com.christerb.cbmiscstuffs.reference.Names;

public class BlockTestLamp extends BlockCBMS
{
    public  BlockTestLamp()
    {
        super();
        this.setBlockName(Names.Blocks.TEST_LAMP);
        this.setBlockTextureName(Names.Blocks.TEST_LAMP);
        this.setStepSound(soundTypeGlass);
    }
}
