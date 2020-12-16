package servlets;

import models.StudyForm;
import models.University;
import services.UniversityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/universityServlet")
public class UniversityServlet extends HttpServlet {

    private UniversityService universityService = new UniversityService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int specialityNumber = Integer.parseInt(req.getParameter("specialtyNumber"));
        int zno1 = Integer.parseInt(req.getParameter("zno1"));
        int zno2 = Integer.parseInt(req.getParameter("zno2"));
        int zno3 = Integer.parseInt(req.getParameter("zno3"));
        boolean budgetForm = Boolean.parseBoolean(req.getParameter("budgetForm"));
        boolean accommodation = Boolean.parseBoolean(req.getParameter("accommodation"));
        StudyForm studyForm = Enum.valueOf(StudyForm.class, req.getParameter("studyForm"));

        List<University> universityList = universityService.logicUniversityList(specialityNumber, zno1, zno2, zno3, budgetForm, accommodation, studyForm);

        req.setAttribute("universityList", universityList);
        req.getRequestDispatcher("page.jsp").forward(req, resp);

    }
}
