package uk.co.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uk.co.management.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
// interface do usuario, do tipo long(como esta no id no user.java)