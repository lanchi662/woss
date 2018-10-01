package com.briup.client;

import java.util.Collection;
import com.briup.until.BIDR;
/**
 * Client接口是采集系统网络模块客户端的规范。
 * Client的作用就是与服务器端进行通信，传递数据。
 * @author briup
 * @version 1.0 2010-9-14
 *
 */
public interface Client{
	/**
	 * send方法用于与服务器端进行交互，发送BIDR集合至服务器端。
	 * @param collection
	 */
	public void send(Collection<BIDR> collection) throws Exception;
}