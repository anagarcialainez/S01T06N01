package s01n01ex1;

import java.net.SocketOption;

public class MainNoGenericMethods {
    public static void main(String[] args) {
        NoGenericMethods<Integer> obj1 = new NoGenericMethods<>(1,2,3);
        NoGenericMethods<String> obj2 = new NoGenericMethods<>("A","B","C");

        System.out.println("Objeto 1 -primero:" + obj1.getPrimero() );
        System.out.println("Objeto 2 -segundo: " + obj2.getSegunto());

    }
}
/*Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, junto con los métodos para
almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los argumentos pueden
ponerse en cualquier posición en la llamada al constructor.
 */
