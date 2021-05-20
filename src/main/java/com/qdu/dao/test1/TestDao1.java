package com.qdu.dao.test1;

import com.qdu.pojo.WxUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName TestDao1
 * @Description TODO
 * @Author uuorb
 * @Date 2021/5/11 12:23 上午
 * @Version 0.1
 **/

@Component
public interface TestDao1 {
  List<WxUser> userList();
}
