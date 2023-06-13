package control_flow
// Formatovanie ciselnych hodnot/mena
import java.text.NumberFormat
// Logovacie trieda
import java.util.logging.Logger

import static javax.swing.JOptionPane.showInputDialog

// Riadiace Struktury
// if, else, while, for

def sVekPouzivatela = showInputDialog "Kolko mas rokov: "
def iVekPouzivatela = sVekPouzivatela.toInteger()

println "Mas " + iVekPouzivatela + " rokov"
println iVekPouzivatela.getClass().getName()

// Relacne operatory
// > < == != >= <=
// Boolean operatory
// and log. sucin &&
// or log. sucet ||
// negacia !
// JDK 8/11
// Boolean.and
if (iVekPouzivatela >= 18)  {
    println "Dostanes vodicak..."
} else {
    println "Nedostanes vodicak..."
}

// Ternarny operator if else
def vysledok = 10>100 ? "OK" : "NG"

// Elvis operator
// def meno = "Elvis"
// coelasce, ifnull, nvl
def meno
def vysledok2 = meno ? meno : "Pavol"

