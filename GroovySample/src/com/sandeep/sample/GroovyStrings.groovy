package com.sandeep.sample


test = "Testing groovy"
testWithSingleQuotes = 'Testing single quotes'
printString = "$test with values"

printStringWithBackSlashes = /$test with back slashes/
println printString
println printStringWithBackSlashes

def printClassNames(input)
{
	println input.getClass()
	
}

printClassNames(test)
printClassNames(testWithSingleQuotes)
printClassNames(printString)
