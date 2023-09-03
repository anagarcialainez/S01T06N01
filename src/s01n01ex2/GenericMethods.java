package s01n01ex2;

public class GenericMethods {
    public static <T,U,K> void imprimirArgumentos(T arg1, U arg2, K arg3){
        System.out.println("Argumento 1: " + arg1);
        System.out.println("Argumento 2: " + arg2);
        System.out.println("Argumento 3: " + arg3);

    }
}
