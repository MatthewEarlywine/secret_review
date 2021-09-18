package org.launchcode.secret_review.data;

import org.launchcode.secret_review.models.Review;
import org.launchcode.secret_review.models.Role;
import org.launchcode.secret_review.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT u FROM Role u WHERE u.id = :id")
    public Role getRoleById(@Param("id") int role_id);
}
