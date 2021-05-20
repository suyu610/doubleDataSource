package com.qdu.dao.test2;

import com.qdu.pojo.SysRole;
import com.qdu.pojo.SysUser;
import com.qdu.pojo.WxUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestDao2 {
  List<SysRole> userRole();
}
