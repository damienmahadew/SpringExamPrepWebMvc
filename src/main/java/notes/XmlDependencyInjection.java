/**
 * Created by DAMIEN6 on 02/11/2016.
 */
package notes;

/**
 * Advanced xml bean instantiation
 *  how can spring instantiate the ffg?
 *      classes with private constructors(e.g. singleton)
 *      objects from factories
 *
 *  Four techniques
 *      @Bean method in @Configuration class
 *          100% java code, write whatever code you need
 *      Use XML factory-method attribute for singletons
 *      define your own factories as Spring beans in XML
 *      use beans that implements springs FactoryBean interface
 *          instantiation logic coded within FactoryBean
 *          Spring auto detects FactoryBean implementations
 *
 *  Factory method attribute
 *      non-intrusive
 *          useful for existing singletons or factories
 *
 *      see advanced-xml-config.xml
 *
 *  Using your own factories
 *      Spring allows one bean to create another
 *          craete an instance of your factory as a bean
 *          use it to create another bean
 *
 *      see advanced-xml-config.xml
 *
 * The FactoryBean interface
 *  Beans implementing FactoryBean are auto detected
 *  dependency injection using the factory bean id causes getObject() to be invoked transparently
 *
 *
 * Typical example is EmbeddedDatabaseFactoryBean
 *
 * FactoryBeans in spring
 *  FactoryBeans are widely used within spring
 *      embeddeddatabasefactorybean
 *      JndiObjectFactoryBean
 *      FactoryBeans for creating remoting proxies
 *      FactoryBeans for configuring data access technologies like JPA, Hibernate or MyBatis
 *
 *
 * c and p namespace
 * see c-and-p-namespace.xml
 *
 *  Pros and cons
 *      Pros
 *          More concise
 *          well supported in STS CNTRL + space works well
 *      Cons
 *          Less widely known than the usual XML
 *
 * Bean definition inheritence
 *  Sometimes several beans need to be configured in the same way
 *  use bean definition inheritance to define the common configuration once
 *      inherit it where needed
 *
 *      see bean-inheritance-config.xml
 *
 *  Inheritance for service and repository beans
 *      inheritance often used for definition of Repository (DAO) beans and less often Services
 *
 *  Inner beans
 *      only visible from surrounding bean
 *      cannot be accessed from the application context
 *      Not in scope outside of the beans
 *      You may have multiple levels of inner beans
 *
 *  Pros
 *      you only expose what needs to be exposed
 *      very commonly used technique in online examples
 *  Cons
 *      can be harder to read
 *      avoid really deep nesting
 *
 *  General recommendation
 *      use them when it makes sense
 *          as for inner classes in java
 *          complex "infrastructure beans" config
 *
 *  Did not do advanced topics - page 420
 *
 */