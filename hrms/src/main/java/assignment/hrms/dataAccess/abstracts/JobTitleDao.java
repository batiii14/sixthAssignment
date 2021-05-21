package assignment.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
	

}
