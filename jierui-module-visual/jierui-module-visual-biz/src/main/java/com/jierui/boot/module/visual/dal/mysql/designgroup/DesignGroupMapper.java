package com.jierui.boot.module.visual.dal.mysql.designgroup;

import java.util.*;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.jierui.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.jierui.boot.module.visual.dal.dataobject.designgroup.DesignGroupDO;
import org.apache.ibatis.annotations.Mapper;
import com.jierui.boot.module.visual.controller.admin.designgroup.vo.*;

/**
 * 大屏分组 Mapper
 *
 * @author 张杰瑞
 */
@Mapper
public interface DesignGroupMapper extends BaseMapperX<DesignGroupDO> {

    default PageResult<DesignGroupDO> selectPage(DesignGroupPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<DesignGroupDO>()
                .likeIfPresent(DesignGroupDO::getName, reqVO.getName())
                .eqIfPresent(DesignGroupDO::getType, reqVO.getType())
                .eqIfPresent(DesignGroupDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(DesignGroupDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(DesignGroupDO::getId));
    }

    default List<DesignGroupDO> selectList(DesignGroupExportReqVO reqVO) {
        return selectList(new LambdaQueryWrapperX<DesignGroupDO>()
                .likeIfPresent(DesignGroupDO::getName, reqVO.getName())
                .eqIfPresent(DesignGroupDO::getType, reqVO.getType())
                .eqIfPresent(DesignGroupDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(DesignGroupDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(DesignGroupDO::getId));
    }

}
