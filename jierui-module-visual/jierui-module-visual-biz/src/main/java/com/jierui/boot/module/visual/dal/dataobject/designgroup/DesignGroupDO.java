package com.jierui.boot.module.visual.dal.dataobject.designgroup;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import com.jierui.boot.framework.mybatis.core.dataobject.BaseDO;

/**
 * 大屏分组 DO
 *
 * @author 张杰瑞
 */
@TableName("visual_design_group")
@KeySequence("visual_design_group_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DesignGroupDO extends BaseDO {

    /**
     * 分组id
     */
    @TableId
    private Long id;
    /**
     * 分组名称
     */
    private String name;
    /**
     * 0大屏分组，1模板分组
     */
    private Boolean type;
    /**
     * 状态（0正常 1停用）
     */
    private Boolean status;

}
