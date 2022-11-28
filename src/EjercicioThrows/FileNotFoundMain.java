package EjercicioThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundMain  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("File.txt");
        Scanner sc = new Scanner(file);
        try{
            while(sc.hasNextLine()){
                System.out.println(sc);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
