package com.yxz.api.service.impl;

import com.yxz.api.entity.User;
import com.yxz.api.mapper.UserMapper;
import com.yxz.api.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yxz
 * @since 2022-07-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
