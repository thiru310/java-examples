package com.example.networking;

import java.net.*;

public class URLDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");

			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host Name: " + url.getHost());
			System.out.println("Port Number: " + url.getPort());
			System.out.println("File Name: " + url.getFile());
			System.out.println("Default Port :: "+url.getDefaultPort());
			System.out.println("Content :: "+url.getContent());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}