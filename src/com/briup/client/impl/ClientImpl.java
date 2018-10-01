package com.briup.client.impl;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;

import com.briup.client.Client;
import com.briup.until.BIDR;

public class ClientImpl implements Client{

	@Override
	public void send(Collection<BIDR> collection) throws Exception {
		Socket socket=new Socket("127.0.0.1",9999);
		OutputStream out=socket.getOutputStream();
		ObjectOutputStream obj=new ObjectOutputStream(out);
		obj.writeObject(collection);
		obj.close();
		out.close();
	
	}

	
	}


