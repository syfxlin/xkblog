package me.ixk.xkblog.service.impl;

import me.ixk.xkblog.entity.Categories;
import me.ixk.xkblog.mapper.CategoriesMapper;
import me.ixk.xkblog.service.ICategoriesService;
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
public class CategoriesServiceImpl extends ServiceImpl<CategoriesMapper, Categories> implements ICategoriesService {

}
