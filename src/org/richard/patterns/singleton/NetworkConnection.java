package org.richard.patterns.singleton;

public class NetworkConnection {

	private static NetworkConnection instance;
	
	private NetworkConnection() {}
	
	public static NetworkConnection getInstance() {
		if(instance == null)
			instance = new NetworkConnection();
		return instance;
	}
	
}