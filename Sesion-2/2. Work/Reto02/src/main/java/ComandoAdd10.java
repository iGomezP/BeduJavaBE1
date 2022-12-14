public class ComandoAdd10 extends ComandoCalculadora implements Comando{
    public ComandoAdd10 (int counter, int valor){
        super (counter, valor);
    }

    public int ejecutar(){
return counter + valor;
    }
}
