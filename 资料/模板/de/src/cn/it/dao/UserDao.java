package cn.it.dao;

import cn.it.domain.Role;
import cn.it.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDao {

    public List<Role> findAll() throws SQLException {
        QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
        List<Role> list=qr.query("select * from role",new BeanListHandler<Role>(Role.class));
        return list;
    }
}
