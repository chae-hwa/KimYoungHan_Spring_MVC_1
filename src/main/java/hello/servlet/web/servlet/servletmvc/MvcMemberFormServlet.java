package hello.servlet.web.servlet.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// controller 역할
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp"; // WEB-INF 파일은 컨트롤러에서 forword 해야 호출된다.
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);// controller -> view로 이동할 때 사용됨.
        dispatcher.forward(request, response);// forward를 사용하면 다른 서블릿이나 JSP로 이동할 수 있다. (서버 내에서 호출)

    }
}
