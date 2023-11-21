package com.jierui.boot.module.visual.enums;

import com.jierui.boot.framework.common.exception.ErrorCode;

public interface ErrorCodeConstants {
    ErrorCode DESIGN_GROUP_NOT_EXISTS = new ErrorCode(200, "大屏分组不存在");

    ErrorCode DESIGN_DATA_NOT_EXISTS = new ErrorCode(201, "大屏数据不存在");
}