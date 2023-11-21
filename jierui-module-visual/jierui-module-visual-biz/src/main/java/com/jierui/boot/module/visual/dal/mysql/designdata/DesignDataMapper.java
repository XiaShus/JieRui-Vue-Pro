package com.jierui.boot.module.visual.dal.mysql.designdata;

import java.util.*;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.jierui.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.jierui.boot.module.visual.dal.dataobject.designdata.DesignDataDO;
import org.apache.ibatis.annotations.Mapper;
import com.jierui.boot.module.visual.controller.admin.designdata.vo.*;

/**
 * 大屏数据 Mapper
 *
 * @author 张杰瑞
 */
@Mapper
public interface DesignDataMapper extends BaseMapperX<DesignDataDO> {

    default PageResult<DesignDataDO> selectPage(DesignDataPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<DesignDataDO>()
                .eqIfPresent(DesignDataDO::getTitle, reqVO.getTitle())
                .eqIfPresent(DesignDataDO::getSimpleDesc, reqVO.getSimpleDesc())
                .eqIfPresent(DesignDataDO::getBgImg, reqVO.getBgImg())
                .eqIfPresent(DesignDataDO::getBgColor, reqVO.getBgColor())
                .eqIfPresent(DesignDataDO::getScaleX, reqVO.getScaleX())
                .eqIfPresent(DesignDataDO::getScaleY, reqVO.getScaleY())
                .eqIfPresent(DesignDataDO::getDesignImgPath, reqVO.getDesignImgPath())
                .eqIfPresent(DesignDataDO::getState, reqVO.getState())
                .eqIfPresent(DesignDataDO::getViewCode, reqVO.getViewCode())
                .eqIfPresent(DesignDataDO::getCountView, reqVO.getCountView())
                .eqIfPresent(DesignDataDO::getDesignType, reqVO.getDesignType())
                .eqIfPresent(DesignDataDO::getGroupId, reqVO.getGroupId())
                .eqIfPresent(DesignDataDO::getWaterMark, reqVO.getWaterMark())
                .eqIfPresent(DesignDataDO::getScaleType, reqVO.getScaleType())
                .betweenIfPresent(DesignDataDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(DesignDataDO::getId));
    }

    default List<DesignDataDO> selectList(DesignDataExportReqVO reqVO) {
        return selectList(new LambdaQueryWrapperX<DesignDataDO>()
                .eqIfPresent(DesignDataDO::getTitle, reqVO.getTitle())
                .eqIfPresent(DesignDataDO::getSimpleDesc, reqVO.getSimpleDesc())
                .eqIfPresent(DesignDataDO::getBgImg, reqVO.getBgImg())
                .eqIfPresent(DesignDataDO::getBgColor, reqVO.getBgColor())
                .eqIfPresent(DesignDataDO::getScaleX, reqVO.getScaleX())
                .eqIfPresent(DesignDataDO::getScaleY, reqVO.getScaleY())
                .eqIfPresent(DesignDataDO::getDesignImgPath, reqVO.getDesignImgPath())
                .eqIfPresent(DesignDataDO::getState, reqVO.getState())
                .eqIfPresent(DesignDataDO::getViewCode, reqVO.getViewCode())
                .eqIfPresent(DesignDataDO::getCountView, reqVO.getCountView())
                .eqIfPresent(DesignDataDO::getDesignType, reqVO.getDesignType())
                .eqIfPresent(DesignDataDO::getGroupId, reqVO.getGroupId())
                .eqIfPresent(DesignDataDO::getWaterMark, reqVO.getWaterMark())
                .eqIfPresent(DesignDataDO::getScaleType, reqVO.getScaleType())
                .betweenIfPresent(DesignDataDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(DesignDataDO::getId));
    }

}
