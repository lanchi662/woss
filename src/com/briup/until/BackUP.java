package com.briup.until;
/**
 * BackUP�ӿ��ṩ�˲ɼ�ϵͳ����ģ��ķ�����
 * 
 * @author briup
 * @version 1.0 2010-9-14
 *
 */
public interface BackUP{
	/**
	 * �ڱ�������ʱ����ԭ���ļ��Ļ����Ͻ���׷�ӡ�
	 */
	boolean STORE_APPEND = true;
	/**
	 * �ڱ�������ʱ������ԭ�����ļ���
	 */
	boolean STORE_OVERRIDE = false;
	/**
	 * �ڶ�ȡ����ͬʱ��ɾ�������ļ���
	 */
	boolean LOAD_REMOVE = true;
	/**
	 * �ڶ�ȡ����ͬʱ�����������ļ���
	 */
	boolean LOAD_UNREMOVE = false;
//	public void store(Collection<BIDR>  c) throws Exception;
	/**
	 * ͨ���������洢���ݡ�
	 * @param key �������ݵļ�
	 * @param data ��Ҫ���ݵ�����
	 * @param flag �����ֵ�Ѿ��������ݣ�׷�ӻ��Ǹ���֮ǰ�����ݡ�����ʹ�ó���ֵ��
	 */
	public void store(String key,Object data,boolean flag) throws Exception;
   //public Collection<BIDR> load()throws Exception;
	/**
	 * ͨ��������ȡ�Ѿ����ݵ�����
	 * @param key �������ݵļ�
	 * @param flag ȡ����������ʱ���Ƿ������ݡ�����ʹ�ó���ֵ��
	 */
	public Object load(String key,boolean flag)throws Exception;
}
