package com.jierui.boot.module.visual.convert.designdata;

import java.util.*;

import com.jierui.boot.framework.common.pojo.PageResult;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.jierui.boot.module.visual.controller.admin.designdata.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designdata.DesignDataDO;

/**
 * 大屏数据 Convert
 *
 * @author 张杰瑞
 */
@Mapper
public interface DesignDataConvert {

    DesignDataConvert INSTANCE = Mappers.getMapper(DesignDataConvert.class);

    DesignDataDO convert(DesignDataCreateReqVO bean);

    DesignDataDO convert(DesignDataUpdateReqVO bean);

    DesignDataRespVO convert(DesignDataDO bean);

    List<DesignDataRespVO> convertList(List<DesignDataDO> list);

    PageResult<DesignDataRespVO> convertPage(PageResult<DesignDataDO> page);

    List<DesignDataExcelVO> convertList02(List<DesignDataDO> list);

}
