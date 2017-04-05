package com.zzd.mmc.core.holder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * Created by master-pc on 2017/4/5.
 */
public class PropertiesHolder extends PropertyPlaceholderConfigurer {
    private static  Properties appProperties;
    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        System.out.println("fsdfsdfsdfsdfsd");
        appProperties= props;
    }

    public static String getProperty(String key){
        return appProperties.getProperty(key);
    }

}
