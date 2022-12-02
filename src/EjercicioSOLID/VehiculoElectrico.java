package EjercicioSOLID;

public class VehiculoElectrico implements Vehiculo {
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
}
