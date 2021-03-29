package cn.it.servlet;

import cn.it.dao.UserDao;
import cn.it.domain.Role;
import cn.it.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet( "/UseServlet")//请求路径
public class UseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String method=request.getParameter("method");
       if("findAll".equals(method)){
           findAll(request,response);
       }
    }

    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService userService=new UserService();
        List<Role> rolelist= null;
        try {
            rolelist = userService.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("rolelist",rolelist);
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }
}
