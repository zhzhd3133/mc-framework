package com.zzd.mmc.core.dbtest.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;

/**
 * Created by master on 2017/4/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:conf/spring/applicationContext-*.xml")
public class SpringTest extends AbstractJUnit4SpringContextTests {

    protected <T> T getBean(Class<T> type){
        return applicationContext.getBean(type);
    }
    public Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    public ApplicationContext getContext(){
        return applicationContext;
    }

}
