package com.briup.server;

import java.util.Collection;

import com.briup.until.BIDR;

/**
 * DBStore�ṩ�����ģ��Ĺ淶��
 * �ýӿڵ�ʵ���ཫBIDR���ϳ־û���
 * @author briup
 * @version 1.0 2010-9-14
 */
public interface DBStore {
	/**
	 * ��BIDR���Ͻ��г־û� ��
	 * @param collection ��Ҫ�����BIDR����
	 */
    public void saveToDB(Collection<BIDR> collection)throws Exception;
}
