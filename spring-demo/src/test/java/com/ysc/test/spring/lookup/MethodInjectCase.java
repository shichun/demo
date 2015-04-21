package com.ysc.test.spring.lookup;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfl.samples.spring.methodinject.AppDAO;
import com.pfl.samples.spring.methodinject.DAOFactory;

public class MethodInjectCase {

	@Test
    public void testLookupMethod() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application.xml");
 
        DAOFactory daoFactory1 = ctx.getBean("dbDAOFactory", DAOFactory.class);
        Assert.assertSame(daoFactory1.getDAO(), ctx.getBean("dbDAO", AppDAO.class));
        Assert.assertEquals(daoFactory1.getDAO().save("Student"), "Student updated to DB");
 
        DAOFactory daoFactory2 = ctx.getBean("fileDAOFactory", DAOFactory.class);
        Assert.assertSame(daoFactory2.getDAO(), ctx.getBean("fileDAO", AppDAO.class));
        Assert.assertEquals(daoFactory2.getDAO().save("Student"), "Student saved to File");
    }
}
