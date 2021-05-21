package assignment.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.hrms.business.abstracts.JobTitleService;
import assignment.hrms.dataAccess.abstracts.JobTitleDao;
import assignment.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitlesDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}
	
	
	
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitlesDao.findAll();
	}

}
