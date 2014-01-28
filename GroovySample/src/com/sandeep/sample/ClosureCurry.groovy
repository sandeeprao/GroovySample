package com.sandeep.sample

def printUptoNumber(n,closure)
{
	x = "printingValue "
	def curriedClosure = closure.curry(x)
	//for(i in 0..n)
	1.upto(n)
	{
		curriedClosure it
		
	}
}

printUptoNumber(5){x,y->println "Testing ${x} : ${y}"}
