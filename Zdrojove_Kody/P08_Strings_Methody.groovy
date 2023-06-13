
def priezvisko = "Bond"

/* K reùazcu mÙûete pristupovaù podæa indexu
println("3. Index priezvisko " + priezvisko[3]);
println("Index znaku o " + priezvisko.indexOf('o'));
*/

// MÙûete dostaù aj orezanie
println("Prve 3. Znaky " + priezvisko[0..2]);

// ZÌskajte konkrÈtne Znaky
println("Znak 0 2 3 " + priezvisko[0,2,3]);

// Get Znaky starting at index
println("Substring at 1 " + priezvisko.substring(1));

// Get Znaky at index up to another
println("Substring at 1 to 4 " + priezvisko.substring(1,4));

// Zreùazenie reùazcov
println("Moje priezvisko " + priezvisko);
println("Moje priezvisko ".concat(priezvisko));

// Opakovanie reùazca
def opakovanyStr = "»o som povedal, je" * 2;
println(opakovanyStr);

// Kontrola rovnosti
println("Bond == Bond : " + ('Bond'.equals('Bond')));
println("Bond == bond : " + ('Bond'.equalsIgnoreCase('bond')));

// ZÌskanie dÂûky reùazca
println("Velkost: " + opakovanyStr.length());

// Odstr·nenie prvÈho v˝skytu
println(opakovanyStr - "»o");

// Rozdelenie reùazca
println(opakovanyStr.split(' '));
println(opakovanyStr.toList());

// VymeÚte vöetky reùazca
println(opakovanyStr.replaceAll('som povedal', 'sme povedali'));

// VeækÈ a malÈ pÌsmen·
println("Uppercase " + priezvisko.toUpperCase());
println("Lowercase " + priezvisko.toLowerCase());

// <=> vr·ti hodnotu -1, ak je 1. reùazec pred 2. reùazcom
// 1 ak je opak a 0 ak sa rovn·
println("Ananas <=> Banan " + ('Ananas' <=> 'Banan'));
println("Banan <=> Ananas " + ('Banan' <=> 'Ananas'));
println("Ananas <=> Ananas " + ('Ananas' <=> 'Ananas'));

// compareTo
def a = 3 <=> 1;
println a