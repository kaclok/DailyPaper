package com.smlj.dailypaper;

import com.smlj.dailypaper.entity.po.User;
import com.smlj.dailypaper.mapper.UserMapper;
import com.smlj.dailypaper.entity.po.Commit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DailypaperApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testFindAll() {
        List<User> list = userMapper.FindAll();
        System.out.println(list);
    }
}
