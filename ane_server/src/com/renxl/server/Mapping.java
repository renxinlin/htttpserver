package com.renxl.server;
import java.util.ArrayList;
import java.util.List;
 

/**
 * 路径映射容器
 * @author renxl
 *
 */
public class Mapping {
    private String name;
    private List<String> urlPattern;
    
    public Mapping(){
        urlPattern =new ArrayList<String>();
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getUrlPattern() {
        return urlPattern;
    }
    public void setUrlPattern(List<String> urlPattern) {
        this.urlPattern = urlPattern;
    }
    
    
    
}

