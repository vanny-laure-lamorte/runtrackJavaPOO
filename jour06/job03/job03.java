package jour06.job03;

public class job03 {
    public static void main(String[] args) {

        int T [] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.err.println(T[0]);
        System.err.println(T[1]);
        System.err.println(T[5]);
        System.err.println(T[9]);

        // L'indice 10 ne peut pas être affiché car c'est "out of bounds"
        System.err.println(T[10]);        
    }
    
}
