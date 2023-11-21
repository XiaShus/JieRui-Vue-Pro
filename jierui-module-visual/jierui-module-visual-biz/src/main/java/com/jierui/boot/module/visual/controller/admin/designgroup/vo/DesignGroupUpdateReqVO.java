package com.jierui.boot.module.visual.controller.admin.designgroup.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - 大屏分组更新 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DesignGroupUpdateReqVO extends DesignGroupBaseVO {

    @Schema(description = "分组id", requiredMode = Schema.RequiredMode.REQUIRED, example = "10")
    @NotNull(message = "分组id不能为空")
    private Long id;

}
