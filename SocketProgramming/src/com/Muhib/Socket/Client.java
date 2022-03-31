package com.Muhib.Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main(String[] args)throws Exception {
		
		Socket s = new Socket("localhost", 5555);
		DataInputStream dIn = new DataInputStream(s.getInputStream());
		DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = " ";
		String str1 = " ";
		
		while(!str.equals("leave")) {
			
			System.out.println("Enter your massage: ");
			str= br.readLine();
			dOut.writeUTF(str);
			dOut.flush();
			str1 = dIn.readUTF();
			System.out.println("Server Massage: "+str1);
			
		}
		dOut.close();
		s.close();
		
	}

}
