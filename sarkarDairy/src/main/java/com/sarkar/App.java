package com.sarkar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sarkar.model.User;
import com.sarkar.repository.UserRepository;


/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	@Autowired
	private UserRepository repository;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    public void run(String...args) {
    	log.info("starting application.....");
    	
    	repository.save(new User("sarkargo", "Can123"));
    	repository.save(new User("gobinda","sarkar"));
    	
    	
    	System.out.println("Find all ");
    	repository.findAll().forEach(x->System.out.println(x));
    	
    }
}
