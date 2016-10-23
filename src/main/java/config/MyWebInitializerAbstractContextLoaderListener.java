package config;

//import org.springframework.web.context.AbstractContextLoaderInitializer;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */

//Different to AbstractAnnotationConfigDispatcherServlet - this is a super class and requires more configuration
//public class MyWebInitializerAbstractContextLoaderListener extends AbstractContextLoaderInitializer {
//
//    //This requires more configuration -- the application starts up but does not work as expected
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(RootConfig.class);
//        context.register(MvcConfig.class);
//        return context;
//    }
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//        //The line below is to configure your own Http Servlet
////        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("SpringExamPrepWebMvc", new SpringExamPrepWebMvcHttpServlet()));
//        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("SpringExamPrepWebMvc", new DispatcherServlet());
//        servletRegistration.setLoadOnStartup(1);
//        servletRegistration.addMapping("/");
//
//    }
//}
