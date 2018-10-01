package com.briup.server.impl;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;

import com.briup.server.DBStore;
import com.briup.server.Server;
import com.briup.until.BIDR;
public class ServerImpl implements Server {
    private DBStore impl=new DBStoreImpl();
	@Override
	public void revicer() throws Exception {
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		InputStream in=socket.getInputStream();
		ObjectInputStream obj=new ObjectInputStream(in);
		Collection<BIDR> coll=(Collection<BIDR>)obj.readObject();
		System.out.println(coll.size());
		obj.close();
		in.close();
		socket.close();
		impl.saveToDB(coll);
		
		
		
		
	}

}
