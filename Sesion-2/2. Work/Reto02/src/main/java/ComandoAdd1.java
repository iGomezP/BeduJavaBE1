public class ComandoAdd1 extends ComandoCalculadora implements Comando{
    public ComandoAdd1(int counter, int valor){
        super (counter, valor);
    }

    public int ejecutar() {
        return counter + valor;
    }
}
