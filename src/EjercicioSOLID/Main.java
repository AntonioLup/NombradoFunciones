package EjercicioSOLID;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehiculoElectrico hibrido = new VehiculoElectrico();
        VehiculoCombustible combustible = new VehiculoCombustible();

        Scanner respuesta = new Scanner(System.in);
        System.out.println("que coche tienes?");
        System.out.println("gasolina, combustible o hibrido");
        String coche = respuesta.nextLine();

        if (coche.equals("gasolina")){
            System.out.println("pues pondre gasolina");
        } else if (coche.equals("combustible")){
            combustible.setModelo("peuyot");
            System.out.println(combustible.getModelo());
        }else if (coche.equals("hibrido")){
            hibrido.setModelo("seat");
            System.out.println(hibrido.getModelo());
            System.out.println(hibrido.acelerar(30));
        }else {
            System.out.println("no se que poner");
        }

        respuesta.close();
    }
}
