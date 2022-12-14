package singleton;

// Patron de tipo creacional

public class Singleton {
    private String value;
    // un objeto de la misma clase
    private static Singleton instance;

    private Singleton ( String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    // singleton
    // singleton es perfecto para una conexión a una BD
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
