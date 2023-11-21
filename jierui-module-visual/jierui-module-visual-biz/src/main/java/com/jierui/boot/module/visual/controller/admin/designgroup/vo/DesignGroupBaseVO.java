package com.jierui.boot.module.visual.controller.admin.designgroup.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import javax.validation.constraints.*;

/**
 * 大屏分组 Base VO，提供给添加、修改、详细的子 VO 使用
 * 如果子 VO 存在差异的字段，请不要添加到这里，影响 Swagger 文档生成
 */
@Data
public class DesignGroupBaseVO {

    @Schema(description = "分组名称", example = "张三")
    private String name;

    @Schema(description = "0大屏分组，1模板分组", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "0大屏分组，1模板分组不能为空")
    private Boolean type;

    @Schema(description = "状态（0正常 1停用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "状态（0正常 1停用）不能为空")
    private Boolean status;

}
