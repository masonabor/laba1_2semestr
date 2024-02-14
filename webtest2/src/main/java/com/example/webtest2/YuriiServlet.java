package com.example.webtest2;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebServlet(name = "yuriServlet", value = "/yuriServlet")
public class YuriiServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("yurii", Person.class);
        context.close();

        PrintWriter out = response.getWriter();
        out.println("<html><head>");
        out.println("<title>No casino</title>");
        out.println("</head><body>");
        out.println("<h1>Цей сервлет зробив " + person.getName() + "</h1>");
        out.println("<h2></h2>");
        out.println("<h2>Мій вік: " + person.getAge() + "</h2>");
        out.println("<h2>Курс: " + person.getCourse() + "</h2>");
        out.println("<h2>Мій телеграм: " + person.getTelegram() + "</h2>");
        out.println("<h2><p>Відвідайте <a href=\"" + person.getUrl() + "\">мій інстаграм</a></p></h2>");
        out.println("</body></html>");
    }
}