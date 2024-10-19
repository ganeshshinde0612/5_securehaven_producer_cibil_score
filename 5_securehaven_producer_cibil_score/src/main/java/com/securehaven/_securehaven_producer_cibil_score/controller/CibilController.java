package com.securehaven._securehaven_producer_cibil_score.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.securehaven._securehaven_producer_cibil_score.model.CibilScore;
import com.securehaven._securehaven_producer_cibil_score.model.SBI;

@CrossOrigin
@RestController
public class CibilController {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/get_cibil_score")
	public ResponseEntity<CibilScore> generateCibil()
	{
//		String url="http://localhost:9097/getCustomer/"+pancard;
//		SBI customer=rt.getForObject(url, SBI.class);
		
		int min = 600;
		int max = 1000;

		int f = min + (int) (Math.random() * ((max - min) + 1));
		
		CibilScore c=new CibilScore();
		
		if(f >=600 && f<=700)
		{
			c.setCibilScore(f);
			c.setStatus("Average");
			
			return new ResponseEntity<CibilScore>(c, HttpStatus.OK);
		}
		
		else if(f >=701 && f <= 899)
		{
			c.setCibilScore(f);
			c.setStatus("Good");
			
			return new ResponseEntity<CibilScore>(c, HttpStatus.OK);
		}
		
		else
		{
			c.setCibilScore(f);
			c.setStatus("Excellent");
			
			return new ResponseEntity<CibilScore>(c, HttpStatus.OK);
		}
		
	}

}
