package com.donghyeon.user.service;

import com.donghyeon.user.dto.User;
import com.donghyeon.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    /** param 클라이언트에서파라미터이름을username으로넘겨줘야한다.*/
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findUserByEmail(email);

        /** user 예외처리 해줄 것 */

        return user;
    }
}
