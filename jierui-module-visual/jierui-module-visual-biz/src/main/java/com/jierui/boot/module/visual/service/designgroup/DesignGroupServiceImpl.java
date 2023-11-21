package com.jierui.boot.module.visual.service.designgroup;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import java.util.*;
import com.jierui.boot.module.visual.controller.admin.designgroup.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designgroup.DesignGroupDO;
import com.jierui.boot.framework.common.pojo.PageResult;

import com.jierui.boot.module.visual.convert.designgroup.DesignGroupConvert;
import com.jierui.boot.module.visual.dal.mysql.designgroup.DesignGroupMapper;

import static com.jierui.boot.framework.common.exception.util.ServiceExceptionUtil.exception;
import static com.jierui.boot.module.visual.enums.ErrorCodeConstants.*;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.ListUtil;

/**
 * 大屏分组 Service 实现类
 *
 * @author 张杰瑞
 */
@Service
@Validated
public class DesignGroupServiceImpl implements DesignGroupService {

    @Resource
    private DesignGroupMapper designGroupMapper;

    @Override
    public Long createDesignGroup(DesignGroupCreateReqVO createReqVO) {
        // 插入
        DesignGroupDO designGroup = DesignGroupConvert.INSTANCE.convert(createReqVO);
        designGroupMapper.insert(designGroup);
        // 返回
        return designGroup.getId();
    }

    @Override
    public void updateDesignGroup(DesignGroupUpdateReqVO updateReqVO) {
        // 校验存在
        validateDesignGroupExists(updateReqVO.getId());
        // 更新
        DesignGroupDO updateObj = DesignGroupConvert.INSTANCE.convert(updateReqVO);
        designGroupMapper.updateById(updateObj);
    }

    @Override
    public void deleteDesignGroup(Long id) {
        // 校验存在
        validateDesignGroupExists(id);
        // 删除
        designGroupMapper.deleteById(id);
    }

    private void validateDesignGroupExists(Long id) {
        if (designGroupMapper.selectById(id) == null) {
            throw exception(DESIGN_GROUP_NOT_EXISTS);
        }
    }

    @Override
    public DesignGroupDO getDesignGroup(Long id) {
        return designGroupMapper.selectById(id);
    }

    @Override
    public List<DesignGroupDO> getDesignGroupList(Collection<Long> ids) {
        if (CollUtil.isEmpty(ids)) {
            return ListUtil.empty();
        }
        return designGroupMapper.selectBatchIds(ids);
    }

    @Override
    public PageResult<DesignGroupDO> getDesignGroupPage(DesignGroupPageReqVO pageReqVO) {
        return designGroupMapper.selectPage(pageReqVO);
    }

    @Override
    public List<DesignGroupDO> getDesignGroupList(DesignGroupExportReqVO exportReqVO) {
        return designGroupMapper.selectList(exportReqVO);
    }

}
