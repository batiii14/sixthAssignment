package assignment.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import assignment.hrms.business.abstracts.JobTitleService;
import assignment.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitlesController {
	
	
	private JobTitleService JobTitleService;
	
	@Autowired
	public JobTitlesController(assignment.hrms.business.abstracts.JobTitleService jobTitleService) {
		super();
		JobTitleService = jobTitleService;
	}


	@GetMapping("/getall")
	public  List<JobTitle> getAll(){
		return this.JobTitleService.getAll();
	}
	
	

}
