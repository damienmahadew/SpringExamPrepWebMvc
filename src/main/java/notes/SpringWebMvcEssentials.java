package notes;

/**
 * Spring Web Mvc Essentials
 *
 * What is Spring Mvc
 *  Web framework based on the model/view/controller pattern
 *      Alternative to Struts1, Struts2, Tapestry, Wicket, JSF
 *
 *  Based on spring principles
 *      POJO programming
 *      Testable components
 *      Uses spring for configuration
 *  Supports a wide range of view technologies
 *      JSP, Thymeleaf, XSLT, PDF, Excel, Velocity, Freemarker etc..
 *
 *  Web Request Handling overview
 *      -Rather simple
 *          Based on incoming URL
 *          we need to call a mthod
 *          after which we return value (if any)
 *          needs to be rendered using a view
 *
 *      Request -> [Dispatcher Servlet] -> dispatch request -> [Controller]
 *      -> return with view name (and model if exists) -> [Dispatcher servlet]
 *      -> consults -> [View resolver] -> returns view -> [Dispatcher servlet]
 *      ->Renders view (passes model) -> [View] -> returns to servlet -> [Dispatcher servlet]
 *      -> returns response to user
 *
 *  Key Artifacts
 *      DispatcherServlet: heart of spring web mvc
 *          -A "front controller"
 *              coordinates all request handling activities
 *              analogous to strust actionservlet/jsf faces servlet
 *          -delegates to web infrastructure beans
 *          -invokes uer web components
 *          -fully customizable
 *              -interfaces for all infrastructure beans
 *              -many extension points
 *      Dispatcher servlet configuration
 *          -Defined in web.xml or WebApplicationInitializer
 *          -uses spring for its configuraion
 *              -programming to interfaces + dependency injection
 *              -easy to swap parts in and out
 *          -creates separate servlet application context
 *              -configuration is private to dispatcher servlet
 *          -full access to parent "root" context
 *              -instantiated via contextloaderlistener
 *                  -shared accross all servlets
 *
 *      Hierarchy
 *          ServletContainerInitializer - Servlet 3.0
 *              |
 *          SpringServletContainerInitializer - Springs implementation
 *              |
 *          WebApplicationInitializer - Base class for all Spring Mvc apps to implement without web.xml
 *              |
 *          AbstractContextLoaderInitializer - Sets up a context loader listener, you provide app context
 *              |
 *          AbstractAnnotationConfigDispatcherServletInitializer - Defines a dispatcher servlet, assumes java config, you provide root and app context
 *
 *     *** Servlet container after starting up
 *      Dispatcher Servlet Application Context
 *          Web layer context
 *              Controllers, views, resolvers
 *      Root application context
 *          Application layer context
 *              Business services, repositories etc
 *
 *    Url Based mapping rules
 *      -Mapping rules typically url based, optionally using wild cards
 *          -/login
 *          -/reward/{start}/{star}{star} --note this double **
 *
 *    Controller method parameters
 *      -Extremely flexible
 *      -You pick the parameters you need, spring provides them
 *          -HttpServletRequest, HttpSession, Principal
 *          -Model for sending data to the view
 *          -See Spring reference, Handler Methods
 *
 *     See {@link controllers.UserController} for examples on Controller methods including:
 *      - Get, Post, Put, Delete methods
 *      - Using requestparam, pathvariable values
 *      -
 *
 *  Views
 *      A view renders web output e.g. JSP's, XSLT, view support classes for PDF's etc
 *      controllers typically return a logical view name as a string
 *      viewResolvers select view based on name
 *  View Resolvers
 *      The dispather servlet delegates to a viewResolver to obtain a view implementation based on the view name
 *      default view resolver treats view names a s a web application-relative file path e.g. /WEB-INF/user/user.jsp
 *      Override the default location by registering a view resolver bean
 *      see {@link config.MvcConfig} for example
 *
 *  Quick start to developing a sprin mvc application
 *      1. Deploy a dispatcher servlet(one time only)
 *      2. Implement a controller
 *      3. Register the controller with the dispatcher servlet
 *      4. Implement the view
 *      5. Register the view resolver
 *      6. Deploy and test
 *
 *   See {@link config.MyWebInitializerAbstractAnnotationConfig} for info on setting up the dispatcher servlet with servlet 3 and higher
 *
 *   MVC Additions from Spring 3.0
 *      @MVC and legacy controllers enabled by default
 *          -Appropriate controller mapping and adapters registered out of the box
 *      New features not enable by defailt
 *          stateless converter framework for binding and formating
 *          support for JSR-303 declarative validation for forms
 *          httpmessageconverters(for restful web services)
 *   @EnableWebMvc see {@link config.MvcConfig}
 *      Registers your controller mapping/adapter for @MVC only
 *          You lose legacy default mappings and adapters
 *          enables custom conversion service and validators
 *          beyond scope!
 *
 *      You can extend {@link org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter}
 *      to override methods to define/customize web-beans
 */