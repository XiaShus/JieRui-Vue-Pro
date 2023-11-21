package com.jierui.boot.module.visual.controller.admin.designgroup.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.jierui.boot.framework.common.pojo.PageParam;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import static com.jierui.boot.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 大屏分组 Excel 导出 Request VO，参数和 DesignGroupPageReqVO 是一致的")
@Data
public class DesignGroupExportReqVO {

    @Schema(description = "分组名称", example = "张三")
    private String name;

    @Schema(description = "0大屏分组，1模板分组", example = "1")
    private Boolean type;

    @Schema(description = "状态（0正常 1停用）", example = "2")
    private Boolean status;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}
