package com.jierui.boot.module.visual.controller.admin.designdata.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 大屏数据更新 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DesignDataUpdateReqVO extends DesignDataBaseVO {

    @Schema(description = "大屏id", requiredMode = Schema.RequiredMode.REQUIRED, example = "15974")
    @NotNull(message = "大屏id不能为空")
    private Long id;

}
