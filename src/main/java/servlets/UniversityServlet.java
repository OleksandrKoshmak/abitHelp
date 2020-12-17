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
import java.util.*;

@WebServlet("/universityServlet")
public class UniversityServlet extends HttpServlet {

    private UniversityService universityService = new UniversityService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Integer> result = new HashMap<>();
        int specialityNumber = Integer.parseInt(req.getParameter("specialtyNumber"));
         putResultInMap(req, result, "zno1", "Предмет ЗНО 1:");
         putResultInMap(req, result, "zno2", "Предмет ЗНО 2:");
         putResultInMap(req, result, "zno3", "Предмет ЗНО 3:");
        boolean budgetForm = Boolean.parseBoolean(req.getParameter("Бюджет/контракт:"));
        boolean accommodation = Boolean.parseBoolean(req.getParameter("Наявність гуртожитку:"));
        StudyForm studyForm = Enum.valueOf(StudyForm.class, req.getParameter("Форма навчання:"));

       List<University> universityList = universityService.logicUniversityList(specialityNumber, result, budgetForm, accommodation, studyForm);

       req.setAttribute("universityList", universityList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }

    private void putResultInMap(HttpServletRequest req, Map<String, Integer> result, String zno12, String s) {
        int zno1 = Integer.parseInt(req.getParameter(zno12));
        String subject1 = req.getParameter(s);
        result.put(subject1, zno1);

    }
}
