package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();
    List<UserInfo> findUserInfo(UserInfo userInfo);
    List<UserInfo> findByNickName(String nickName);
    void addUser(UserInfo userInfo);
    void updUser(UserInfo userInfo);
    void delUser(UserInfo userInfo);

    List<UserAddress> findUserAddressListByUserId(String userId);
    List<UserAddress> findUserAddressListByUserId(UserAddress userAddress);
}
