package com.jierui.boot.module.visual.convert.designgroup;

import java.util.*;

import com.jierui.boot.framework.common.pojo.PageResult;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.jierui.boot.module.visual.controller.admin.designgroup.vo.*;
import com.jierui.boot.module.visual.dal.dataobject.designgroup.DesignGroupDO;

/**
 * 大屏分组 Convert
 *
 * @author 张杰瑞
 */
@Mapper
public interface DesignGroupConvert {

    DesignGroupConvert INSTANCE = Mappers.getMapper(DesignGroupConvert.class);

    DesignGroupDO convert(DesignGroupCreateReqVO bean);

    DesignGroupDO convert(DesignGroupUpdateReqVO bean);

    DesignGroupRespVO convert(DesignGroupDO bean);

    List<DesignGroupRespVO> convertList(List<DesignGroupDO> list);

    PageResult<DesignGroupRespVO> convertPage(PageResult<DesignGroupDO> page);

    List<DesignGroupExcelVO> convertList02(List<DesignGroupDO> list);

}
