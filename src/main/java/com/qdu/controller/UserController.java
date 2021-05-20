package com.qdu.controller;

import com.qdu.dao.test1.TestDao1;
import com.qdu.dao.test2.TestDao2;
import com.qdu.pojo.SysRole;
import com.qdu.pojo.WxUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author uuorb
 * @Date 2021/5/11 12:31 上午
 * @Version 0.1
 **/
@RestController
@Controller
public class UserController {
  @Autowired
  TestDao1 testDao1;

  @Autowired
  TestDao2 testDao2;

  @GetMapping("/wxuser")
  public List<WxUser> getWxUser(){
    return testDao1.userList();
  }

  @GetMapping("/sysrole")
  public List<SysRole> getSysRole(){
    return testDao2.userRole();
  }
}
