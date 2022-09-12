package io.java.movieratings;

import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport{

	  private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	  //private final EntityManager em;
	  JdbcTemplate jdbcTemplate;

	  @Autowired
	  public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	  }
	
	  
	  
	  @Override
	  @Transactional
	  public void afterJob(JobExecution jobExecution) {
		  System.out.println("I AM HERE xxxxxxxxxxx");
		  
		  System.out.println("I AM HERE xxxxxxxxxxx");
		  System.out.println(jobExecution.getStatus());
	    if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
	      log.info("!!! JOB FINISHED! Time to verify the results");
	      System.out.println("I AM HERE 1111111111111111111");
	      
	    }
	  }

	
}
//jdbcTemplate.query("SELECT id, data_of_review FROM MOVIEREVIEWS",(rs, row) -> "Row x: "+rs.getString(1)+" Row y: "+rs.getString(2)).forEach(str -> System.out.println(str));


//jdbcTemplate.query("SELECT id, data_of_review FROM MOVIEREVIEWS",(rs, row) -> "Row x: "+rs.getString(1)+" Row y: "+rs.getString(2)).forEach(str -> System.out.println(str));