public class JavaPrintVariables {
    public static void main(String[] args) {
        System.out.println("hello");

        // contatenar variable
        String name = "Carlos";
        System.out.println("Hello " + name);

        // Agregar una variable a otra variable
        String firstName = "Diego";
        String lastName = "Guernica";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // Para los valores numeéricos, el + caracter funciona como un operador
        // matematicos
        int x = 5;
        int y = 6;
        System.out.println("Se suman los valores 5 + 6 " + (x + y));

    }

}
