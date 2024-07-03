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
        b = a; // la class A n'extends pas B
        a = (A) b; // Correcte car la classe B extends à A
        a = null; // Correcte car les brackets sont vides.
        null = a; // null n'est pas une variable et ne peut donc pas étre asignée
        a = d;  // Correcte car la class D extends à A
        b = d; //la class B extends que à A
        a = e; // Correcte car E recupère les éléments de A par D
        d = e; // Correcte car E extend D

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

    private static void rechercher(A[] as){
    }

    private static void additionner(A[] as){
    }

}