package com.karan.runtime.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Shutdown {

	public static void main(String args[]) throws IOException {
		 
		 File f = new File("E:/STS-Servers/Tomcat V1/apache-tomcat-7.0.42/bin/catalina.bat stop");
		 
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
	
}
