package com.vickllny.eureka.client.utils;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {
 
    private ApplicationContext context = null;
 
    /* (non Javadoc)
     * @Title: setApplicationContext
     * @Description: spring获取bean工具类
     * @param applicationContext
     * @throws BeansException
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.context = applicationContext;
    }
 
    @SuppressWarnings("unchecked")
	public  <T> T getBean(String beanName) {
        return (T) context.getBean(beanName);
    }
 
    public String getMessage(String key) {
        return context.getMessage(key, null, Locale.getDefault());
    }
 
    public String getActiveProfile() {
        return context.getEnvironment().getActiveProfiles()[0];
    }
}
