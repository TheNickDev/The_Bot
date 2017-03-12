package com.thebotproject.Main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Methods {
	public static void doAuth() {
		try {
			Var.jda = new JDABuilder(AccountType.BOT).setToken("").addListener(new The_Bot()).setGame(Game.of("recoding!")).buildBlocking();
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (RateLimitedException e) {
			e.printStackTrace();
		}
		
	}
	public static int getAllUsers() {
		 Var.userCount=0;
		 Var.jda.getUsers().forEach(user->{Var.userCount++;});
		 return Var.userCount;
	}
	public static int getAllGuilds() {
		 Var.guildCount=0;
		 Var.jda.getGuilds().forEach(guild->{Var.guildCount++;});
		 return Var.guildCount;
	}
	public static int getAllTextChannels() {
		 Var.tchannelCount=0;
		 Var.jda.getUsers().forEach(user->{Var.tchannelCount++;});
		 return Var.tchannelCount;
	}
	public static int getAllVoiceChannels() {
		 Var.vchannelCount=0;
		 Var.jda.getUsers().forEach(user->{Var.vchannelCount++;});
		 return Var.vchannelCount;
	}
	public static int getOwner(){
		
		return 0;}
	

}
