class Zamestnanec {
    /** the name of the person */
    String name

    /**
     * Creates a privitating method for a certain person.
     *
     * @param otherPerson the person to privitat
     * @return a privitating message
     */
    static String privitat(String otherPerson) {
       "Dobry den, pan ${otherPerson} a majte pekny den"
    }
    
    static void main(args) {  
        println "Toto je 2. priklad s triedou..."  
        println privitat("Adam")
    } 
    
}