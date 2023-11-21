package com.jierui.boot.module.visual.controller.admin.designdata;

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

import com.jierui.boot.module.visual.controller.admin.designdata.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designdata.DesignDataDO;
import com.jierui.boot.module.visual.convert.designdata.DesignDataConvert;
import com.jierui.boot.module.visual.service.designdata.DesignDataService;

@Tag(name = "管理后台 - 大屏数据")
@RestController
@RequestMapping("/visual/design-data")
@Validated
public class DesignDataController {

    @Resource
    private DesignDataService designDataService;

    @PostMapping("/create")
    @Operation(summary = "创建大屏数据")
    @PreAuthorize("@ss.hasPermission('visual:design-data:create')")
    public CommonResult<Long> createDesignData(@Valid @RequestBody DesignDataCreateReqVO createReqVO) {
        return success(designDataService.createDesignData(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新大屏数据")
    @PreAuthorize("@ss.hasPermission('visual:design-data:update')")
    public CommonResult<Boolean> updateDesignData(@Valid @RequestBody DesignDataUpdateReqVO updateReqVO) {
        designDataService.updateDesignData(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除大屏数据")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('visual:design-data:delete')")
    public CommonResult<Boolean> deleteDesignData(@RequestParam("id") Long id) {
        designDataService.deleteDesignData(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得大屏数据")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('visual:design-data:query')")
    public CommonResult<DesignDataRespVO> getDesignData(@RequestParam("id") Long id) {
        DesignDataDO designData = designDataService.getDesignData(id);
        return success(DesignDataConvert.INSTANCE.convert(designData));
    }

    @GetMapping("/list")
    @Operation(summary = "获得大屏数据列表")
    @Parameter(name = "ids", description = "编号列表", required = true, example = "1024,2048")
    @PreAuthorize("@ss.hasPermission('visual:design-data:query')")
    public CommonResult<List<DesignDataRespVO>> getDesignDataList(@RequestParam("ids") Collection<Long> ids) {
        List<DesignDataDO> list = designDataService.getDesignDataList(ids);
        return success(DesignDataConvert.INSTANCE.convertList(list));
    }

    @GetMapping("/page")
    @Operation(summary = "获得大屏数据分页")
    @PreAuthorize("@ss.hasPermission('visual:design-data:query')")
    public CommonResult<PageResult<DesignDataRespVO>> getDesignDataPage(@Valid DesignDataPageReqVO pageVO) {
        PageResult<DesignDataDO> pageResult = designDataService.getDesignDataPage(pageVO);
        return success(DesignDataConvert.INSTANCE.convertPage(pageResult));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出大屏数据 Excel")
    @PreAuthorize("@ss.hasPermission('visual:design-data:export')")
    @OperateLog(type = EXPORT)
    public void exportDesignDataExcel(@Valid DesignDataExportReqVO exportReqVO,
              HttpServletResponse response) throws IOException {
        List<DesignDataDO> list = designDataService.getDesignDataList(exportReqVO);
        // 导出 Excel
        List<DesignDataExcelVO> datas = DesignDataConvert.INSTANCE.convertList02(list);
        ExcelUtils.write(response, "大屏数据.xls", "数据", DesignDataExcelVO.class, datas);
    }

}
