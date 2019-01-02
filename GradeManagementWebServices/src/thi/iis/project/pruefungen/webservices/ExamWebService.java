package thi.iis.project.pruefungen.webservices;

import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebService;

import thi.iis.project.pruefungen.jpa.entities.Exam;
import thi.iis.project.pruefungen.jpa.services.ExamService;

/**
 * WebService for Exam Modifications
 * @author Katrin Krüger
 *
 */
@WebService
public class ExamWebService {

    @Inject
    ExamService examService;

    public Exam updateExamdate(String name, Date date){
        Exam exam = examService.selectByName(name);
        exam.setDate(date);
        examService.update(exam);
        return exam;
    }
}
