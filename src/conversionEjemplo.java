// A continuación se muestra un ejemplo real de conversión de tipos en el que
// creamos un programa para calcular el porcentaje de la puntuación de un
// usuario en relación con la puntuación máxima de un juego.

// Utilizamos conversión de tipos para asegurarnos de que el resultado sea un valor de punto flotante , en lugar de un entero:

public class conversionEjemplo {

    public static void main(String[] args) {

        int maximo = 500;

        int puntuacion = 450;

        // calcular porcentaje y que el dato sea flotante.

        float porcentaje = (float) maximo / puntuacion * 100.0f;

        System.out.println("porcentaje es: " + porcentaje);
    }
}
