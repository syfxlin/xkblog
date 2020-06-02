package me.ixk.xkblog.entity;

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
public class PersistentLogins implements Serializable {

    private static final long serialVersionUID=1L;

    private String username;

    private String series;

    private String token;

    private LocalDateTime lastUsed;


}
