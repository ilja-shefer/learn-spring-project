package de.shefer.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherSerlvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
    	System.out.println("1==========================");
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
    	System.out.println("2==========================");
        return new String[]{"/"};
    }
}