def text = "Toto je priklad na retazec"
text + "a toto je dalsi retazec"
text - "je"

def slovo = "Na"
slovo*5

// println text

def veta = "toto je kratka veta"
// Prvy znak, 0. index - t
veta[0]
veta[-1]
veta[5]

veta[0,1,2,4]
veta[-1,-5,-3]

// Range - Slicing
// Python
// veta[0:3]
// Groovy
veta[0..3]
def tmp = veta[0..8]
println tmp.getClass().getName()

veta[-4..-1]
// veta[-1..-4]


// Kombinacia
def sprava = "Nalodenie prebehne zajtra o polnoci"
// Result: 'Nalodenie zajtra o polnoci'
sprava[0..8, 18..-1]
// Result: 'Nalodenie zajtra polnoc'
sprava[0..8, 18..-11, 27..-2]

println sprava.reverse()


