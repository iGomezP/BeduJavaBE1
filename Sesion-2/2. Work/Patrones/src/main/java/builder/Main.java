package builder;

public class Main {
    public static void main (String [] args) throws Exception{
        Persona nacho = new PersonaBuilder("Nacho", "Gomez", "Puga")
                .estadoCivil("Casado")
                .edad(31)
                .direccion("Avenida siempre viva - 123")
                .genero("Masculino")
                .construir();

        System.out.println(nacho.toString());
    }
}
