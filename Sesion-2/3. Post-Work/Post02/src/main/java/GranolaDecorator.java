public class GranolaDecorator implements Helado{
    private Helado helado;

    public GranolaDecorator(Helado helado){
        this.helado = helado;
    }

    @Override
    public java.lang.String getDescription() {
        return helado.getDescription() + ", con Granola extra";
    }

    @Override
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}
