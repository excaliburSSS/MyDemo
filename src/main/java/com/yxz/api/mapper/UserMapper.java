package com.yxz.api.mapper;

import com.yxz.api.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yxz
 * @since 2022-07-05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
