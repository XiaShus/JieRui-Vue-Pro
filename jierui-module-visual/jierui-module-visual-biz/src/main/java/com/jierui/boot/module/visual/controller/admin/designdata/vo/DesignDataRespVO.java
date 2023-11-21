package com.jierui.boot.module.visual.controller.admin.designdata.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 大屏数据 Response VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DesignDataRespVO extends DesignDataBaseVO {

    @Schema(description = "大屏id", requiredMode = Schema.RequiredMode.REQUIRED, example = "15974")
    private Long id;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDateTime createTime;

}
