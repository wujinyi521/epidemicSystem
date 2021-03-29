package cn.it.service;

import cn.it.dao.UserDao;
import cn.it.domain.Role;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    public List<Role> findAll() throws SQLException {
        UserDao userDao=new UserDao();
        return userDao.findAll();
    }
}
