package com.ming;

import com.ming.dao.UserDao;
import com.ming.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {

    @Test
    public void testSql () {
        SqlSession sqlSession = MybatisUtils.getSqlSession ();
        UserDao mapper = sqlSession.getMapper (UserDao.class);
        // 你的应用逻辑代码
        List <User> users = mapper.getUserList ();
        System.out.println (users);
        sqlSession.close ();
    }
}


