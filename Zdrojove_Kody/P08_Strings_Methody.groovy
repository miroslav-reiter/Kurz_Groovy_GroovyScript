
def priezvisko = "Bond"

/* K re�azcu m��ete pristupova� pod�a indexu
println("3. Index priezvisko " + priezvisko[3]);
println("Index znaku o " + priezvisko.indexOf('o'));
*/

// M��ete dosta� aj orezanie
println("Prve 3. Znaky " + priezvisko[0..2]);

// Z�skajte konkr�tne Znaky
println("Znak 0 2 3 " + priezvisko[0,2,3]);

// Get Znaky starting at index
println("Substring at 1 " + priezvisko.substring(1));

// Get Znaky at index up to another
println("Substring at 1 to 4 " + priezvisko.substring(1,4));

// Zre�azenie re�azcov
println("Moje priezvisko " + priezvisko);
println("Moje priezvisko ".concat(priezvisko));

// Opakovanie re�azca
def opakovanyStr = "�o som povedal, je" * 2;
println(opakovanyStr);

// Kontrola rovnosti
println("Bond == Bond : " + ('Bond'.equals('Bond')));
println("Bond == bond : " + ('Bond'.equalsIgnoreCase('bond')));

// Z�skanie d�ky re�azca
println("Velkost: " + opakovanyStr.length());

// Odstr�nenie prv�ho v�skytu
println(opakovanyStr - "�o");

// Rozdelenie re�azca
println(opakovanyStr.split(' '));
println(opakovanyStr.toList());

// Vyme�te v�etky re�azca
println(opakovanyStr.replaceAll('som povedal', 'sme povedali'));

// Ve�k� a mal� p�smen�
println("Uppercase " + priezvisko.toUpperCase());
println("Lowercase " + priezvisko.toLowerCase());

// <=> vr�ti hodnotu -1, ak je 1. re�azec pred 2. re�azcom
// 1 ak je opak a 0 ak sa rovn�
println("Ananas <=> Banan " + ('Ananas' <=> 'Banan'));
println("Banan <=> Ananas " + ('Banan' <=> 'Ananas'));
println("Ananas <=> Ananas " + ('Ananas' <=> 'Ananas'));

// compareTo
def a = 3 <=> 1;
println a