package com.Muhib.Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args)throws Exception {
		
		
		ServerSocket socket = new ServerSocket(5656);
		Socket s= socket.accept();
		DataInputStream dIn = new DataInputStream(s.getInputStream());
		DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		String str1 = " ";
		while(!str.equals("leave")){
			
			str = dIn.readUTF();
			System.out.println("Client Massage: "+str);
			System.out.print("Enter Your Massage: ");
			str1 = br.readLine();
			dOut.writeUTF(str1);
			dOut.flush();
			
		}
		
		dIn.close();
		socket.close();
		s.close();
	}

}
