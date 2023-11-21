package com.jierui.boot.module.visual.service.designdata;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import com.jierui.boot.module.visual.controller.admin.designdata.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designdata.DesignDataDO;
import com.jierui.boot.framework.common.pojo.PageResult;

import com.jierui.boot.module.visual.convert.designdata.DesignDataConvert;
import com.jierui.boot.module.visual.dal.mysql.designdata.DesignDataMapper;

import static com.jierui.boot.framework.common.exception.util.ServiceExceptionUtil.exception;
import static com.jierui.boot.module.visual.enums.ErrorCodeConstants.*;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;

/**
 * 大屏数据 Service 实现类
 *
 * @author 张杰瑞
 */
@Service
@Validated
public class DesignDataServiceImpl implements DesignDataService {

    @Resource
    private DesignDataMapper designDataMapper;

    @Override
    public Long createDesignData(DesignDataCreateReqVO createReqVO) {
        // 插入
        DesignDataDO designData = DesignDataConvert.INSTANCE.convert(createReqVO);
        designDataMapper.insert(designData);
        // 返回
        return designData.getId();
    }

    @Override
    public void updateDesignData(DesignDataUpdateReqVO updateReqVO) {
        // 校验存在
        validateDesignDataExists(updateReqVO.getId());
        // 更新
        DesignDataDO updateObj = DesignDataConvert.INSTANCE.convert(updateReqVO);
        designDataMapper.updateById(updateObj);
    }

    @Override
    public void deleteDesignData(Long id) {
        // 校验存在
        validateDesignDataExists(id);
        // 删除
        designDataMapper.deleteById(id);
    }

    private void validateDesignDataExists(Long id) {
        if (designDataMapper.selectById(id) == null) {
            throw exception(DESIGN_DATA_NOT_EXISTS);
        }
    }

    @Override
    public DesignDataDO getDesignData(Long id) {
        return designDataMapper.selectById(id);
    }

    @Override
    public List<DesignDataDO> getDesignDataList(Collection<Long> ids) {
        if (CollUtil.isEmpty(ids)) {
            return ListUtil.empty();
        }
        return designDataMapper.selectBatchIds(ids);
    }

    @Override
    public PageResult<DesignDataDO> getDesignDataPage(DesignDataPageReqVO pageReqVO) {
        return designDataMapper.selectPage(pageReqVO);
    }

    @Override
    public List<DesignDataDO> getDesignDataList(DesignDataExportReqVO exportReqVO) {
        return designDataMapper.selectList(exportReqVO);
    }

}
