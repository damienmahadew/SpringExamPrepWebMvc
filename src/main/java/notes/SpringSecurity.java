/**
 * Created by DAMIEN6 on 23/10/2016.
 */
package notes;

/**
 * Spring security
 *
 *  Security concepts
 *      Principal - user, device or system that performs an action
 *      Authentication - establishing that a principals credentials are valid
 *      Authorization - deciding if a principal is allowed to perform an action
 *      Secured item - resource that is being secured
 *
 *  Authentication
 *      There are many
 *          - basic, digest, form, X.509
 *      There are many storage options for credential and authority information
 *          -LDAP, database, in memory
 *   Authorization
 *      Depends on authentication
 *          - before deciding if a user can perform an action, identity must be established
 *          - decision process is often based on rols
 *              e.g. ADMIN, MEMBER, GUEST
 *
 *   Motivations of Spring Security
 *      Portable across containers
 *          Secured archive(war, ear) can be deployed as is
 *          also runs in standalone environments
 *          uses spring for configuration
 *      Separation of concerns
 *          business logic is decouple from security concerns
 *          authentication and authorization is decoupled
 *              changes to the authentication process have no impact on authorization
 *      Flexibility
 *          Supports all common authentication mechanisms
 *              Basic, Form, X.509, Single-Sign-On
 *          Configurable storage options
 *              DB, LDAP, properties file
 *      Extensible
 *          All the following can be customized
 *              how a principal is defined
 *              how authorization decisions are made
 *              where security constraints are stored
 *    Consistency of approach
 *      Goal of authentication is always the same
 *          establish a security context with the authenticated principals information
 *          out of the box - works for web applications
 *      Process of authorization is always the same regardless of resource type
 *          Consult the attributes of the secured resource
 *          obtain principal information from security context
 *          grant or deny access
 *
 *   Spring security the big picture - look at page 336
 *
 *   Spring security - configuration - see {@link config.SpringSecurityConfig}
 *
 *   Configure authentication
 *      DAO Authentication provide is default
 *          Expects a UserDetailsService implementation to provide credentials and authorities
 *              Built-in:in memory(properties), JDBC(database), LDAP
 *              Custom
 *     Or define your own authentication provider
 *      e.g. to get pre-authenticated user details when using single-sign on (one set of username and password for multiple apps)
 *          CAS, TAM, SiteMinder
 *      see online examples
 *
 *   Authentication Provider
 *      Use a UserDetailsManagerConfigurer
 *          -Three built in operations
 *              LDAP
 *              JDBC
 *              In memory
 *          -Or use your own UserDetailsService
 *      See {@link config.SpringSecurityConfig} for example of in memory
 *
 *   Using a database:
 *      Queries RDMBS for users and their authorities
 *          -Provides default queries
 *              -Select username, password, enabled from users where username =?
 *              -Select username, authority from authorities where username = ?
 *          -Groups also supported
 *              -groups, ,group_members, group_authorities tables
 *              -see online for more info
 *          -advantage
 *              can modify user info while system is running
 *
 *  Other authentication options
 *      - Implement a custom UserDetailsService
 *          -delegate to an existing User repository or DAO
 *      -LDAP
 *      -X.509 Certificates
 *      -JAAS Login Module
 *      -Single Sign-on
 *          OAuth
 *          SAML
 *          SiteMinder
 *          Kerberos
 *          JA-SIG Central Authentication Service
 *
 *  **May add profile("dev") to separate users
 *
 *  Method security
 *      Spring security uses AOP for security at the method level
 *          -annotations based on spring annotations or JSR-250
 *          -java configuration to activate detection of annotations
 *      Typically secure your services
 *          -do not access repositories directly, bypasses security(and transactions)
 *
 *   TODO- Spring security advanced topics pages 349 - 354
 */