package com.poll.app.tejnalpollapp.repository;

import com.poll.app.tejnalpollapp.model.Role;
import com.poll.app.tejnalpollapp.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
