import java.util.Scanner;

public class RecuperarContra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("En este archivo iría el cambio de contraseña");

        String contraseniaAntigua;
        String contraseniaNueva;

        System.out.println("Por favor ingresar la contraseña antigüa");
        contraseniaAntigua = leer.next();

        System.out.println("Por favor ingresar la contraseña nueva");
        contraseniaNueva = leer.next();

        System.out.println(contraseniaAntigua);
        System.out.println(contraseniaNueva);

    }
}
