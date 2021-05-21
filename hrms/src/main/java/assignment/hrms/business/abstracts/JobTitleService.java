package assignment.hrms.business.abstracts;

import java.util.List;

import assignment.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	List<JobTitle> getAll();

}
