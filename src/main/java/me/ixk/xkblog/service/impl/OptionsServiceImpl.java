package me.ixk.xkblog.service.impl;

import me.ixk.xkblog.entity.Options;
import me.ixk.xkblog.mapper.OptionsMapper;
import me.ixk.xkblog.service.IOptionsService;
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
public class OptionsServiceImpl extends ServiceImpl<OptionsMapper, Options> implements IOptionsService {

}
