package com.atguigu.team.service;
/**
 * 
 * @description 自定义异常类
 * @author LinMu  Email:wmsorigin@126.com
 * @version 
 * @date 2021年1月25日 下午4:12:16
 *
 */
public class TeamException extends Exception{
	static final long serialVersionUID = -3387514229948L;
	
	public TeamException() {
		super();
	}
	
	public TeamException(String msg) {
		super(msg);
	}
}
