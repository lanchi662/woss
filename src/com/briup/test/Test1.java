package com.briup.test;

import com.briup.until.BackUP;
import com.briup.until.BackUpImpl;

public class Test1 {
	  public static void main(String[] args) {
		String  str  ="hello";
		BackUpImpl  impl  =
				new BackUpImpl();
		try {
			
			impl.store("test.txt", str,BackUP.STORE_OVERRIDE );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  //获取备份的信息
		try {
			Object  o  =impl.load("test.txt", true);
		    System.out.println(o);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
