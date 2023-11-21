package com.jierui.boot.module.visual.service.designdata;

import java.util.*;
import javax.validation.*;
import com.jierui.boot.module.visual.controller.admin.designdata.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designdata.DesignDataDO;
import com.jierui.boot.framework.common.pojo.PageResult;

/**
 * 大屏数据 Service 接口
 *
 * @author 张杰瑞
 */
public interface DesignDataService {

    /**
     * 创建大屏数据
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDesignData(@Valid DesignDataCreateReqVO createReqVO);

    /**
     * 更新大屏数据
     *
     * @param updateReqVO 更新信息
     */
    void updateDesignData(@Valid DesignDataUpdateReqVO updateReqVO);

    /**
     * 删除大屏数据
     *
     * @param id 编号
     */
    void deleteDesignData(Long id);

    /**
     * 获得大屏数据
     *
     * @param id 编号
     * @return 大屏数据
     */
    DesignDataDO getDesignData(Long id);

    /**
     * 获得大屏数据列表
     *
     * @param ids 编号
     * @return 大屏数据列表
     */
    List<DesignDataDO> getDesignDataList(Collection<Long> ids);

    /**
     * 获得大屏数据分页
     *
     * @param pageReqVO 分页查询
     * @return 大屏数据分页
     */
    PageResult<DesignDataDO> getDesignDataPage(DesignDataPageReqVO pageReqVO);

    /**
     * 获得大屏数据列表, 用于 Excel 导出
     *
     * @param exportReqVO 查询条件
     * @return 大屏数据列表
     */
    List<DesignDataDO> getDesignDataList(DesignDataExportReqVO exportReqVO);

}
