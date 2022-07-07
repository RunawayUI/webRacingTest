package configuration;

import java.util.EnumSet;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionTrackingMode;



import filter.ApplicationFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import component.impl.ApplicationListener;

public class RacingWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {
        WebApplicationContext ctx = createWebApplicationContext(container);

        container.setSessionTrackingModes(EnumSet.of(SessionTrackingMode.COOKIE));


        registerFilters(container, ctx);
        registerSpringMVCDispatcherServlet(container, ctx);
    }

    private WebApplicationContext createWebApplicationContext(ServletContext container) {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.scan("configuration");
        ctx.setServletContext(container);
        ctx.refresh();
        return ctx;
    }

    private void registerFilters(ServletContext container, WebApplicationContext ctx) {
        registerFilter(container, ctx.getBean(ApplicationFilter.class));
        registerFilter(container, new CharacterEncodingFilter("UTF-8", true));


          }

    private void registerFilter(ServletContext container, Filter filter, String... filterNames) {
        String filterName = filterNames.length > 0 ? filterNames[0] : filter.getClass().getSimpleName();
        container.addFilter(filterName, filter).addMappingForUrlPatterns(null, true, "/*");
    }


    private void registerSpringMVCDispatcherServlet(ServletContext container, WebApplicationContext ctx) {
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }





    }