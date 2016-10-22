/**
 * Created by DAMIEN6 on 22/10/2016.
 */
package notes;

/**
 Spring provides support on the web layer
    -Spring MVC and Spring Webflow

    -May use spring with any other java web framework
        -integration might be provided by spring or the other framework
        -spring also integrates with many of the common REST frameworks

 Effective web application architecture

    - Clients -(Remote HTTP interfaces)-> [JVM-{ [JavaEEServletContainer- {Web Layer - Application Layer (Spring} -JavaEEServletContainer] }-JVM-]

 Spring Application Context
    Spring can be initialized inside a webapp
        -startup business services, repositories, etc.
    Use standard servlet listener
        -initialization occurs before any servlets execute
        -application ready for user requests
        -applicationContext.close() is called when the application is stopped

 Spring Web
    -Spring MVC
        Web framework bundled with spring
    -Spring Webflow
        Plugs into Spring Mvc
        Implements navigation flows
    -Spring Mobile
        Routine between mobile/non - mobile versions of the site
    -Spring social
        Easy integration with Facebook, Twitter, etc..

 Spring Web MVC
    Springs web framework
        -Uses spring for its own configuration
        -Controllers are spring beans
        -testable artifacts
    Annotation based model since 2.5
    Builds on the Java Servlet API
    The core platform for developing web applications with spring
        -Higher level modules are build on this

 Spring Web Flow
    Plugs into MVC as a Controller technology
        Checks that users follow the right navigation path
        manages back button and multiple window issues
        provides scopes beyond request and session
            e.g. flow and flash
        addresses the double submit problem elegantly

 Spring Struts + JSF
// TODO - Add pages 271-272

 */