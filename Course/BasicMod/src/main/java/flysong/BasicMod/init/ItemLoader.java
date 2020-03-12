package flysong.BasicMod.init;

import flysong.BasicMod.BasicMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BasicMod.MODID)
public class ItemLoader {
    public static final Item testItem = new Item().setUnlocalizedName("ruby").setRegistryName("ruby").setCreativeTab(CreativeTabs.MISC);
    public ItemLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void ItemRegistry()
    {

    }
}
