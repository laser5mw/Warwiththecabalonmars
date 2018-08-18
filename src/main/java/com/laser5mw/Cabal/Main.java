package com.laser5mw.Cabal;

import com.laser5mw.Cabal.client.gui.DestinyHP;
import com.laser5mw.Cabal.proxy.CommonProxy;
import com.laser5mw.Cabal.util.Refrence;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refrence.MOD_ID, name = Refrence.NAME, version = Refrence.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS, serverSide = Refrence.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent Event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent Event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent Event)
	{
		MinecraftForge.EVENT_BUS.register(new DestinyHP());
	}
}