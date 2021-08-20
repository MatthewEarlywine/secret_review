package org.launchcode.secret_review.data;

import org.launchcode.secret_review.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
