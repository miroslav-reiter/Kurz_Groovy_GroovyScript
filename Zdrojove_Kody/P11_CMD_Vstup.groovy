// Mus�te pretypovat na spr�vnu hodnotu
// toInteger, toDouble

print("Zadajte 1. ��slo: ");
def cislo1 = System.console().readLine().toDouble();
print("Zadajte 2. ��slo: ");
def cislo2 = System.console().readLine().toDouble();
printf("%.2f + %.2f = %.2f \n", [cislo1, cislo2, (cislo1 + cislo2)]);
