package com.sandeep.sample
/*
print "Hello"
0.upto(2){println "Test For Loop $it" }
*/
//"ls -l".execute().text

0.step(10,2) { print "$it"}
def foo(str)
{
	str?.reverse();
}
println foo('evil');
println foo(null)

def openFile(fileName)
{
	new FileInputStream(fileName)
}

try
{
	openFile("No file")
}
catch(ex)
{
	print ex
}