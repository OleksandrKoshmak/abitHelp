package services;

import dao.UniversityDao;
import models.Specialty;
import models.StudyForm;
import models.Subject;
import models.University;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class UniversityServiceTest {
    @InjectMocks
    private UniversityService universityService;

    @Mock
    private UniversityDao universityDao;


    @Before
    public void setUp()  {
        MockitoAnnotations.initMocks(this);

        University university = new University(1, "DUIT", "www.duit.com", "09111111", "doit.@gmail.com", StudyForm.FULlTIME_FORM, true, true, null);
        University university2 = new University(2, "NAU", "www.NAU.com12341234124", "09111111", "nau.@gmail.com", StudyForm.FULlTIME_FORM, false, true, null);
        University university3 = new University(3, "KPI", "www.KPI.com12341234124", "09111111", "kpi.@gmail.com", StudyForm.DISTANCE_FORM, false, true, null);
        Subject subject1 = new Subject(1, "Українська мова", 130);
        Subject subject2 = new Subject(2, "Математика", 120);
        Subject subject3 = new Subject(3, "Географія", 120);
        Specialty specialty = new Specialty(1, 111, "Law");
        specialty.setSubjectList(Arrays.asList(subject1, subject2, subject3));
        university.setSpecialtyList(Collections.singletonList(specialty));
        university2.setSpecialtyList(Collections.singletonList(specialty));
        university3.setSpecialtyList(Collections.singletonList(specialty));
        List<University> mockResult = Arrays.asList(university2, university,university3);

        when(universityDao.getAllUniversity()).thenReturn(mockResult);
    }

    @Test
    public void testReturnedTwoUniversities()  {
        // before
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Українська мова", 150);
        marks.put("Математика", 150);
        marks.put("Географія", 150);

        //when
        List<University> universities = universityService.logicUniversityList(111, marks, false, true, StudyForm.FULlTIME_FORM);

        //than
        assertEquals(2, universities.size());
    }
    @Test
    public void testReturnedOneUniversityWithBudget()  {
        // before
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Українська мова", 150);
        marks.put("Математика", 150);
        marks.put("Географія", 150);
        University expectedUniversity = new University(1, "DUIT", "www.duit.com", "09111111", "doit.@gmail.com", StudyForm.FULlTIME_FORM, true, true, null);


        //when
        List<University> universities = universityService.logicUniversityList(111, marks, true, true, StudyForm.FULlTIME_FORM);

        //than
        assertEquals(1, universities.size());
        assertEquals(expectedUniversity,universities.get(0));
    }

    @Test
    public void testReturnedUniversityWithDistanceForm()  {
        // before
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Українська мова", 150);
        marks.put("Математика", 150);
        marks.put("Географія", 150);
        University expectedUniversity = new University(3, "KPI", "www.KPI.com12341234124", "09111111", "kpi.@gmail.com", StudyForm.DISTANCE_FORM, false, true, null);

        //when
        List<University> universities = universityService.logicUniversityList(111, marks, false, true, StudyForm.DISTANCE_FORM);

        //than
        assertEquals(1,universities.size());
        assertEquals(expectedUniversity,universities.get(0));

    }

    @Test
    public void testReturnedUniversityNotFound() {
        //before
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Українська мова", 120);
        marks.put("Математика", 150);
        marks.put("Географія", 150);

        //when
        List<University> universities = universityService.logicUniversityList(111, marks, true, true, StudyForm.FULlTIME_FORM);

        //then
        assertEquals(0, universities.size());
    }
}