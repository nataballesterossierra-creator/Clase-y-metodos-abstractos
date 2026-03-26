//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota .setModelo("Toyota Hilux");
        toyota.setColor(" Gris verdoso");
        toyota.encender();
        toyota.tanque();
        toyota.frenar();
        toyota.Apagar();

        System.out.println("---------------------------");

        Ford carro = new Ford();
       carro.setModelo("Modelo Hibrido");
        carro.setColor("Negra");
        carro.encender();
        carro.tanque();
        carro.frenar();
        carro.Apagar();



    }
}