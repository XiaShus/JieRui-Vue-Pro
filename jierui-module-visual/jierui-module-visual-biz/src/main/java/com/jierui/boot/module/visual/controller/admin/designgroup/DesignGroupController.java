package com.jierui.boot.module.visual.controller.admin.designgroup;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import javax.validation.constraints.*;
import javax.validation.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.framework.common.pojo.CommonResult;
import static com.jierui.boot.framework.common.pojo.CommonResult.success;

import com.jierui.boot.framework.excel.core.util.ExcelUtils;

import com.jierui.boot.framework.operatelog.core.annotations.OperateLog;
import static com.jierui.boot.framework.operatelog.core.enums.OperateTypeEnum.*;

import com.jierui.boot.module.visual.controller.admin.designgroup.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designgroup.DesignGroupDO;
import com.jierui.boot.module.visual.convert.designgroup.DesignGroupConvert;
import com.jierui.boot.module.visual.service.designgroup.DesignGroupService;

@Tag(name = "管理后台 - 大屏分组")
@RestController
@RequestMapping("/visual/design-group")
@Validated
public class DesignGroupController {

    @Resource
    private DesignGroupService designGroupService;

    @PostMapping("/create")
    @Operation(summary = "创建大屏分组")
    @PreAuthorize("@ss.hasPermission('visual:design-group:create')")
    public CommonResult<Long> createDesignGroup(@Valid @RequestBody DesignGroupCreateReqVO createReqVO) {
        return success(designGroupService.createDesignGroup(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新大屏分组")
    @PreAuthorize("@ss.hasPermission('visual:design-group:update')")
    public CommonResult<Boolean> updateDesignGroup(@Valid @RequestBody DesignGroupUpdateReqVO updateReqVO) {
        designGroupService.updateDesignGroup(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除大屏分组")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('visual:design-group:delete')")
    public CommonResult<Boolean> deleteDesignGroup(@RequestParam("id") Long id) {
        designGroupService.deleteDesignGroup(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得大屏分组")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('visual:design-group:query')")
    public CommonResult<DesignGroupRespVO> getDesignGroup(@RequestParam("id") Long id) {
        DesignGroupDO designGroup = designGroupService.getDesignGroup(id);
        return success(DesignGroupConvert.INSTANCE.convert(designGroup));
    }

    @GetMapping("/list")
    @Operation(summary = "获得大屏分组列表")
    @Parameter(name = "ids", description = "编号列表", required = true, example = "1024,2048")
    @PreAuthorize("@ss.hasPermission('visual:design-group:query')")
    public CommonResult<List<DesignGroupRespVO>> getDesignGroupList(@RequestParam("ids") Collection<Long> ids) {
        List<DesignGroupDO> list = designGroupService.getDesignGroupList(ids);
        return success(DesignGroupConvert.INSTANCE.convertList(list));
    }

    @GetMapping("/page")
    @Operation(summary = "获得大屏分组分页")
    @PreAuthorize("@ss.hasPermission('visual:design-group:query')")
    public CommonResult<PageResult<DesignGroupRespVO>> getDesignGroupPage(@Valid DesignGroupPageReqVO pageVO) {
        PageResult<DesignGroupDO> pageResult = designGroupService.getDesignGroupPage(pageVO);
        return success(DesignGroupConvert.INSTANCE.convertPage(pageResult));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出大屏分组 Excel")
    @PreAuthorize("@ss.hasPermission('visual:design-group:export')")
    @OperateLog(type = EXPORT)
    public void exportDesignGroupExcel(@Valid DesignGroupExportReqVO exportReqVO,
              HttpServletResponse response) throws IOException {
        List<DesignGroupDO> list = designGroupService.getDesignGroupList(exportReqVO);
        // 导出 Excel
        List<DesignGroupExcelVO> datas = DesignGroupConvert.INSTANCE.convertList02(list);
        ExcelUtils.write(response, "大屏分组.xls", "数据", DesignGroupExcelVO.class, datas);
    }

}
