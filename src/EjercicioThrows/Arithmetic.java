package EjercicioThrows;

public class Arithmetic {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("hila");
        Division div = new Division();
        try {
            int duvre = div.dividir(5);
            System.out.println(duvre);
        }catch (ArithmeticException e){
            System.out.println("No se puede" + " " + e.getMessage());
        }

    }


}
