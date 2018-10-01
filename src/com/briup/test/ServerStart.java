package com.briup.test;

import com.briup.server.impl.ServerImpl;

public class ServerStart {

	public static void main(String[] args)  {
		ServerImpl server=new ServerImpl();
		try {
			server.revicer();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("∑¢ÀÕ“Ï≥£");
		}

	}

}
