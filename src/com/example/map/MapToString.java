package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapToString {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		String consumerkey = "lkajdsgjnasdjkgnlasdg";
		String consumersecret = "ssifjghlkjiughlakjsdgf";
		String methodsignature = "HMAC-SHA1";
		String timestamp = "1683735751";
		String nonce = "CTZgoyWvXS3";
		String version = "1.0";
		map.put("consumer-key", "\\\""+consumerkey+"\\\"");
		map.put("consumer-secret", "\\\""+consumersecret+"\\\"");
		map.put("oauth_signature_method", "\\\""+methodsignature+"\\\"");
		map.put("oauth_timestamp", "\\\""+timestamp+"\\\"");
		map.put("oauth_nonce", "\\\""+nonce+"\\\"");
		map.put("oauth_version", "\\\""+version+"\\\"");
		
		String s = map.toString().replace("{", "").replace("}", "");
		
		
		System.out.println(s);
		
		
		
		

	}

}
