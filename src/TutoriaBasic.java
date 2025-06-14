import java.util.Scanner;

public class TutoriaBasic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaNombre = new Scanner(System.in);

        System.out.println("Digite la edad: ");

        int edad = entrada.nextInt();

        System.out.println("Escriba su nombre: ");

        String nombre = entradaNombre.nextLine();

        System.out.println("La edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);



    }
//    private static final Logger logger = Logger.getLogger(Tutoria1.class.getName());
//    public static void main(String[] args) {
//
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Digite la edad: ");
//        int age = entrada.nextInt();
//        logger.info("la edad es : " + age);

}

