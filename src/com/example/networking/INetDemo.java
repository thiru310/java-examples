package com.example.networking;

import java.io.*;
import java.net.*;

public class INetDemo {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.javatpoint.com");
			InetAddress ip1 = InetAddress.getByName("app.pluralsight.com");

			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
			System.out.println("Host Name: " + ip1.getHostName());
			System.out.println("IP Address: " + ip1.getHostAddress());
			System.out.println("IP Address Port :: "+ip1.getCanonicalHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}