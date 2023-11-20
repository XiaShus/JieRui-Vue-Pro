package com.jierui.boot.module.system.convert.sms;

import com.jierui.boot.module.system.controller.admin.sms.vo.log.SmsLogExcelVO;
import com.jierui.boot.module.system.controller.admin.sms.vo.log.SmsLogRespVO;
import com.jierui.boot.module.system.dal.dataobject.sms.SmsLogDO;
import com.jierui.boot.framework.common.pojo.PageResult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 短信日志 Convert
 *
 * @author 张杰瑞
 */
@Mapper
public interface SmsLogConvert {

    SmsLogConvert INSTANCE = Mappers.getMapper(SmsLogConvert.class);

    SmsLogRespVO convert(SmsLogDO bean);

    List<SmsLogRespVO> convertList(List<SmsLogDO> list);

    PageResult<SmsLogRespVO> convertPage(PageResult<SmsLogDO> page);

    List<SmsLogExcelVO> convertList02(List<SmsLogDO> list);

}
