package com.briup.test;
import java.util.Collection;
import com.briup.client.impl.GatherImpl;
import com.briup.until.BIDR;
public class ClientTest {
  public static void main(String[] args) {
	GatherImpl  ga  = new GatherImpl();
	try {
		Collection<BIDR> coll  =ga.gather();
		System.out.println(coll.size());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

