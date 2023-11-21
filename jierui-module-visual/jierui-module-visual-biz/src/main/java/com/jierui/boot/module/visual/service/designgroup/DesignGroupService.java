package com.jierui.boot.module.visual.service.designgroup;

import java.util.*;
import javax.validation.*;
import com.jierui.boot.module.visual.controller.admin.designgroup.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designgroup.DesignGroupDO;
import com.jierui.boot.framework.common.pojo.PageResult;

/**
 * 大屏分组 Service 接口
 *
 * @author 张杰瑞
 */
public interface DesignGroupService {

    /**
     * 创建大屏分组
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDesignGroup(@Valid DesignGroupCreateReqVO createReqVO);

    /**
     * 更新大屏分组
     *
     * @param updateReqVO 更新信息
     */
    void updateDesignGroup(@Valid DesignGroupUpdateReqVO updateReqVO);

    /**
     * 删除大屏分组
     *
     * @param id 编号
     */
    void deleteDesignGroup(Long id);

    /**
     * 获得大屏分组
     *
     * @param id 编号
     * @return 大屏分组
     */
    DesignGroupDO getDesignGroup(Long id);

    /**
     * 获得大屏分组列表
     *
     * @param ids 编号
     * @return 大屏分组列表
     */
    List<DesignGroupDO> getDesignGroupList(Collection<Long> ids);

    /**
     * 获得大屏分组分页
     *
     * @param pageReqVO 分页查询
     * @return 大屏分组分页
     */
    PageResult<DesignGroupDO> getDesignGroupPage(DesignGroupPageReqVO pageReqVO);

    /**
     * 获得大屏分组列表, 用于 Excel 导出
     *
     * @param exportReqVO 查询条件
     * @return 大屏分组列表
     */
    List<DesignGroupDO> getDesignGroupList(DesignGroupExportReqVO exportReqVO);

}
