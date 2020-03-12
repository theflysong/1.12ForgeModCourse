package flysong.BasicMod;

import flysong.BasicMod.proxy.Common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=BasicMod.MODID,name=BasicMod.NAME,version=BasicMod.VERSION,acceptedMinecraftVersions="1.12.2")
public class BasicMod {
    public static final String MODID = "basicmod";
    public static final String NAME = "BasicMod";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(BasicMod.MODID)
    public static BasicMod instance;

    @SidedProxy(serverSide = "flysong.BasicMod.proxy.Common"
            ,clientSide = "flysong.BasicMod.proxy.Client"
            ,modId = MODID)
    public Common proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}