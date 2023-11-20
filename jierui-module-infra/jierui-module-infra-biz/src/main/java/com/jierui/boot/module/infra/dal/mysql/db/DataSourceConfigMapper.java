package com.jierui.boot.module.infra.dal.mysql.db;

import com.jierui.boot.framework.mybatis.core.mapper.BaseMapperX;
import com.jierui.boot.module.infra.dal.dataobject.db.DataSourceConfigDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源配置 Mapper
 *
 * @author 张杰瑞
 */
@Mapper
public interface DataSourceConfigMapper extends BaseMapperX<DataSourceConfigDO> {
}
