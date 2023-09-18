
package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidacionNumerosTelefono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de telefono:");
        String numeroTelefono = scanner.nextLine();
        scanner.close();

        String regex = "^\\(\\d{2,3}\\) \\d{3,4}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeroTelefono);

        if (matcher.matches()) {
            System.out.println("El numero de telefono es correcto en el formato de Mexico");
        } else {
            System.out.println("El numero de telefono no es valido en el formato de Mexico");
        }//cierre de else
    }//cierre de main
}//cierre de clase principal
