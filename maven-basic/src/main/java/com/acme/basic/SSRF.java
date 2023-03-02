package com.acme.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class SSRF {

	public static void main(String[] args) throws IOException {
		String location = "https://www.example.com"; // Replace with your desired URL
		URL url = new URL(location);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// Do something with the connection, e.g. read the response.
		// ...
	}
}
