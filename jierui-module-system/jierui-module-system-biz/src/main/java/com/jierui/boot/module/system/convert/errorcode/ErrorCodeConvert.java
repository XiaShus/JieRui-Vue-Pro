package com.jierui.boot.module.system.convert.errorcode;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.module.system.api.errorcode.dto.ErrorCodeAutoGenerateReqDTO;
import com.jierui.boot.module.system.api.errorcode.dto.ErrorCodeRespDTO;
import com.jierui.boot.module.system.controller.admin.errorcode.vo.ErrorCodeCreateReqVO;
import com.jierui.boot.module.system.controller.admin.errorcode.vo.ErrorCodeExcelVO;
import com.jierui.boot.module.system.controller.admin.errorcode.vo.ErrorCodeRespVO;
import com.jierui.boot.module.system.controller.admin.errorcode.vo.ErrorCodeUpdateReqVO;
import com.jierui.boot.module.system.dal.dataobject.errorcode.ErrorCodeDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 错误码 Convert
 *
 * @author 张杰瑞
 */
@Mapper
public interface ErrorCodeConvert {

    ErrorCodeConvert INSTANCE = Mappers.getMapper(ErrorCodeConvert.class);

    ErrorCodeDO convert(ErrorCodeCreateReqVO bean);

    ErrorCodeDO convert(ErrorCodeUpdateReqVO bean);

    ErrorCodeRespVO convert(ErrorCodeDO bean);

    List<ErrorCodeRespVO> convertList(List<ErrorCodeDO> list);

    PageResult<ErrorCodeRespVO> convertPage(PageResult<ErrorCodeDO> page);

    List<ErrorCodeExcelVO> convertList02(List<ErrorCodeDO> list);

    ErrorCodeDO convert(ErrorCodeAutoGenerateReqDTO bean);

    List<ErrorCodeRespDTO> convertList03(List<ErrorCodeDO> list);

}
