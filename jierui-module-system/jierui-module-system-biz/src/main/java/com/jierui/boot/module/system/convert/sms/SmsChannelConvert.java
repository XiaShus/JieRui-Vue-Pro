package com.jierui.boot.module.system.convert.sms;

import com.jierui.boot.module.system.controller.admin.sms.vo.channel.SmsChannelCreateReqVO;
import com.jierui.boot.module.system.controller.admin.sms.vo.channel.SmsChannelRespVO;
import com.jierui.boot.module.system.controller.admin.sms.vo.channel.SmsChannelSimpleRespVO;
import com.jierui.boot.module.system.controller.admin.sms.vo.channel.SmsChannelUpdateReqVO;
import com.jierui.boot.module.system.dal.dataobject.sms.SmsChannelDO;
import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.framework.sms.core.property.SmsChannelProperties;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 短信渠道 Convert
 *
 * @author 张杰瑞
 */
@Mapper
public interface SmsChannelConvert {

    SmsChannelConvert INSTANCE = Mappers.getMapper(SmsChannelConvert.class);

    SmsChannelDO convert(SmsChannelCreateReqVO bean);

    SmsChannelDO convert(SmsChannelUpdateReqVO bean);

    SmsChannelRespVO convert(SmsChannelDO bean);

    List<SmsChannelRespVO> convertList(List<SmsChannelDO> list);

    PageResult<SmsChannelRespVO> convertPage(PageResult<SmsChannelDO> page);

    List<SmsChannelSimpleRespVO> convertList03(List<SmsChannelDO> list);

    SmsChannelProperties convert02(SmsChannelDO channel);

}
