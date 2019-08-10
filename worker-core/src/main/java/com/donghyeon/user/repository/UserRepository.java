package com.donghyeon.user.repository;

import com.donghyeon.user.dto.User;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;

public interface UserRepository extends DataTablesRepository<User,Long> {

    User findUserByEmail(String email);
}
