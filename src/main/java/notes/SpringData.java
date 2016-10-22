/**
 * Created by DAMIEN6 on 22/10/2016.
 */
package notes;

/**
 * Spring Data
 *      Reduces boiler plate code for data access
 *          Works in many environments
 *
 *  Core project - Spring data
 *      Sub projects - JPA, Pivotal Gemfire, MongoDb etc...
 *
 *  Instant repositories
 *      How?
 *          Annotate domain classes
 *              Define keys and enable persistence
 *          Define your repositories as an interface
 *      Spring will implement it at run time
 *          Scans for interfaces extending Springs Repository<k, T>
 *          CRUD methods auto generated
 *          Paging, custom queries and sorting supported
 *          Variations exist for most Spring data sub projects
 *
 *  Spring Data provides similar annotations to JPA
 *      -@Document (Mongo), @Region (Gemfire), @NodeEntity(Neo4j)
 *  Templates (like JDBC) for basic crud access
 *      - MongoTemplate, GemfireTemplate, RedisTemplate
 *
 *
 *  ** Spring creates a proxy of the interface after startup -- does some magic
 *
 *  Just Autowire repositories once created
 *
 *  Summary
 *      Use 100% JPA to define entities and access data
 *          Spring data repositories need no code
 *      Use spring to configre JPA entity manager factory
 *          Smart proxy works with spring driven transactions
 *          optional translation to DataAccessExceptions
 *
 *  In order to use Spring Data, you need to setup your data source
 *  e.g. Using Spring JPA
 *      -
 */