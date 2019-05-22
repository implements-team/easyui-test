package com.test.easyui.controller;

import com.test.easyui.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestEasyUIController {






    //以下是datagrid的插入和获取demo

    @PostMapping("testIn")
    public Map<String, Object> testIn(User user) {
        Map<String, Object> resultMap = new HashMap<>();
        System.out.println(user.getFirstname());
        int code = 0;
        //执行数据库插入user操作返回code. 插入成功code为1
        resultMap.put("code", code);

        if (code == 0) {
            resultMap.put("errorMsg", 1);
        }
        return resultMap;
    }


    @PostMapping("testGet")
    public List testGet() {
        List resultList = new ArrayList();
        //模拟数据库查询回来的数据
        User user1 = new User("你好", "世界", 989l, "deadzq@qq.com");
        User user2 = new User("梧桐树", "小树苗", 823831l, "deadzq@qq.com");

        resultList.add(user1);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);
        resultList.add(user2);

        return resultList;
    }
}
