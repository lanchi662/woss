package com.briup.test;

import java.util.Collection;

import com.briup.client.impl.ClientImpl;
import com.briup.client.impl.GatherImpl;
import com.briup.until.BIDR;

public class ClientStart {

	public static void main(String[] args) {
		GatherImpl  gather=new GatherImpl();
		try {
			Collection<BIDR> collention =gather.gather();
			ClientImpl impl=new ClientImpl();
			impl.send(collention);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    System.out.println("³ö´í");	
		}
        
	}

}
