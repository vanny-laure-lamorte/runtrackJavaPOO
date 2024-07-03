package jour07.job05;

class ABCDEF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();

        a = b; // Correcte car la classe B extends à A
        //b = a; La class A n'extends pas B
        a = (A) b; // Correcte car la classe B extends à A
        a = null; // Correcte car les brackets sont vides.
        //null = a; Null n'est pas une variable et ne peut donc pas étre asignée
        a = d;  // Correcte car la class D extends à A
        //b = d; La class B extends que à A
        a = e; // Correcte car E recupère les éléments de A par D
        d = e; // Correcte car E extend D

        d = f;
        b = c;
   

        A[] as = new A[10];
        as[0] = new A();
        as[1] = new B();
        as[2] = new D(2);
        as[3] = new E();
        as[4] = new C();
        as[5] = new D(4);
        as[6] = new B();

        rechercher(as);
        additionner(as);

    }

    private static void rechercher(A[] as) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;

        for (A a : as) {
            if (a instanceof F) {
                countF++;
            }
             if (a instanceof E) {
                countE++;
            }
            if (a instanceof D) {
                countD++;
            }
            if (a instanceof C) {
                countC++;
            }
            if (a instanceof B) {
                countB++;
            }
            if (a instanceof A) {
                countA++;
            }
        }

        System.out.println("Il y a " + countA + " instance(s) de la classe A");
        System.out.println("Il y a " + countB + " instance(s) de la classe B");
        System.out.println("Il y a " + countC + " instance(s) de la classe C");
        System.out.println("Il y a " + countD + " instance(s) de la classe D");
        System.out.println("Il y a " + countE + " instance(s) de la classe E");
        System.out.println("Il y a " + countF + " instance(s) de la classe F");
    }
  
    private static void additionner(A[] as) {
        int sum = 0;

        for (A a : as) {
            if (a instanceof D) {
                sum += ((D) a).d;
            }
        }

        System.out.println("La somme des variables d est: " + sum);
    }
}
