package com.jierui.boot.module.visual.dal.dataobject.designdata;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import com.jierui.boot.framework.mybatis.core.dataobject.BaseDO;

/**
 * 大屏数据 DO
 *
 * @author 张杰瑞
 */
@TableName("visual_design_data")
@KeySequence("visual_design_data_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DesignDataDO extends BaseDO {

    /**
     * 大屏id
     */
    @TableId
    private Long id;
    /**
     * 大屏标题
     */
    private String title;
    /**
     * 简介
     */
    private String simpleDesc;
    /**
     * 背景图片
     */
    private String bgImg;
    /**
     * 背景颜色
     */
    private String bgColor;
    /**
     * 屏幕比例X
     */
    private Integer scaleX;
    /**
     * 屏幕比例Y
     */
    private Integer scaleY;
    /**
     * 设计预览图
     */
    private String designImgPath;
    /**
     * 禁用状态：1启用,-1禁用
     */
    private Byte state;
    /**
     * 访问码
     */
    private String viewCode;
    /**
     * 访问量
     */
    private Integer countView;
    /**
     * 是否保存为模板
     */
    private String designType;
    /**
     * 分组ID
     */
    private Long groupId;
    /**
     * 水印配置
     */
    private String waterMark;
    /**
     * 缩放模式：1铺满缩放，2比例缩放，3响应布局
     */
    private Boolean scaleType;

}
