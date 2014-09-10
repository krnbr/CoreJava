package com.karan.runtime.processor;

import java.io.*;
import java.util.*;

public class Builder {
	
	
	
	 public static void main(String args[]) throws IOException {
		 
		 File f = new File("E:/STS-Servers/Tomcat V1/apache-tomcat-7.0.42/bin/catalina.bat run");
		 
		 ProcessBuilder pb=new ProcessBuilder("cmd", "/c", f.getName());
		 pb.directory(f.getParentFile());
		 pb.redirectErrorStream(true);
		 Process process=pb.start();
		 
		 InputStream is = process.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(isr);
	        String line;
		 /*BufferedReader inStreamReader = new BufferedReader(
		     new InputStreamReader(process.getInputStream())); 

		 int i = 1;
		 while(inStreamReader.readLine() != null){
		     System.out.println(inStreamReader.readLine()+i);
		     i++;
		 }*/
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	        
	 }
	 
	 //D:\apache-tomcat-7.0.41\apache-tomcat-7.0.41\bin
}
