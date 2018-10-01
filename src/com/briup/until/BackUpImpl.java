package com.briup.until;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.briup.until.BackUP;;

public class BackUpImpl implements BackUP{
    String path="src/com/briup/file";
	@Override
	public void store(String key, Object data, boolean flag) throws Exception {
		File ff=new File(path,key);
		if(!ff.exists()){
			ff.createNewFile();
			
		}
		FileOutputStream out =new FileOutputStream(ff,flag);
		ObjectOutputStream ous=new ObjectOutputStream(out);
		ous.writeObject(data);
		ous.close();
		out.close();
		System.out.println("数据已经备份成功");
		
	}
	@Override
	public Object load(String key, boolean flag) throws Exception {
		File ff=new File(path,key);
		if(!ff.exists()){
			return null;
		}
		FileInputStream ins=new FileInputStream(ff);
		ObjectInputStream obj1=new ObjectInputStream(ins);
		Object ob=obj1.readObject();
		if(flag){
			ff.delete();
			
		}
		System.out.println("数据对象已经准备完毕");
		return ob;
	}
}
