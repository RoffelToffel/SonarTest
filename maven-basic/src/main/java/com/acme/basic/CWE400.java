package com.acme.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CWE400 {

	public static void main(String[] args) throws Exception {
		URL url = new URL(args[0]);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String inputLine;
		List<String> response = new ArrayList<String>();
		while ((inputLine = in.readLine()) != null) {
			response.add(inputLine);
		}
		in.close();

		for (String line : response) {
			// Do something with the response
		}
	}
}
