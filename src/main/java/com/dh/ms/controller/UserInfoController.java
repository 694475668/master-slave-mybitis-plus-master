package com.dh.ms.controller;


import com.dh.ms.model.UserInfo;
import com.dh.ms.service.UserInfoServcie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘明
 */
@RestController
public class UserInfoController {

    @Resource
    private UserInfoServcie userInfoServcie;

    @GetMapping("/test1")
    public UserInfo getTest1() {
        return userInfoServcie.selectByOddUserId(1);
    }

    @GetMapping("/test2")
    public UserInfo getest1() {
        return userInfoServcie.selectByEvenUserId(1);
    }

    @GetMapping("/insert")
    public int insert() {
        return userInfoServcie.insert();
    }

    @GetMapping("/update/{id}")
    public int update(@PathVariable("id") Integer id) {
        return userInfoServcie.update(id);
    }

    @GetMapping("/delete/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return userInfoServcie.delete(id);
    }
}
