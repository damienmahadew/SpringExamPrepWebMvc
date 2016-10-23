package repositories;

import domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Repository
public interface UserCrudRepository extends CrudRepository<User, Long> {

    //You may add abstract methods to this interface provided they follow the convention:
    // findBy<DataMember><Op>
    //<Op> can be Gt, Lt, Ne, Between, Like

    User findByName(String name);
    User findByNameAndSurname(String name, String surname);
    User findBySurname(String surname);

    User findByIdNo(Long idNo);

    List<User> findAll();

    User findByDateOfBirthBetween(Date d1, Date d2);

//    Can add custom queries
//    @Query("SELECT u FROM User where u.email not like '%@%'")
//    List<User> findInvalidEmails();
}
