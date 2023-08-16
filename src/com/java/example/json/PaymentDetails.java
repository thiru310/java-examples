package com.java.example.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.http.client.config.RequestConfig;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PaymentDetails {
	private static RequestConfig requestConfig = RequestConfig.custom().build();

	public static void main(String[] args) throws Exception {			
		try {
			

//			URI url = new URI("https://api.sandbox.fortis.tech/v1/batches?filter[batch_close_ts]=today&filter[is_open]=0");			
			URL url = new URL("https://api.sandbox.fortis.tech/v1/batches?filter[is_open]=0&filter[batch_close_ts]=last%2030%20days");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Content-Type", "application/json");
	        conn.setRequestProperty("user-id", "11ed047a6e6c7d3aa5b105cc");
	        conn.setRequestProperty("user-api-key", "11ed9039855ad01496fe846a");
	        conn.setRequestProperty("developer-id", "eQE3RT9e");
	        	        
	        conn.setRequestMethod("GET");
	        

	               
	        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        String output;

	        StringBuffer response = new StringBuffer();
	        while ((output = in.readLine()) != null) {
	            response.append(output);
	        }
	        

	        in.close();
	        System.out.println("Response:-" + response.toString());
	        
	        
			ObjectMapper mapper = new ObjectMapper();
			BatchData batchData = mapper.readValue(response.toString(), BatchData.class);
			System.out.println(batchData.toString());
			
			Map<String, Double> map = new HashMap<String, Double>();
			
			for(BatchList list: batchData.getList()) {
				if(null != map && map.containsKey(list.getId())) {
					Double val = map.get(list.getId());
					map.put(list.getId(), val + list.getTotal_sale_amount());
				}else {
					map.put(list.getId(),list.getTotal_sale_amount());
				}
			}
			
			System.out.println("Map >> "+map.toString());
			System.out.println("Map size >> "+map.size());
			System.out.println("List size >> "+batchData.getList().size());
	        
		} catch (Exception e) {
			System.out.println("Exception in getPaymentDetails() :" + e);
		}
	}
}
