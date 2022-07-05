package uk.co.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.co.management.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
// interface do usuario, do tipo long(como esta no id no user.java)