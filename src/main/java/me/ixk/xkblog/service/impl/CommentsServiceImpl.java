package me.ixk.xkblog.service.impl;

import me.ixk.xkblog.entity.Comments;
import me.ixk.xkblog.mapper.CommentsMapper;
import me.ixk.xkblog.service.ICommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
