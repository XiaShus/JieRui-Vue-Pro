package com.jierui.boot.module.visual.controller.admin.designgroup.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * 大屏分组 Excel VO
 *
 * @author 张杰瑞
 */
@Data
public class DesignGroupExcelVO {

    @ExcelProperty("分组id")
    private Long id;

    @ExcelProperty("分组名称")
    private String name;

    @ExcelProperty("0大屏分组，1模板分组")
    private Boolean type;

    @ExcelProperty("状态（0正常 1停用）")
    private Boolean status;

    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}
