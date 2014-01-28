package com.sandeep.sample

import javax.swing.Spring.SumSpring;


def arthmetic(n,operation)
{
	for(i in 0..n)
	{
		operation(i)
	}
}

//sumOperation(intialValue, i){intialValue +=i}
	total = 0
	arthmetic(3){total +=it}
println "sum of numbers ${total}"
