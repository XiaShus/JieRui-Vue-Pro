package com.jierui.boot.module.visual.controller.admin.designdata.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.jierui.boot.framework.common.pojo.PageParam;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import static com.jierui.boot.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 大屏数据 Excel 导出 Request VO，参数和 DesignDataPageReqVO 是一致的")
@Data
public class DesignDataExportReqVO {

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

    @Schema(description = "是否保存为模板", example = "1")
    private String designType;

    @Schema(description = "分组ID", example = "14189")
    private Long groupId;

    @Schema(description = "水印配置")
    private String waterMark;

    @Schema(description = "缩放模式：1铺满缩放，2比例缩放，3响应布局", example = "2")
    private Boolean scaleType;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}
