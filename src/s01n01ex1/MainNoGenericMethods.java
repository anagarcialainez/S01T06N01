package s01n01ex1;

public class MainNoGenericMethods {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Ana","Bea","Noa");

        System.out.println("Objeto 1 : " + obj1.getDato1() + "," + obj1.getDato2() + "," + obj1.getDato3() );

    }
}
/*Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, junto con los métodos para
almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los argumentos pueden
ponerse en cualquier posición en la llamada al constructor.
 */
