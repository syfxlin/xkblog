package me.ixk.xkblog.security;

import me.ixk.xkblog.entity.Users;
import me.ixk.xkblog.mapper.UsersMapper;
import me.ixk.xkblog.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

@Configuration
public class UserDetailService implements UserDetailsService {
    @Autowired
    UsersServiceImpl usersService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersService.query().eq("username", username).one();
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        String authorities = user.getType().equals("admin") ? "admin,user" : "user";
        return new User(
                username,
                user.getPassword(),
                true,
                true,
                true,
                true,
                AuthorityUtils.commaSeparatedStringToAuthorityList(authorities)
        );
    }
}
