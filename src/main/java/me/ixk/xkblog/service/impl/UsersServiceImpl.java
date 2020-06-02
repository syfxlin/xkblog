package me.ixk.xkblog.service.impl;

import me.ixk.xkblog.entity.Users;
import me.ixk.xkblog.mapper.UsersMapper;
import me.ixk.xkblog.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Otstar Lin
 * @since 2020-03-31
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
