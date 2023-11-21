package com.jierui.boot.module.visual.controller.admin.designdata.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import javax.validation.constraints.*;

/**
 * 大屏数据 Base VO，提供给添加、修改、详细的子 VO 使用
 * 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
 */
@Data
public class DesignDataBaseVO {

    @Schema(description = "大屏标题")
    private String title;

    @Schema(description = "简介")
    private String simpleDesc;

    @Schema(description = "背景图片")
    private String bgImg;

    @Schema(description = "背景颜色")
    private String bgColor;

    @Schema(description = "屏幕比例X")
    private Integer scaleX;

    @Schema(description = "屏幕比例Y")
    private Integer scaleY;

    @Schema(description = "设计预览图")
    private String designImgPath;

    @Schema(description = "禁用状态：1启用,-1禁用")
    private Byte state;

    @Schema(description = "访问码")
    private String viewCode;

    @Schema(description = "访问量")
    private Integer countView;

    @Schema(description = "是否保存为模板", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "是否保存为模板不能为空")
    private String designType;

    @Schema(description = "分组ID", example = "14189")
    private Long groupId;

    @Schema(description = "水印配置")
    private String waterMark;

    @Schema(description = "缩放模式：1铺满缩放，2比例缩放，3响应布局", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "缩放模式：1铺满缩放，2比例缩放，3响应布局不能为空")
    private Boolean scaleType;

}
