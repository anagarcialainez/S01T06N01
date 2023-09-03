package s01n01ex1;

public class NoGenericMethods <T>{
    private T primero;
    private T segunto;
    private T tercero;

    public NoGenericMethods(T primero, T segunto, T tercero) {
        this.primero = primero;
        this.segunto = segunto;
        this.tercero = tercero;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getSegunto() {
        return segunto;
    }

    public void setSegunto(T segunto) {
        this.segunto = segunto;
    }

    public T getTercero() {
        return tercero;
    }

    public void setTercero(T tercero) {
        this.tercero = tercero;
    }
}
