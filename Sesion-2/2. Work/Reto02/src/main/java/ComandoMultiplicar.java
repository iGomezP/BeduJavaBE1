public class ComandoMultiplicar extends ComandoCalculadora implements Comando{
    public ComandoMultiplicar (int counter, int valor){
        super (counter, valor);
    }

    public int ejecutar (){
        return counter * valor;
    }
}
