package com.jierui.boot.framework.sms.core.client.impl.debug;

import com.jierui.boot.framework.common.exception.ErrorCode;
import com.jierui.boot.framework.common.exception.enums.GlobalErrorCodeConstants;
import com.jierui.boot.framework.sms.core.client.SmsCodeMapping;
import com.jierui.boot.framework.sms.core.enums.SmsFrameworkErrorCodeConstants;

import java.util.Objects;

/**
 * 钉钉的 SmsCodeMapping 实现类
 *
 * @author 张杰瑞
 */
public class DebugDingTalkCodeMapping implements SmsCodeMapping {

    @Override
    public ErrorCode apply(String apiCode) {
        return Objects.equals(apiCode, "0") ? GlobalErrorCodeConstants.SUCCESS : SmsFrameworkErrorCodeConstants.SMS_UNKNOWN;
    }

}
