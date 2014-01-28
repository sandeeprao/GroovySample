package com.sandeep.sample
import com.sandeep.sample.BeanParameters
/*
print "Hello"
0.upto(2){println "Test For Loop $it" }
*/
//"ls -l".execute().text

//0.step(10,2) { print "$it"}
//def foo(str)
//{
//	str?.reverse();
//}
//println foo('evil');
//println foo(null)
//
//def openFile(fileName)
//{
//	new FileInputStream(fileName)
//}
//
//try
//{
//	openFile("No file")
//}
//catch(ex)
//{
//	print ex
//}


def test = new BeanParameters("Constructor")
print "$test.name"

test.access(30,20)

def var1 ="test", var2=" second"
(var1,var2)=[var2,var1]
print "$var1 and $var2"


