package com.jierui.boot.module.system.convert.permission;

import com.jierui.boot.module.system.controller.admin.permission.vo.role.*;
import com.jierui.boot.module.system.dal.dataobject.permission.RoleDO;
import com.jierui.boot.module.system.service.permission.bo.RoleCreateReqBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoleConvert {

    RoleConvert INSTANCE = Mappers.getMapper(RoleConvert.class);

    RoleDO convert(RoleUpdateReqVO bean);

    RoleRespVO convert(RoleDO bean);

    RoleDO convert(RoleCreateReqVO bean);

    List<RoleSimpleRespVO> convertList02(List<RoleDO> list);

    List<RoleExcelVO> convertList03(List<RoleDO> list);

    RoleDO convert(RoleCreateReqBO bean);

}
