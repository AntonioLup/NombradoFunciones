package EjerciciosArgs;

public class EjerciciosArgs {
    public static void main(String[] args) {
        System.out.println(args.length);
//        System.out.println(args[2]);

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        Usuario usuario = new Usuario();
        usuario.nombreUsuario = "Antonio";
        usuario.nombre = "OpenAntonio";
        usuario.apellidos = "Lopez";
        usuario.email = "antonoi@bootcamp.com";
        usuario.nivelAcceso = 3;
    }
}
