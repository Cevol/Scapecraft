package scapecraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Constants;

import scapecraft.block.ScapecraftBlocks;
import scapecraft.client.gui.GuiHandler;
import scapecraft.entity.Drop;
import scapecraft.entity.EntityScapecraft;
import scapecraft.entity.ScapecraftEntities;
import scapecraft.item.ScapecraftItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = "Scapecraft", name = "Scapecraft", version = Scapecraft.version)
public class Scapecraft
{
	public static final String version = "@VERSION@";
	public static SimpleNetworkWrapper netHandler = NetworkRegistry.INSTANCE.newSimpleChannel("Scapecraft");

	/*start armor*/
	public static final CreativeTabs tabScapecraftArmor = new CreativeTabs("tabScapecraftArmor")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.phatHelmet;
		}
	};

	public static final CreativeTabs tabScapecraftBlock = new CreativeTabs("tabScapecraftBlock")
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ScapecraftBlocks.runeOre);
		}
	};

	public static final CreativeTabs tabScapecraftWeapon = new CreativeTabs("tabScapecraftWeapon")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.SGS;
		}
	};

	public static final CreativeTabs tabScapecraftTool = new CreativeTabs("tabScapecraftTool")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.dragonAxe;
		}
	};

	public static final CreativeTabs tabScapecraftMisc = new CreativeTabs("tabScapecraftMisc")
	{
		@Override
		public Item getTabIconItem()
		{
			return ScapecraftItems.questPoint;
		}
	};

	@SidedProxy(clientSide = "scapecraft.client.ClientProxy", serverSide = "scapecraft.CommonProxy")
	public static CommonProxy proxy;

	public static Scapecraft instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
		ScapecraftBlocks.registerBlocks();
		ScapecraftItems.registerItems();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderers();

		ScapecraftEntities.registerEntities();

		ScapecraftRecipes.registerRecipes();

		MinecraftForge.EVENT_BUS.register(new ScapecraftEventHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		File dataFile = event.getServer().worldServers[0].getSaveHandler().getMapFileFromName("ScapecraftData");
		if(dataFile != null && dataFile.exists())
		{
			NBTTagCompound nbt;
			try {
				nbt = CompressedStreamTools.readCompressed(new FileInputStream(dataFile));
			} catch(IOException e) {
				e.printStackTrace();
				return;
			}

			NBTTagCompound drops = nbt.getCompoundTag("drops");
			boolean update = !drops.getString("version").equals(version) || version.isEmpty();
			if(update)
				ScapecraftEntities.addDrops();

			if(!drops.hasNoTags())
				for(Object id : drops.getKeySet())
				{
					NBTTagList list = drops.getTagList((String) id, Constants.NBT.TAG_COMPOUND);
					@SuppressWarnings("unchecked") //Decompiling causes type erasure, so this is necessary to prevent warnings
					Class<? extends EntityScapecraft> entityClass = (Class<? extends EntityScapecraft>) EntityList.stringToClassMapping.get((String) id);
					while(list.tagCount() > 0)
						if(!update || list.getCompoundTagAt(0).getBoolean("custom"))
								EntityScapecraft.addDrop(entityClass, Drop.fromNBT((NBTTagCompound) list.removeTag(0)));

				}
		}
	}

}
