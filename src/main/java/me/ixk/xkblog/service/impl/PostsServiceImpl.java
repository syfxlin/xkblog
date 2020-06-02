package me.ixk.xkblog.service.impl;

import me.ixk.xkblog.entity.Posts;
import me.ixk.xkblog.mapper.PostsMapper;
import me.ixk.xkblog.service.IPostsService;
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
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
