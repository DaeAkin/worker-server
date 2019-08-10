package com.donghyeon.user.dto;

import com.donghyeon.BaseAuditingEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collection;

@Builder
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@Entity
public class User extends BaseAuditingEntity implements UserDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private boolean enable;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public void initialize(PasswordEncoder encoder){
        enable = true;
        encodePassword(encoder);
    }

    private void encodePassword(PasswordEncoder encoder){
        this.password = encoder.encode(this.password);
    }

    /** UserDetails 구현부 */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    // 미사용 UserDetails
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

}
