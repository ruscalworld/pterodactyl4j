package com.mattmalec.pterodactyl4j;

import com.mattmalec.pterodactyl4j.application.PteroApplicationBuilder;
import com.mattmalec.pterodactyl4j.application.entities.Location;
import com.mattmalec.pterodactyl4j.application.entities.Node;
import com.mattmalec.pterodactyl4j.application.entities.PteroApplication;


public class Main {

	public static void main(String[] args)  {
		PteroApplication application = new PteroApplicationBuilder()
				.setApplicationUrl("https://panel.explodingbush.net")
				.setToken("wPdYseNq2hc3okrMx7eomgSAjXV117ozGnt8VJYTImDFqy23").build();
		Node node = application.retrieveNodesByName("us.node.ovh", false).execute().get(0);
		Location location = node.retrieveLocation().execute();
		System.out.println(location.getDescription());

	}
}
