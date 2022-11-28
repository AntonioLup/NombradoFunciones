package EjercicioThrows;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayIndexOutOfBoundsMain {
    public static void main(String[] args)  throws ArrayIndexOutOfBoundsException {
        String[] list = {"Antonio", "Maria", "Maria", "Maria", "Maria", "Ana", "Jose"};

        ArrayList<String> newList = new ArrayList();

        for (String index : list) {
//            cuando no lo contenga lo metera, cuando lo tenga pasara
            if (!newList.contains(index)) {
                newList.add(index);
            }
        }

        System.out.println(newList);




    }
}
