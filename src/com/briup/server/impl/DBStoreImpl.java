package com.briup.server.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Collection;
import com.briup.server.DBStore;
import com.briup.until.BIDR;
public class DBStoreImpl implements DBStore{
	

	@Override
	public void saveToDB(Collection<BIDR> collection) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String user="jdbc:oracle:thin:@localhost:1521:xe";
	String username="java";
	String pass="1617700146";
	Connection conn=DriverManager.getConnection(user,username,pass);
	String sql="insert into t_detail values(?,?,?,?,?,?)";
	PreparedStatement ps=conn.prepareStatement(sql);
	conn.setAutoCommit(false);
	int num=0;
	for(BIDR bidr:collection){
		String lg_name=bidr.getAAA_login_name();
		String nas_ip=bidr.getNAS_ip();
		Timestamp login_time=bidr.getLogin_date();
		Timestamp logout_time=bidr.getLogout_date();
		int time=bidr.getTime_deration();
		String login_ip=bidr.getLogin_ip();
		ps.setString(1, lg_name);
		ps.setString(2, nas_ip);
		ps.setTimestamp(3, login_time);
		ps.setTimestamp(4, login_time);
		ps.setString(5, nas_ip);
		ps.setInt(6, time);
		ps.addBatch();
		num++;
		if(num%1000==0||collection.size()==num){
			//System.out.println(num);
			ps.executeBatch();
		}
	
	}
	ps.close();
	conn.commit();
	conn.close();
	
		
		
	}
	

}
