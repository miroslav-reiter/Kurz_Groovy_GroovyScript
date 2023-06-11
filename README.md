# ⭐ Materiály ku kurzu Groovy (GroovyScript)

[Kurz Groovy](https://www.it-academy.sk/kategoria/programovacie-jazyky/kurzy-groovy/) je pre vás ideálnym štartom, ak sa chcete vyznať v objektovo orientovanom programovacom jazyku Groovy. Oboznámime vás so základmi jazyka Groovy, prejdeme si inštaláciu vývojových prostredí a dokumentáciou. Ukážeme si, ako využívať Groovy knižnicu a rôzne dátové typy. Ako absolvent kurzu Groovy zvládnete základy práce s Groovy, porozumiete jeho ekosystému a budete schopný vykonávať základné testovanie.

## ❓ Čo je Groovy (GroovyScript)
Groovy je **objektovo orientovaný programovací jazyk** pre **platformu Java**. Ide o **alternatívu** k programovaciemu jazyku **Java**. Možno naň pozerať ako na **skriptovací jazyk** pre javovskú platformu. Inšpiráciu čerpal z jazykov Python, Ruby, Perl a Smalltalk. Využíva **výhody objektového programovania**, ale zároveň poskytuje **zjednodušenú "skriptovaciu" syntax**, ktorá vie "zabaliť a rozbaliť" často opakované časti kódu. 
Jedným z jeho cieľov je **redukovať "povinný" kód** a zjednodušiť tak tvorbu webových, databázových či desktopových aplikácií. 
Kompilácia je **vykonávaná priamo do bajtkódu**, takže ho môžeme použiť všade tam, kde funguje Java.

## 🙋 Verzie Groovy
Najaktuálnešia/najnovšia verzia je **4.0.12**. V praxi sú bežne aj verzie: 3.0 a 2.5. 

<img width="688" alt="11 06 2023 15_23_39-The Apache Groovy programming language - Download – Opera" src="https://github.com/miroslav-reiter/Kurz_Groovy_GroovyScript/assets/24510943/00b1a2bb-d98d-4c40-862b-fc1b974a3d3f">

**TIP 1:** Verziu Groovy zistíme v Groovy Console na Karte Help (Pomocník) > About (O Programe) a stavovom riadku (spodný riadok aplikácie)
<img width="498" alt="groovy-01" src="https://github.com/miroslav-reiter/Kurz_Groovy_GroovyScript/assets/24510943/caf61d62-1d1c-4329-a039-96362b419652">

**TIP 2:** Verziu vieme zistiť aj Groovy Shelly a to rovno po spustení
<img width="740" alt="11 06 2023 15_27_07-Groovy Shell" src="https://github.com/miroslav-reiter/Kurz_Groovy_GroovyScript/assets/24510943/2dd8585b-b501-4411-9d64-9f74a2067701">

**TIP 3:** Verziu vieme zistiť aj CMD (Príkazovom riadku) to pomocou príkazov groovyc -v, groovyc --version (Groovy Complier) alebo groovy -v, groovy --version (Groovy Interpreter) 
<img width="578" alt="11 06 2023 15_29_10-Administrator_ C__Windows_System32_cmd exe" src="https://github.com/miroslav-reiter/Kurz_Groovy_GroovyScript/assets/24510943/c274b6b1-825b-4c1a-9f47-4c57076fc097">


<img width="578" alt="11 06 2023 15_29_50-Administrator_ C__Windows_System32_cmd exe" src="https://github.com/miroslav-reiter/Kurz_Groovy_GroovyScript/assets/24510943/947299c8-c001-449d-b01d-e26e27291be3">


## ⚓ Odkazy na kurzy
[Prezenčné Kurzy Groovy](https://www.it-academy.sk/kurz/groovy-i-zaciatocnik/))    
[Online Kurz Groovy](https://www.vita.sk/online-kurz-groovy-i-zaciatocnik/)  

## 📁 Súbory a Materiály
Dostupné na GitHube alebo na kurze od lektora

## 📔 Inštalácia a SW pre programovanie a skriptovanie v Groovy
1. [Oracle Java SE JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
1. [Oracle Java SE JDK 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
1. [Aapche Groovy Microsoft Windows Installer, Groovy Console](https://groovy.jfrog.io/ui/native/dist-release-local/groovy-windows-installer/groovy-4.0.12/)
1. [Apache Groovy SDK](https://groovy.jfrog.io/ui/native/dist-release-local/groovy-zips/apache-groovy-sdk-4.0.12.zip)
1. [Apache Netbeans 18](https://netbeans.apache.org/download/nb18/index.html)
1. [Editor Microsoft Visual Studio Code](https://code.visualstudio.com/ )
1. [Notepad++](https://notepad-plus-plus.org/downloads/v8.5.3/)
1. [Písmo Fire_Code](https://github.com/tonsky/FiraCode)
1. [Groovy IDE](https://groovyide.com/playground)
1. [Groovy Online](https://www.jdoodle.com/execute-groovy-online/)

## 📔 Dokumentácia a Zdroje Groovy
1. [Stiahnutie Groovy](https://groovy-lang.org/)
1. [GitHub Groovy](https://github.com/apache/groovy)
1. [Pomocník Dokumentácia Groovy](https://www.ibm.com/docs/en/spss-statistics/saas?topic=statistics-coach)
1. [Dokumentácia CZ Groovy](https://www.ibm.com/support/pages/node/6607043#cs)
8. [Groovy Tutorialy](https://www.spss-tutorials.com/)
9. [Groovy Tipy](https://www.spssanalyticspartner.com/analytics-resources/ibm-spss-technical-tips/))

## 📈 YouTube video záznamy z kurzy a prednášok Playlist (Programovacie Jazyky)
[YouTube kanál IT Academy](https://www.youtube.com/watch?v=16mOykzIcYU&list=PLIu_ZdHo7Pk-u7vjIzelqSpYtYpP1lhIU&index=45) 

## 📎 Obsah Kurzu
### I. Úvod do jazyka Groovy

## Premenné Prostredia (Systémové Premenné - Environ)
```
GROOVY_HOME - C:\Program Files (x86)\Groovy\
Path - %GROOVY_HOME%bin
Java - C:\Program Files\Common Files\Oracle\Java\javapath;
```

## Ahoj, Svet! (Hello, World!)
```groovy
// Toto je jednoriadkovy komentár
// Používateľský výstup na obrazovku, Výpis do Konzoly
// Groovy - 1 Riadok
println "Ahoj, Svet!"
```
```
groovy AhojSvet.groovy
```
```java
// Java - 5-7 Riadkov spolu s balíčkom
public class Main {
    public static void main(String[] args) {
        System.out.println("It's as alive");
    }
}
```
## Triedy (Classes)
```groovy
package sk.itacademy 
class Main {  
    static void main(args) {  
        print "Toto je priklad s triedou..."  
        print "Toto je dalsi text...\n"
        println "Toto je dalsi riadok..."
        println "Toto je posledny riadok..."
    }  
}  
```
