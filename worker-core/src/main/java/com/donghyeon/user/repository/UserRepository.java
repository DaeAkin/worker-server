package com.donghyeon.user.repository;

import com.donghyeon.user.dto.User;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends DataTablesRepository<User,Long> {

    User findUserByEmail(String email);
}
