public class Ford extends Carro implements Vehiculo{

    @Override
    public void tanque() {
        System.out.println(" Por favor tanque el carro");

    }

    @Override
    public void Apagar() {
        System.out.println(" Colocar en primera el carro a lo que se apage  ");

    }

    @Override
    public void encender() {
        System.out.println(" Para encender su carro verifique que este en neutro los cambios");
    }

    @Override
    public void frenar() {
        System.out.println("El carro bajo drasticamente su velocidad");

    }
}
