package me.dahpr0gam3r.IdissyHealthBars;

import me.dahpr0gam3r.IdissyCore.IdissyCore;
import me.dahpr0gam3r.IdissyHealthBars.utils.Debug;
import me.dahpr0gam3r.IdissyHealthBars.utils.PlayerBarUtils;
import me.dahpr0gam3r.IdissyHealthBars.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.logging.Logger;


public class Main extends JavaPlugin {
	
	public static 	Main plugin;
	public static	Logger logger;
	
	private static	DamageListener damageListener;
	private static	DeathListener deathListener;
	private static 	MiscListeners miscListeners;

	@Override
	public void onEnable() {
		
		plugin = this;
		logger = getLogger();
		
		
		try {
			String build = Utils.getBukkitBuild();
			if (build != null) {
				if (Integer.parseInt(build) < 2811) {	
					logger.warning("------------------------------------------");
					logger.warning("Your bukkit build (#" + build + ") is old.");
					logger.warning("IdissyHealthBar cannot work properly,");
					logger.warning("please update CraftBukkit.");
					logger.warning("------------------------------------------");
					this.setEnabled(false);
					return;
				}
			}
		} catch (Exception ignore) {}
		
		
		damageListener = new DamageListener();
		deathListener = new DeathListener();
		miscListeners = new MiscListeners();
		
		//to check if I've forgot the debug on :)
		Debug.color("&c[IdissyHealthBar] Debug ON");
		
		//create the folder and the file
		if (getDataFolder().exists()) {
			getDataFolder().mkdir();
		}
		Utils.loadFile("config.yml", this);
			
		//register events
		getServer().getPluginManager().registerEvents(damageListener, this);
		getServer().getPluginManager().registerEvents(deathListener, this);
		getServer().getPluginManager().registerEvents(miscListeners, this);
		
		//other files
		reloadConfigFromDisk();
		FileConfiguration config = getConfig();
		
		

		
			
		//setup for command executor
		getCommand("IdissyHealthBar").setExecutor(new Commands(this));

		IdissyCore.sendStart(this);
//end of onEnable
	}	

	@Override
	public void onDisable() {
		PlayerBarUtils.removeAllHealthbarTeams(Bukkit.getScoreboardManager().getMainScoreboard());
		PlayerBar.removeBelowObj();
		DamageListener.removeAllMobHealthBars();
		System.out.println("IdissyHealthBar disabled, all the health bars have been removed.");
	}
	
	
	public void reloadConfigFromDisk() {
		
		reloadConfig();
		//Utils.checkDefaultNodes(getConfig(), this);
		Configuration.checkConfigYML();
		
		Utils.loadFile("custom-mob-bar.yml", this);
		Utils.loadFile("custom-player-bar.yml", this);
		Utils.loadFile("locale.yml", this);
		Utils.loadFile("config.yml", this);
		
		//forces to generate translations, if missing
		Utils.getTranslationMap(this);
		
		DamageListener.loadConfiguration();
		DeathListener.loadConfiguration();
		PlayerBar.loadConfiguration();
		MiscListeners.loadConfiguration();
	}

	public static MiscListeners getLoginListenerInstance() {
		return miscListeners;
	}
	
	public static File getPluginFile() {
		return plugin.getFile();
	}

//end of the class
}
