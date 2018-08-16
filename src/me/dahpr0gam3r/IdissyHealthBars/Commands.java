package me.dahpr0gam3r.IdissyHealthBars;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
	public Main instance;
	
	private static final String PREFIX = "&2[&aIdissyHealthBar&2] ";
		
	public Commands(Main main) {
		instance = main;
	}

	@Override
	public boolean onCommand(final CommandSender sender, Command cmd, String label, String[] args) {
			if (args.length == 0) {
				sendInfo(sender);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("help")) {
				sendCommandList(sender);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("reload")) {
				reloadConfigs(sender);
				return true;
			}
			

			
	    	sender.sendMessage(PREFIX + "&eUnknown command. Type &a" + label + " &efor help.");
	    	return true;
	}

	
	private void reloadConfigs(CommandSender sender) {
		if (!sender.hasPermission("idissyhealthbar.reload")) {
			noPermissionMessage(sender);
			return;
		}
		try {
			instance.reloadConfigFromDisk();
			sender.sendMessage("&e>>&6 IdissyHealthBar reloaded");
		}
		catch (Exception e) {
			e.printStackTrace();
			sender.sendMessage("&cFailed to reload configs, take a look at the console!");
		}
		
	}

	private void sendInfo(CommandSender sender) {
		sender.sendMessage(PREFIX);
		sender.sendMessage("&aVersion: &7" + instance.getDescription().getVersion());
		sender.sendMessage("&aDeveloper: &dahpr0gam3r");
		sender.sendMessage("&aCommands: &7/ihb help");
	}
	
	private void sendCommandList(CommandSender sender) {
		if (!sender.hasPermission("idissyhealthbar.help")) {
			noPermissionMessage(sender);
			return;
		}
		sender.sendMessage("&e>>&6 IdissyHealthBar commands: ");
		sender.sendMessage("&2/ihb &7- &aDisplays general plugin info");
		sender.sendMessage("&2/ihb reload &7- &aReloads the configs");

	}

	private void noPermissionMessage(CommandSender sender) {
		sender.sendMessage("&cYou don't have permission.");
	}
}
