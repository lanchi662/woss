package com.briup.until;

import java.io.Serializable;
import java.sql.Timestamp;
/**
 * BIDR��ʾһ���û���һ�ε�������¼��
 * ���������û��ĵ�¼���������IP������ʱ�䡢����ʱ�䡢����ʱ����NAS��IP��
 * 
 * @author briup
 * @version 1.0 2010-9-14
 *
 */
public class BIDR implements Serializable{
	private static final long serialVersionUID = -4446311230799073644L;
	/**
	 * �û��ĵ�¼��
	 */
	private String AAA_login_name;
	/**
	 * �û�ĳ������ʱ�������IP��ַ
	 */
	private String login_ip;
	/**
	 * �û�����������ʱ��
	 */
	private Timestamp login_date;
	/**
	 * �û�����������ʱ��
	 */
	private Timestamp logout_date;
	/**
	 * �û�������ʹ�õ�NAS��������IP��ַ
	 */
	private String NAS_ip;
	/**
	 * �û������������ۼ�ʱ��
	 */
	private Integer time_deration;
	public BIDR() {}

	public BIDR(String aaa_login_name, String login_ip, Timestamp login_date,
			Timestamp logout_date, String nas_ip, Integer time_deration) {
		AAA_login_name = aaa_login_name;
		this.login_ip = login_ip;
		this.login_date = login_date;
		this.logout_date = logout_date;
		NAS_ip = nas_ip;
		this.time_deration = time_deration;
	}

	public String getAAA_login_name() {
		return AAA_login_name;
	}

	public void setAAA_login_name(String aAA_login_name) {
		AAA_login_name = aAA_login_name;
	}

	public String getLogin_ip() {
		return login_ip;
	}

	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}

	public Timestamp getLogin_date() {
		return login_date;
	}

	public void setLogin_date(Timestamp login_date) {
		this.login_date = login_date;
	}

	public Timestamp getLogout_date() {
		return logout_date;
	}

	public void setLogout_date(Timestamp logout_date) {
		this.logout_date = logout_date;
	}

	public String getNAS_ip() {
		return NAS_ip;
	}

	public void setNAS_ip(String nAS_ip) {
		NAS_ip = nAS_ip;
	}

	public Integer getTime_deration() {
		return time_deration;
	}

	public void setTime_deration(Integer time_deration) {
		this.time_deration = time_deration;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BIDR [AAA_login_name=" + AAA_login_name + ", login_ip="
				+ login_ip + ", login_date=" + login_date + ", logout_date="
				+ logout_date + ", NAS_ip=" + NAS_ip + ", time_deration="
				+ time_deration + "]";
	}
	
}
