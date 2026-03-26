public class Toyota extends Carro implements Vehiculo {

    @Override
    public void tanque() {
        System.out.println(" La camioneta toyota esta full");
    }

    public void Apagar() {
        System.out.println("La camioneta esta apagando");
    }

    @Override

    public void encender() {
        System.out.println(" La camioneta encendió rápidamente.");
    }

    @Override
    public void frenar() {
        System.out.println("La camioneta bajo su velocidad .");
    }

}