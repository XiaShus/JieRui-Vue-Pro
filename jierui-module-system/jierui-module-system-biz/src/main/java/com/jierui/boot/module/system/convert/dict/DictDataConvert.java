package com.jierui.boot.module.system.convert.dict;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.module.system.api.dict.dto.DictDataRespDTO;
import com.jierui.boot.module.system.controller.admin.dict.vo.data.*;
import com.jierui.boot.module.system.controller.app.dict.vo.AppDictDataRespVO;
import com.jierui.boot.module.system.dal.dataobject.dict.DictDataDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DictDataConvert {

    DictDataConvert INSTANCE = Mappers.getMapper(DictDataConvert.class);

    List<DictDataSimpleRespVO> convertList(List<DictDataDO> list);

    DictDataRespVO convert(DictDataDO bean);

    PageResult<DictDataRespVO> convertPage(PageResult<DictDataDO> page);

    DictDataDO convert(DictDataUpdateReqVO bean);

    DictDataDO convert(DictDataCreateReqVO bean);

    List<DictDataExcelVO> convertList02(List<DictDataDO> bean);

    DictDataRespDTO convert02(DictDataDO bean);

    List<AppDictDataRespVO> convertList03(List<DictDataDO> list);

}
