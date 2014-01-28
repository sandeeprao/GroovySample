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
 
	
	
		println sumOfMultiples(100)
	


