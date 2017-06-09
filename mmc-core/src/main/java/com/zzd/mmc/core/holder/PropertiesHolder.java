package com.zzd.mmc.core.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import java.util.*;

/**
 * Created by master-pc on 2017/4/5.
 */
public class PropertiesHolder extends PropertyPlaceholderConfigurer {
     Logger log = LoggerFactory.getLogger(PropertiesHolder.class);
    private static  Properties appProperties;
    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        Set<Map.Entry<Object,Object>> set = props.entrySet();
        log.info("Properties ::: 读取配置信息如下（KEY == VALUE）"  );
        Iterator<Map.Entry<Object, Object>> it = set.iterator();
        while(it.hasNext()) {
            Map.Entry<Object, Object> enter = it.next();
            if(log.isDebugEnabled()){
                log.debug("Entry ::: " + enter.getKey() + " == " + enter.getValue());
            }
        }
        appProperties= props;
    }

    public static String getProperty(String key){
        return appProperties.getProperty(key);
    }

}
