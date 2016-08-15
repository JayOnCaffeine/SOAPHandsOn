package com.olympics;

public class Games {
	public String getGameList() {
		return "";
	}
	
	public String getGameInfo(final String gameName) {
		String gameInfo = null;
		if(gameName.equals("Archery")) {
			gameInfo = "<Game><name>Archery</name><info>Archery is the sport, practice "
					+ "or skill of using a bow to propel arrows.</info></Game>";
		} else if(gameName.equals("Athletics")) {
			gameInfo = "<Game><name>Athletics</name><info>Athletics is a collection "
					+ "of sporting events that involve competitive running, jumping, "
					+ "throwing, and walking.[</info></Game>";
		} else if(gameName.equals("Badminton")) {
			gameInfo = "<Game><name>Badminton</name><info>Badminton is a racquet sport "
					+ "played using racquets to hit a shuttlecock across a net.</info></Game>";
		} else if(gameName.equals("Boxing")) {
			gameInfo = "<Game><name>Boxing</name><info>Boxing is a martial art and combat sport "
					+ "in which two people wearing protective gloves throw punches at each other "
					+ "for a predetermined set of time in a boxing ring.</info></Game>";
		} else {
			gameInfo = "Game info not found";
		}
		return gameInfo;
	}
	
	public String getPlayerDetails(final String gameName) {
		return "";
	}
	
}
