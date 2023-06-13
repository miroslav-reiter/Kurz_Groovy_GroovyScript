// 1. typ String ''
// Pravy String (Java String)
// java.lang.String
def s1 = 'Toto je String'

println s1
println s1.getClass().getName()

// 2. typ String ""
// GString Groovy 
// Podpora String interpolacia
def s2 = "\nToto je tiez String (GString) ${1+9}"
println s2
println s2.getClass().getName()

def pocetJablk = 3
def s3 = "\nToto je tiez String (GString) s premennou ${pocetJablk}"
println s3
println s3.getClass().getName()

println "Karol" + " " + "Eva"

// 3. typ String //
// Slash string
def s4 = /Toto je tiez string ${1+3}/
println s4
println s4.getClass().getName()


// 4. typ multi String  ''' '''
// Multiline String
def s5 = ''' 

Dnes je pekny den
Aj zajtra bude pekny den
...
'''

println s5
println s5.getClass().getName()

String s6 = "Adam Sangala"
println s6
println s6.getClass().getName()

s7 = "Maria"
println s7
println s7.getClass().getName()

