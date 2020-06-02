package me.ixk.xkblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Otstar Lin
 * @since 2020-03-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PostsMeta implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "meta_id", type = IdType.AUTO)
    private Long metaId;

    private Long postId;

    private String metaKey;

    private String metaValue;


}
