package com.ysc.test.spring.lookup;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LookUpCase {

	@Test
	public void lookUpCase() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring1/application.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath*:spring/application.xml");
		//classpath*:
		// print: false
		if (context.getBean("hpDao") == context.getBean("hpDao")) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}

		// print: true
		if (context.getBean("hpService") == context.getBean("hpService")) {
			System.out.println(true);

		} else {
			System.out.println(false);
		}
	}
	
	/*@Test
	public void testLookupMethod() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		DAOFactory daoFactory1 = ctx.getBean("dbDAOFactory", DAOFactory.class);
		Assert.assertSame(daoFactory1.getDAO(), ctx.getBean("dbDAO", AppDAO.class));
		Assert.assertEquals(daoFactory1.getDAO().save("Student"), "Student updated to DB");

		DAOFactory daoFactory2 = ctx.getBean("fileDAOFactory", DAOFactory.class);
		Assert.assertSame(daoFactory2.getDAO(), ctx.getBean("fileDAO", AppDAO.class));
		Assert.assertEquals(daoFactory2.getDAO().save("Student"), "Student saved to File");
    }

	@Test
	public void testMethodReplace() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		DAOFactory daoFactory1 = ctx.getBean("dbDAOFactoryMR", DAOFactory.class);
		Assert.assertSame(daoFactory1.getDAO(), ctx.getBean("dbDAOMR", AppDAO.class));
		Assert.assertEquals(daoFactory1.getDAO().save("Student"), "Student updated to DB (MR)");

		DAOFactory daoFactory2 = ctx.getBean("fileDAOFactoryMR", DAOFactory.class);
		Assert.assertSame(daoFactory2.getDAO(), ctx.getBean("fileDAOMR", AppDAO.class));
		Assert.assertEquals(daoFactory2.getDAO().save("Student"), "Student saved to File (MR)");
    }*/
}
