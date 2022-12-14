package comportamiento;

public class ComandoDividir extends ComandoCalculadora implements Comando {
    public ComandoDividir(float acumulador, float valor){
        super(acumulador, valor);
    }
    public float ejecutar(){
        float notZero;
        if (valor != 0 && acumulador != 0){
            notZero = acumulador / valor;
        } else {
            System.out.println("No se puede dividir entre cero.");
            notZero = acumulador;
        }
        return notZero;
    }
}
