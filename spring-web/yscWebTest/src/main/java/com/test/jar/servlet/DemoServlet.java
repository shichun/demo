package com.test.jar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用注解描述Servlet
 * @author Luxh
 */

/**
 * 注解WebServlet用来描述一个Servlet
 * 属性name描述Servlet的名字,可选
 * 属性urlPatterns定义访问的URL,或者使用属性value定义访问的URL.(定义访问的URL是必选属性)
 */
@WebServlet(name="AnnotationServlet",urlPatterns="/AnnotationServlet")
public class DemoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger LOG = LoggerFactory.getLogger(DemoServlet.class);

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        LOG.info("hello");
        PrintWriter out = response.getWriter();
        out.print("first servlet");
        out.flush();
        out.close();
        
    }
}
