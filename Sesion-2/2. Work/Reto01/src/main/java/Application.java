public class Application {

    public static void main(String [] args) {
        Motor motor = new MotorAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
