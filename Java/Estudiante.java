// Clase Estudiante
// Aquí se crean los atributos y métodos que tendrá cada estudiante

public class Estudiante {

    // Atributos privados
    // Se utilizan privados para proteger la información
    private String cedula;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String estado;

    // Constructor vacío
    // Sirve para crear objetos de tipo Estudiante
    public Estudiante() {

        cedula = "";
        nombre = "";
        apellido = "";
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
        promedio = 0;
        estado = "";
    }

    // Métodos SET
    // Permiten guardar información en los atributos

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    // Métodos GET
    // Sirven para obtener o mostrar la información

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    // Método para calcular el promedio
    public void calcularPromedio() {

        promedio = (nota1 + nota2 + nota3) / 3;
    }

    // Método para verificar si el estudiante aprueba
    public void verificarEstado() {

        // Si el promedio es mayor o igual a 7 aprueba
        if(promedio >= 7) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    // Método para mostrar toda la información
    public void mostrarInformacion() {

        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado);
    }
}