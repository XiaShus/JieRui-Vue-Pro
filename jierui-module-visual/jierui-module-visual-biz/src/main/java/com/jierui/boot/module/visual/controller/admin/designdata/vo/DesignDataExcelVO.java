package com.jierui.boot.module.visual.controller.admin.designdata.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 大屏数据 Excel VO
 *
 * @author 张杰瑞
 */
@Data
public class DesignDataExcelVO {

    @ExcelProperty("大屏id")
    private Long id;

    @ExcelProperty("大屏标题")
    private String title;

    @ExcelProperty("简介")
    private String simpleDesc;

    @ExcelProperty("背景图片")
    private String bgImg;

    @ExcelProperty("背景颜色")
    private String bgColor;

    @ExcelProperty("屏幕比例X")
    private Integer scaleX;

    @ExcelProperty("屏幕比例Y")
    private Integer scaleY;

    @ExcelProperty("设计预览图")
    private String designImgPath;

    @ExcelProperty("禁用状态：1启用,-1禁用")
    private Byte state;

    @ExcelProperty("访问码")
    private String viewCode;

    @ExcelProperty("访问量")
    private Integer countView;

    @ExcelProperty("是否保存为模板")
    private String designType;

    @ExcelProperty("分组ID")
    private Long groupId;

    @ExcelProperty("水印配置")
    private String waterMark;

    @ExcelProperty("缩放模式：1铺满缩放，2比例缩放，3响应布局")
    private Boolean scaleType;

    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}
