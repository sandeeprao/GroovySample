package com.sandeep.sample

import javax.swing.Spring.SumSpring;

	def sumOfMultiples(x)
	{
		def y = x
		def sum = 0 
		while(y--)
		{
			if(y%3 == 0||y%5 == 0)
			{
				sum =+ sum + y;
			}
		}
		sum
	}
 
	
	def fibnoacciNumbers(n,closure)
	{
		BigInteger x = 1
		 println 1
		BigInteger  y = 2
		BigInteger total = 0;
	  	 1.upto(n)
		  {
			  z=y
			  if(y%2==0)
			  total += y
			  println y
			  y = closure(x, y)
			  x=z
			  
		  }
		  total
	}

//	fibnoacciNumbers(10){x,y ->  x+y }
	println " sum is ${fibnoacciNumbers(10000){x,y ->  x+y }}";
	
	//	println sumOfMultiples(100)
	

