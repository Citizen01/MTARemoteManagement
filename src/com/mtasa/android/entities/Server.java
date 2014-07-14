package com.mtasa.android.entities;

public class Server {
	private int id;
	private String name;
	private String ip;
	private int port;
	private String password;
	private int playerCount;
	private String gamemode;
	private String version;

	public Server() {

	}

	public Server(int id, String name, String ip, int port, String password,
			int playerCount, String gamemode, String version) {
		super();
		this.id = id;
		this.name = name;
		this.ip = ip;
		this.port = port;
		this.password = password;
		this.playerCount = playerCount;
		this.gamemode = gamemode;
		this.version = version;
	}


	/// GETTERS & SETTERS ///
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPlayerCount() {
		return this.playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getGamemode() {
		return this.gamemode;
	}

	public void setGamemode(String gamemode) {
		this.gamemode = gamemode;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
