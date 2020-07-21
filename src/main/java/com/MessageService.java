package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@GetMapping("/multiply/{m}/{n}")
	public String multiply(@PathVariable int m, @PathVariable int n){
	return "Multiplication of "+m+" and "+n+" is " +m*n; 
	}
	@GetMapping("/type/{m}")
	public String type(@PathVariable int m) {
	if ( m % 2 == 0 )
        return "Entered number is even";
     else
       return "Entered number is odd";

	}
	@GetMapping("/prime/{num}") 
	public String prime(@PathVariable int num) {
	int temp;
	boolean isPrime=true;
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
		if(isPrime)
		return num + " is a Prime Number";
		else
		return num + " is not a Prime Number";
	}

}	

