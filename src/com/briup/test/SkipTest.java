package com.briup.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SkipTest {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("src/com/briup/file/a.txt");
		BufferedReader buff=new BufferedReader(fr);
		int num=0;
		buff.skip(num);
		String str="";
		while((str=buff.readLine())!=null){
			num=num+str.length()+2;
			System.out.println(str);			
		}
		System.out.println(num);
		

	}

}
