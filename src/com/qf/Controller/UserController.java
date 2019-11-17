package com.qf.Controller;

import com.qf.entity.User;
import com.qf.service.serviceImpl.userServiceImpl;
import com.qf.service.userService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class UserController extends HttpServlet {
    userService userService = new userServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> userList = userService.getUserList();
        for (int i = 0; i <userList.size(); i++) {
            System.out.println("USERNAME:"+userList.get(i).getUserName()+"-----"+"PASSWORD:"+userList.get(i).getPassword());
        }
       req.setAttribute("userList",userList);
        req.getRequestDispatcher("one.jsp").forward(req,resp);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
