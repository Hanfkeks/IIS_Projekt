package thi.iis.project.pruefungen.webservices;

import java.util.Date;

import javax.inject.Inject;
import javax.jws.WebService;

import thi.iis.project.pruefungen.jpa.entities.Deadline;
import thi.iis.project.pruefungen.jpa.services.DeadlineService;

/**
 * WebService for Deadline Modification
 * @author Katrin Krüger
 *
 */
@WebService
public class DeadlineWebService {

    @Inject
    DeadlineService deadlineService;

    public Deadline createDeadline(Date date, String deadlineName){
        Deadline deadline = new Deadline(date, deadlineName);
        deadlineService.create(deadline);
        return deadline;
    }
}
