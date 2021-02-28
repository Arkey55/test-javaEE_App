package ru.arkey.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");

        resp.getWriter().printf("<h1>FirstServlet here!</h1>");
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        logger.info("New Get request with redirection");
//        // обратите внимание, что здесь используется ссылка относительно URL сервера
//        resp.sendRedirect(req.getContextPath() + "/base_servlet");
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        logger.info("New Get request with redirection");
//        resp.sendRedirect("https://google.com");
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        logger.info("New Get request with forward");
//        getServletContext().getRequestDispatcher("/header.html").forward(req, resp);
//    }

    // НЕ РАБОТАЕТ!
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        logger.info("New Get request with includes");
//
//        getServletContext().getRequestDispatcher("/header.html").include(req, resp);
//        resp.getWriter().println("<p>Response body from servlet</p>");
//        getServletContext().getRequestDispatcher("/footer.html").include(req, resp);
//    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        logger.info("New Get request with includes");
//        resp.getWriter().println("<p>Response with cookie</p>");
//        Cookie cookie = new Cookie("user", "someUserName");
//        resp.addCookie(cookie);
//    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}
