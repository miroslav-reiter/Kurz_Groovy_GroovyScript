
// java.lang.Integer
// objekt typu Integer
// Dynamicke typovanie (Dynamic typing)
def x = 1
println x.getClass().getName()

// java.lang.String
def y = "1"
println y.getClass().getName()

// x = "Karol"
println x.getClass().getName()

// java.util.Date
def datum = new Date()
println datum.getClass().getName()


// Staticke typovanie
int a = 1
println a.getClass().getName()
// GroovyCastException
// a = "Som cislo 1"

Integer i = 1
println i.getClass().getName()


def abc = 1
assert abc.getClass() == java.lang.Integer
println "\nTest Presiel TC01 OK \nTestoval: Fero\n"

abc = new Date()
assert abc.getClass() == java.util.Date
println "Test Presiel \t TC02 OK"

/*
abc = "abc"
assert abc.getClass() == java.util.Date
println "Test Presiel TC03 OK"
*/

assert x.getClass() == java.lang.String
println "Test Presiel TC04 OK"


// Ukoncovacie sekvencie (Escaped sequences)
// \n new line novy riadok br
// \t tab tabular
// \" "
// \' '
// \f form feed



