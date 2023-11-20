package com.jierui.boot.module.system.dal.mysql.sms;

import com.jierui.boot.framework.common.pojo.PageResult;
import com.jierui.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.jierui.boot.framework.mybatis.core.query.LambdaQueryWrapperX;
import com.jierui.boot.module.system.controller.admin.sms.vo.channel.SmsChannelPageReqVO;
import com.jierui.boot.module.system.dal.dataobject.sms.SmsChannelDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsChannelMapper extends BaseMapperX<SmsChannelDO> {

    default PageResult<SmsChannelDO> selectPage(SmsChannelPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<SmsChannelDO>()
                .likeIfPresent(SmsChannelDO::getSignature, reqVO.getSignature())
                .eqIfPresent(SmsChannelDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(SmsChannelDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(SmsChannelDO::getId));
    }

    default SmsChannelDO selectByCode(String code) {
        return selectOne(SmsChannelDO::getCode, code);
    }

}
