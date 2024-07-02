package jour07.job01;

class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto t1: " + t1.toto);
        System.out.println("Toto t2: " + t2.toto);
    }
}

/*  
Le code ne fonctionne pas car l'instance "t1" et "t2" n'est pas utilisé dans le print. 
    Toto t1: " + toto" (version incorrecte)
    Toto t1: " + t1.toto" (version correcte)
*/