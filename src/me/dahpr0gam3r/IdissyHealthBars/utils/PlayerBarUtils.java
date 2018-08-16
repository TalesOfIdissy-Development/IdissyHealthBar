package me.dahpr0gam3r.IdissyHealthBars.utils;

import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class PlayerBarUtils {
	
	//enforce non-instantiability with a private constructor
	private PlayerBarUtils() {}
	
	public static void create10DefaultTeams(Scoreboard sb, int style) {
		
		if (style == 2) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c▌"));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c█"));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e█▌"));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e██"));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e██▌"));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a███"));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a███▌"));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a████"));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a████▌"));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a█████"));
			return; 
		} else if (style == 3) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &cI&8IIIIIIIII"));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &cII&8IIIIIIII"));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &eIII&8IIIIIII"));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &eIIII&8IIIIII"));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &eIIIII&8IIIII"));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &aIIIIII&8IIII"));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &aIIIIIII&8III"));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &aIIIIIIII&8II"));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &aIIIIIIIII&8I"));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &aIIIIIIIIII"));
			return;
		} else if (style == 4) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c1❤"));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c2❤"));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e3❤"));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e4❤"));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e5❤"));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a6❤"));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a7❤"));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a8❤"));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a9❤"));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a10❤"));
			return; 
		} else if (style == 5) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c♦&7♦♦♦♦ "));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c♦&7♦♦♦♦ "));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e♦♦&7♦♦♦ "));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e♦♦&7♦♦♦ "));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦&7♦♦ "));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦&7♦♦ "));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦♦&7♦ "));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦♦&7♦ "));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦♦♦ "));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a♦♦♦♦♦ "));
			return;
		} else if (style == 6) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤&7❤❤❤❤"));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤&7❤❤❤❤"));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤&7❤❤❤"));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤&7❤❤❤"));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤&7❤❤"));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤&7❤❤"));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤❤&7❤"));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤❤&7❤"));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤❤❤"));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c❤❤❤❤❤"));
			return;
		} else if (style == 7) {
		      sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c▌&8▌▌▌▌▌▌▌▌▌"));
		      sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c▌▌&8▌▌▌▌▌▌▌▌"));
		      sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e▌▌▌&8▌▌▌▌▌▌▌"));
		      sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e▌▌▌▌&8▌▌▌▌▌▌"));
		      sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e▌▌▌▌▌&8▌▌▌▌▌"));
		      sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a▌▌▌▌▌▌&8▌▌▌▌"));
		      sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a▌▌▌▌▌▌▌&8▌▌▌"));
		      sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a▌▌▌▌▌▌▌▌&8▌▌"));
		      sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a▌▌▌▌▌▌▌▌▌&8▌"));
		      sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a▌▌▌▌▌▌▌▌▌▌"));
			return;
		} else {
		//style == 1 or > 7
		    sb.registerNewTeam("ibr1").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c|&8|||||||||"));
		    sb.registerNewTeam("ibr2").setSuffix(ChatColor.translateAlternateColorCodes('&'," &c||&8||||||||"));
		    sb.registerNewTeam("ibr3").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e|||&8|||||||"));
		    sb.registerNewTeam("ibr4").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e||||&8||||||"));
		    sb.registerNewTeam("ibr5").setSuffix(ChatColor.translateAlternateColorCodes('&'," &e|||||&8|||||"));
		    sb.registerNewTeam("ibr6").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a||||||&8||||"));
		    sb.registerNewTeam("ibr7").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a|||||||&8|||"));
		    sb.registerNewTeam("ibr8").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a||||||||&8||"));
		    sb.registerNewTeam("ibr9").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a|||||||||&8|"));
		    sb.registerNewTeam("ibr10").setSuffix(ChatColor.translateAlternateColorCodes('&'," &a||||||||||"));
			return;
		}
	}
	
	/*
	 * Adds the teams from a file to the scoreboard
	 */
	public static void create10CustomTeams(Scoreboard sb, FileConfiguration c) {
		for (int i=1; i<11; i++) {
			try {
				
				Team t = sb.registerNewTeam("ibr" + i);
				if (!c.isSet(i + "0" + "-percent.prefix")) {
					c.set(i + "0" + "-percent.prefix", "");
				}
				if (!c.isSet(i + "0" + "-percent.suffix")) {
					c.set(i + "0" + "-percent.suffix", "");
				}
				String prefix = c.getString(i + "0" + "-percent.prefix");
				String suffix = c.getString(i + "0" + "-percent.suffix");
				
				if ((prefix != null) && (!prefix.equals("")))
					t.setPrefix(Utils.replaceSymbols(prefix));
				if ((suffix != null) && (!suffix.equals("")))
					t.setSuffix(Utils.replaceSymbols(suffix));
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	/*
	 * By default players in the same team can see each other while invisible
	 */
	public static void setAllTeamsInvisibility(Scoreboard sb) {
		
		Set<Team> teamList = sb.getTeams();
		for (Team team : teamList) {
			//teams used by IdissyHealthBar - they contains ibr
			if (team.getName().contains("ibr")) {
				team.setCanSeeFriendlyInvisibles(false);
			}
		}
	}
	
	/*
	 * Removes all the teams created by IdissyHealthBar
	 */
	public static void removeAllHealthbarTeams(Scoreboard sb) {
		
		Set<Team> teamList = sb.getTeams();
		for (Team team : teamList) {
			if (team.getName().contains("ibr")) {
				team.unregister();
			}
		}
	}	
	
}
