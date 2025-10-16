package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("demofile.txt"));
		DataInputStream dis = new DataInputStream(new FileInputStream("demofile.txt"))){
				dos.writeDouble(3173.8);
				dos.writeInt(2);
				dos.writeUTF("Pratik");
				System.out.println("Read the Data");
				double num = dis.readDouble();
				int num1 = dis.readInt();
				String nm = dis.readUTF();
				System.out.println(num+"===="+num1+"===="+nm);
			}catch(IOException e) {
				e.printStackTrace();
		}
	}

}
