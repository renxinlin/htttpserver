package com.renxl.server;
import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 * @author renxl
 *
 */
public class ServletContext {
	/**
	 * 存储servlet以及servlet的别名
	 */
	private Map<String,String> servlet ;

	/**
	 * 存储url以及servlet对应的别名
	 */
    private Map<String,String> mapping;
    
    ServletContext(){
        servlet =new HashMap<String,String>();
        mapping =new HashMap<String,String>();
    }
    
    
    public Map<String, String> getServlet() {
        return servlet;
    }
    public void setServlet(Map<String, String> servlet) {
        this.servlet = servlet;
    }
    public Map<String, String> getMapping() {
        return mapping;
    }
    public void setMapping(Map<String, String> mapping) {
        this.mapping = mapping;
    }
    
    
    
    
}

