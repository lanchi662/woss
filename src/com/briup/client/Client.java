package com.briup.client;

import java.util.Collection;
import com.briup.until.BIDR;
/**
 * Client�ӿ��ǲɼ�ϵͳ����ģ��ͻ��˵Ĺ淶��
 * Client�����þ�����������˽���ͨ�ţ��������ݡ�
 * @author briup
 * @version 1.0 2010-9-14
 *
 */
public interface Client{
	/**
	 * send����������������˽��н���������BIDR�������������ˡ�
	 * @param collection
	 */
	public void send(Collection<BIDR> collection) throws Exception;
}