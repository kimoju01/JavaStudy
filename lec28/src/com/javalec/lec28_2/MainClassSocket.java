package com.javalec.lec28_2;

import java.io.IOException;
import java.net.Socket;

public class MainClassSocket {
	
	public static void main(String[] args) {
		
		Socket socket = null;	//��Ʈ��ũ ���� ��ġ(����) ����� ��Ʈ��ȣ�� �����ϸ� ��
		
		try {
			socket = new Socket("localhost", 9000); //127.0.0.1
			System.out.println("���� ����");
			System.out.println("socket : " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}