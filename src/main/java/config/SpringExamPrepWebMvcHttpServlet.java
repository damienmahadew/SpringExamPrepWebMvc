package config;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
public class SpringExamPrepWebMvcHttpServlet extends HttpServlet {

//    Since you arent allowed to access the application context before the servlet has been started up,
    //this way allows you to access the beans
    @Override
    public void init() throws ServletException {
        ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
//        String someBean = (String) context.getBean("someBean");
    }
}
