

// 'java.lang.Integer'
3.getClass().getName()

// 'java.lang.Long'
33333333333.getClass().getName()

// 'java.math.BigInteger'
3333333333333333333333.getClass().getName()

// 'java.math.BigDecimal'
3.33.getClass().getName()
(3.33).getClass().getName()

// java.lang.Double
println 2.0d.getClass().getName()
println 2.0d - 1.1d

// 'java.math.BigDecimal'
println 2.0 - 1.1

// Realne Delenie
println 3/5

println 3.33.getClass().getName()
println ((3.33).getClass().getName())


// Základné celoèíselné matematické operátory
println "Základné celoèíselné matematické operátory"
println("2 + 3 = " + (2 + 3));
println("2 - 3 = " + (2 - 3));
println("2 * 3 = " + (2 * 3));
// Celociselne delenie
println("2 / 3 = " + (2.intdiv(3)));
// Modulo, delenie so zvysky
println("2 % 3 = " + (2 % 3));


// Matematické operátory s plávajúcou desatinnou èiarkou
println "Matematické operátory s plávajúcou desatinnou èiarkou"
println("2.2 + 3.3 = " + (2.2.plus(3.3)));
println("2.2 - 3.3 = " + (2.2.minus(3.3)));
println("2.2 * 3.3 = " + (2.2.multiply(3.3)));
println("2.2 / 3.3 = " + (2.2 / 3.3));


// Poradie operácií
println "Poradie operácií"
println("3 + 2 * 2 = " + (3 + 2 * 2));
println("(3 + 2) * 2 = " + ((3 + 2) * 2));


// Inkrementacia a Dekrementacia
def vek = 35
println "Inkrementacia a Dekrementacia"

// 88 + 55
println("vek++ = " + (vek++));
println("++vek = " + (++vek));
println("vek-- = " + (vek--));
println("--vek = " + (--vek));

// Najväèšie hodnoty
println "Najväèšie hodnoty"
println("Najväèší Int " + Integer.MAX_VALUE);
println("Najmenší Int " + Integer.MIN_VALUE);

println("Najväèší Float " + Float.MAX_VALUE);
println("Najmenší Float " + Float.MIN_VALUE);

println("Najväèší Double " + Double.MAX_VALUE);
println("Najmenší Double " + Double.MIN_VALUE);



// Desatinná presnos
println "Desatinná presnos"
println("1.1000000000000001 + 1.1000000000000001 "
+ (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));
//
//assert 5.getClass() == java.lang.Integer
//println "\nTC01 - Je to java.lang.Integer"
//
//assert 5555555555.getClass() == java.lang.Long
//println "\nTC02 - Je to java.lang.Long"
//
assert 55555555555555555555.getClass() == java.math.BigInteger
println "\nTC03 Je to java.math.BigInteger"

assert (5.5).getClass() == java.lang.Double
println "Je to java.lang.Double"

assert (2/3).getClass() == java.lang.Double
println "Je to java.lang.Double"