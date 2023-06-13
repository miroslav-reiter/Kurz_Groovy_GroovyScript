// Musíte pretypovat na správnu hodnotu
// toInteger, toDouble

print("Zadajte 1. èíslo: ");
def cislo1 = System.console().readLine().toDouble();
print("Zadajte 2. èíslo: ");
def cislo2 = System.console().readLine().toDouble();
printf("%.2f + %.2f = %.2f \n", [cislo1, cislo2, (cislo1 + cislo2)]);
