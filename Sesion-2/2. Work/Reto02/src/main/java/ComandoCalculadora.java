public class ComandoCalculadora {
    protected int counter;

    protected int valor;

    public ComandoCalculadora(int counter, int valor) {
        this.counter = counter;
        this.valor = valor;
    }

    public int deshacer () {
        return counter;
    }
}
