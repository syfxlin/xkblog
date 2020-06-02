package me.ixk.xkblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Posts implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long author;

    private LocalDateTime date;

    private LocalDateTime dataStamp;

    private String link;

    private String content;

    private String title;

    private String excerpt;

    private String status;

    private String commentStatus;

    private String password;

    private String alias;

    private LocalDateTime modified;

    private LocalDateTime modifiedStamp;

    private String featured;

    private Boolean sticky;

    private String type;


}
