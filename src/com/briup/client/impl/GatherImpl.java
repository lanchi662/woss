package com.briup.client.impl;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.briup.client.Gather;
import com.briup.until.BIDR;
import com.briup.until.BackUP;
import com.briup.until.BackUpImpl;

public  class GatherImpl implements Gather {
	private long num;
	BackUpImpl impl=new BackUpImpl();

	@Override
	public Collection<BIDR> gather() throws Exception {
		FileInputStream fr=new FileInputStream("src/com/briup/file/radwtmp");
		InputStreamReader read=new InputStreamReader(fr);
		BufferedReader buff=new BufferedReader(read);
		String str=null;
		Map<String,BIDR>map=new HashMap<String,BIDR>();
		Collection<BIDR>  li=new ArrayList<BIDR>();
		Object o=impl.load("num.txt",true);
		if(o!=null){
			num=(long) o;
		}
		Object oldMap =impl.load("map.txt", BackUP.LOAD_REMOVE);
		if(oldMap!=null){
		  Map<String,BIDR>	oldMap1=(Map<String, BIDR>) oldMap;
		  map.putAll(oldMap1);
		}
		  buff.skip(num);
		while((str=buff.readLine())!=null){
			String[] str1=str.split("[|]");
		    String login_name=str1[0];
		    String nas_ip=str1[1];
		    String state=str1[2];		    
		    String logindate=str1[3];
		    int state1=Integer.parseInt(state);
		    String ip=str1[4];
		    Timestamp time=new Timestamp(state1*1000);
		    if(state.equals("7")){
		    	 BIDR bidr  = new BIDR();
				 bidr.setAAA_login_name(login_name.substring(1));
			     bidr.setLogin_ip(ip);
			     bidr.setNAS_ip(nas_ip);
			     bidr.setLogin_date(time);
			     map.put(bidr.getLogin_ip(), bidr); 			     	
		    }else{
				BIDR  bidr =  map.get(ip);
				Timestamp  time_out=new Timestamp(state1*1000);
				bidr.setLogin_date(time_out);
				int   up =(int) bidr.getLogin_date().getTime();
				int down =(int) time_out.getTime();
				int duration=(int)((down-up)/(1000*60));
				bidr.setTime_deration(duration);
				li.add(bidr);
				map.remove(ip);	    	
		    }			
		}
		impl.store("num.txt", num, BackUP.STORE_OVERRIDE);
		System.out.println("文件备份成功");
		impl.store("map.txt", map, BackUP.STORE_OVERRIDE);
		
		return li; 
	}
   
}
