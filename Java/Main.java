// Librería Scanner para ingresar datos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Objeto Scanner para leer datos del teclado
        Scanner entrada = new Scanner(System.in);

        // Variables contadoras
        int aprobados = 0;
        int reprobados = 0;

        // Variables temporales
        String cedula;
        String nombre;
        String apellido;

        double nota1;
        double nota2;
        double nota3;

        // Creación del arreglo de objetos
        // Aquí se guardarán los 5 estudiantes
        Estudiante estudiantes[] = new Estudiante[5];

        // Ciclo para registrar estudiantes
        for(int i = 0; i < 5; i++) {

            // Crear cada objeto estudiante
            estudiantes[i] = new Estudiante();

            System.out.println("\n=================================");
            System.out.println("REGISTRO DEL ESTUDIANTE " + (i + 1));
            System.out.println("=================================");

            // Ingreso de datos personales
            System.out.print("Ingrese la cedula: ");
            cedula = entrada.nextLine();

            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido: ");
            apellido = entrada.nextLine();

            // Validación de la nota 1
            do {

                System.out.print("Ingrese la nota 1: ");
                nota1 = entrada.nextDouble();

                if(nota1 < 0 || nota1 > 10) {
                    System.out.println("Error. La nota debe estar entre 0 y 10");
                }

            } while(nota1 < 0 || nota1 > 10);

            // Validación de la nota 2
            do {

                System.out.print("Ingrese la nota 2: ");
                nota2 = entrada.nextDouble();

                if(nota2 < 0 || nota2 > 10) {
                    System.out.println("Error. La nota debe estar entre 0 y 10");
                }

            } while(nota2 < 0 || nota2 > 10);

            // Validación de la nota 3
            do {

                System.out.print("Ingrese la nota 3: ");
                nota3 = entrada.nextDouble();

                if(nota3 < 0 || nota3 > 10) {
                    System.out.println("Error. La nota debe estar entre 0 y 10");
                }

            } while(nota3 < 0 || nota3 > 10);

            // Limpiar buffer
            entrada.nextLine();

            // Guardar datos en el objeto
            estudiantes[i].setCedula(cedula);
            estudiantes[i].setNombre(nombre);
            estudiantes[i].setApellido(apellido);
            estudiantes[i].setNota1(nota1);
            estudiantes[i].setNota2(nota2);
            estudiantes[i].setNota3(nota3);

            // Calcular promedio
            estudiantes[i].calcularPromedio();

            // Verificar estado
            estudiantes[i].verificarEstado();

            // Contar aprobados y reprobados
            if(estudiantes[i].getEstado().equals("Aprobado")) {

                aprobados++;

            } else {

                reprobados++;
            }
        }

        // Mostrar listado completo
        System.out.println("\n======= LISTA DE ESTUDIANTES =======");

        for(int i = 0; i < 5; i++) {

            // Mostrar información usando el método
            estudiantes[i].mostrarInformacion();
        }

        // Mostrar resultados finales
        System.out.println("\n=================================");
        System.out.println("Total de aprobados: " + aprobados);
        System.out.println("Total de reprobados: " + reprobados);

        // Cerrar Scanner
        entrada.close();
    }
}
