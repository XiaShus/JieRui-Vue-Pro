package com.jierui.boot.framework.sms.core.client;

import com.jierui.boot.framework.common.exception.ErrorCode;
import com.jierui.boot.framework.sms.core.enums.SmsFrameworkErrorCodeConstants;

import java.util.function.Function;

/**
 * 将 API 的错误码，转换为通用的错误码
 *
 * @see SmsCommonResult
 * @see SmsFrameworkErrorCodeConstants
 *
 * @author 张杰瑞
 */
public interface SmsCodeMapping extends Function<String, ErrorCode> {
}
