package com;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.Scanner;
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
	@GetMapping("/cube/{m}")
	public int cube(@PathVariable int m){
	return m*m*m;
	}
	@GetMapping ("/greater/{m}/{n}/{o}") 
	public String greater(@PathVariable int m, @PathVariable int n, @PathVariable int o){
    	 if( m >= n && m >= o)
         return m+" is the largest Number";

      else if (n >= m && n >= o)
         return n+" is the largest Number";

      else
          return o+" is the largest Number";
	}
	@GetMapping("/area/{m}/{n}")
        public String area(@PathVariable int m, @PathVariable int n){
        double area = (m*n)/2;
        return "Area of Triangle having base"+m+" and width "+n+" is: " + area;
        }
	@GetMapping("/name/{m}/{n}")
	public String surname(@PathVariable String m, @PathVariable String n){
	return m+" "+ n;

	}

}	

