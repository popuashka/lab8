package bsu.rfe.Dubezhinskiy.lab8.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bsu.rfe.Dubezhinskiy.lab8.entity.ChatMessage;

public class MessageListServlet extends ChatServlet {
    private static final long serialVersionUID = 1L;
    final int value = 1000;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Установить кодировку HTTP-ответа UTF-8
        response.setCharacterEncoding("utf8");
        // Получить доступ к потоку вывода HTTP-ответа
        PrintWriter pw = response.getWriter();
        // Записть в поток HTML-разметку страницы
        pw.println("<html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'/><meta http-equiv='refresh' content='10'></head>");
        pw.println("<body>");
        // В обратном порядке записать в поток HTML-разметку для каждого сообщения

        for (int i = 0; i< messages.size(); i++) {
            ChatMessage aMessage = messages.get(i);
            pw.println("<div><i> -> [" + aMessage.getCertainTime() + " ] " + "</i> ");
            pw.println(aMessage.getAuthor().getName() + "</strong>: " + aMessage.getMessage() + "</div>");
        }
        pw.println("</body></html>");
    }
}