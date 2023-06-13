/*
import static javax.swing.JOptionPane.showInputDialog
def menoPouzivatela = showInputDialog "Ako sa volas: "
println "Ahoj " + menoPouzivatela
println menoPouzivatela.getClass().getName()

*/

def readln = javax.swing.JOptionPane.&showInputDialog
def username = readln 'What is your name?'
println "Hello $username."