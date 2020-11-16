package diniath.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class DispatcherServletIniatilizer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class [] configClasses = {MyWebAppConfig.class};
        return configClasses;}

    @Override
    protected String[] getServletMappings() {
        String [] urlMappings = {"/"};
        return new String []{"/"};}
    
}
