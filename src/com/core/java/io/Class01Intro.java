package com.core.java.io;

import java.io.*;

public class Class01Intro {

	public static void main(String[] args) throws IOException {
		/*DataOutputStream dataOutputStream = null;
		try{
			dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("class01Intro.txt")));
			for (int i = 0; i < 132; i++) {
				dataOutputStream.writeDouble(3.14159);
			}
		}catch(IOException e){
			try {
				if(dataOutputStream!=null)
				dataOutputStream.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}*/
		
		DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(
		        "class01Intro.txt")));
		    out2.writeDouble(3.14159);
		    out2.writeUTF("Square root of 2");
		    out2.close();
		
	}
	
}
