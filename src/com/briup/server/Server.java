package   com.briup.server;
/**
 * Server�ӿ��ṩ�˲ɼ�ϵͳ����ģ��������˵ı�׼��
 * Server��ʵ������Ҫʵ����ɼ���ͳ�ͻ��˽��н�����������DBStore�����յ����ݳ־û���
 * ��Server��ʵ����ִ��revicer()����ʱ��Server��ʼ�����˿ڡ�
 * ������Server��shutdown����ʱ��Server����ȫ��ֹͣ����
 * @author briup
 * @version 1.0 2010-9-14
 *
 *
 */
public interface Server{
	/**
	 * �÷��������������Server���񣬿�ʼ���տͻ��˴��ݵ���Ϣ�����ҵ���DBStore�����յ����ݳ־û���
	 */
	public void revicer()throws Exception;
	
}

