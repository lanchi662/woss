package com.briup.client;
import java.util.Collection;
import com.briup.until.BIDR;
/**
 * Gather�ӿڹ涨�˲ɼ�ģ����Ӧ�еķ�����
 * ��Gatherִ��gather()����ʱ����ʼ��AAA�������ļƷ���Ϣ���вɼ���
 * ���ɼ������ݷ�װ��Ϊһ��BIDR�ļ��Ϸ��ء�
 * @author briup
 * @version 1.0 2010-9-14
 */
public interface Gather {
	/**
	 * �ɼ�AAA�������ļƷ���Ϣ�������ݷ�װΪBIDR���Ϸ��ء�
	 * @return �ɼ���װBIDR���ݵļ���
	 */
	public Collection<BIDR> gather()throws Exception;
}