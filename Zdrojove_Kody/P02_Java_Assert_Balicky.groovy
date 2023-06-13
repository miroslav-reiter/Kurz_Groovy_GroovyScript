// Preferovane
// Ahoj, Svet! - Groovy
/*
println "It's a alive"

println 'Its a alive'
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("It's as alive 2");
    }
}

// V Groovy je vsetko objekt
// premenna typu Integer (Cele cisla)
int a = 1
int b = 2

// true, false
boolean c = true

println a+b
assert 3 == a + b
println "Test presiel TC01 OK"

assert 3 == a + b + 3 / a * (a ** 2 - b) + 3
println "Test presiel TC02 OK"


/*
Exception thrown

groovy.lang.MissingMethodException: No signature of method: java.lang.Integer.call() is applicable for argument types: (Integer) values: [0]
Possible solutions: wait(), any(), abs(), wait(long), wait(long, int), max(int, int)

*/


// Automaticke importy
// Nemusis pisat zakladne importy...
/*
java.lang.*
java.util.*
java.net.*
java.io.*
java.math.BigInteger.*
java.math.BigDecimal.*
groovy.lang.*
groovy.util.*
*/
