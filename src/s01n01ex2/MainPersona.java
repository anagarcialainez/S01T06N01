package s01n01ex2;

public class MainPersona {
    public static void main(String[] args) {


        //instanceamos la clase Persona
        Persona persona1 = new Persona("Juan", "Perez", 30);

        //llamamos al método genérico con diferentes tipos de parametros
        GenericMethods.imprimirArgumentos(persona1,"Hola, esto es una prueba",44);

    }
}

/*Crea una clase llamada Persona con los atributos nombre, apellido y edad. Después crea una clase llamada
GenericMethods cuyo método genérico acepte tres argumentos de tipo genérico.
Este método sólo debe imprimir por pantalla los argumentos que ha recibido. En el main() de la clase principal,
llama al método genérico con diferentes tipos de parámetros.

Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.

De esta forma has comprobado que se le puede pasar cualquier tipo de parámetro y en cualquier orden.
*/
