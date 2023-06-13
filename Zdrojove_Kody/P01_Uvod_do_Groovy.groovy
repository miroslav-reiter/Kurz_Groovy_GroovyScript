#!/usr/bin/env groovy
1+3
2*3
-9-9
2**3
// 2.5
5/2
5%2

// 0/0

// Jednoriadkovy komentar
/*
    Toto je 
    Viacriadkovy
    Komentar
*/

4 + /* Inline komentar */ 2


/**
      Dokumentacny komentar
	Kurz: Groovy
	Author: Miroslav Reiter
	Email: miroslav.reiter@it-academy.sk
	Verzia: 1.0
	Rok: 2023
*/



// Groovy - Python 3.0
println("1. Testuje Groovy...")

// Groovy - Python 2.0, Bash Linux, * Preferovany
println "2. Testuje Groovy..."

// Groovy - Java - menej striktny
System.out.println("3. Testuje Groovy...")

// Groovy - Java - menej striktny
System.out.println("3. Testuje Groovy...");

Math.abs(-9)
Math.sqrt(25)

// Zoznam, List
zoznamCisel = [1,2,3,4,5, true, "Adam Sangala"]
println("Zoznam cisel je: " + zoznamCisel)
println("Zoznam cisel velkost: " + zoznamCisel.size())

// Funkcia, Metoda
// Proceduralny sposob programovanie
void vypisAhoj(String meno){
    println "Ahoj ${meno} a maj pekny den"
}

meno = "Adam"
vypisAhoj(meno)

vypisAhoj("Eva")

// Priradenie =
a = 1

// Porovnanie ==
// Meta programovanie, funckionalne programovanie
String.metaClass.isPalindrome = {
    -> delegate == delegate.reverse()
}

"level".isPalindrome()
"mama".isPalindrome()

Number.metaClass {
    odmocnina = {Math.sqrt(delegate)}
}

9.odmocnina()

f = 81
f.odmocnina()
