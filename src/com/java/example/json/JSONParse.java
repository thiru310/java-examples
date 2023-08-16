package com.java.example.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;



public class JSONParse {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\tpurusot\\Downloads\\json-example.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String str ;
		StringBuffer response = new StringBuffer();
		while((str = br.readLine()) != null) {
			response.append(str);
		}
		System.out.println("response ***** >> "+response.toString());
		
		JSONObject jsonobj = new JSONObject(response.toString());
		JSONObject dataObj = (JSONObject) jsonobj.get("data");
		System.out.println(dataObj.toString());
		System.out.println("reporting_periods****** "+dataObj.get("reporting_periods"));
		System.out.println("createdAt ****** "+dataObj.get("createdAt"));
		System.out.println("companyID ******** "+dataObj.get("companyID"));
		System.out.println("employerCheckID**********"+dataObj.get("employerCheckID"));
		System.out.println("totals**********"+dataObj.get("totals"));
		System.out.println("status**********"+dataObj.get("status"));
		System.out.println("employee_checks**********"+dataObj.get("employee_checks"));
		JSONArray empCheckArr = (JSONArray) dataObj.get("employee_checks");
		System.out.println(empCheckArr.get(0));
		
		
		
	}

}
