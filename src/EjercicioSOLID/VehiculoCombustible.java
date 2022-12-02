package EjercicioSOLID;

public class VehiculoCombustible implements Vehiculo, VehiculoHibrido {
    String modelo;


    @Override
    public int acelerar(int velocidadInicial) {
        velocidadInicial += 50;
        return velocidadInicial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int llenar(int litros) {
        return litros += 30;
    }
}
