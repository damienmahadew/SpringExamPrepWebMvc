package repositories;

import domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * Example of extending the Repository interface
 * This is not used in the exam prep -- no @Repository
 */

public interface UserRepository extends Repository<User, Long> {

    <S extends User> S save(S var1);

    User findById(long i);

    User findByEmailIgnoreCase(String email);

//    @Query("SELECT u from user where u.email = ?1")
//    User findByEmail(String email);


}
