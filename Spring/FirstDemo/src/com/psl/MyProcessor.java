package com.psl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization "+arg1);
		return arg0;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization"+arg1);
		return arg0;
	}

	

}
