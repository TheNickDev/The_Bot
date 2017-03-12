package com.thebotproject.Main;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventHandler extends ListenerAdapter{
	public void onMessageReceived(MessageReceivedEvent e) {
		 
		 
			 
		 e.getChannel().sendMessage("Total " + Methods.getAllUsers()+" users visible!").queue();
		 e.getChannel().sendMessage("Total " + Methods.getAllGuilds() +" guilds visible!").queue();
		 e.getChannel().sendMessage("Total " + Methods.getAllTextChannels() +" text channels visible!").queue();
		 e.getChannel().sendMessage("Total " + Methods.getAllVoiceChannels() +" voice channels visible!").queue();
		 
		 
	}
}
