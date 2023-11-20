package com.jierui.boot.framework.common.util.object;

import com.jierui.boot.framework.common.pojo.PageParam;

/**
 * {@link com.jierui.boot.framework.common.pojo.PageParam} 工具类
 *
 * @author 张杰瑞
 */
public class PageUtils {

    public static int getStart(PageParam pageParam) {
        return (pageParam.getPageNo() - 1) * pageParam.getPageSize();
    }

}
