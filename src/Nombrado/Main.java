package Nombrado;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num[] = {1,5,6,7,9};

        int isuma = Arrays.stream(num)

                .reduce(0, (a, b) ->
                        a + b
                );
        System.out.println(isuma);
    }


}
// se capitalizan las palabras "MainString"
// se usan verbos
// para los interface idor "serializador"
// metodos empieza en minuscula "crearUser"
// constantes TODOMAYUS
// nombre de las variable auto descriptivo
