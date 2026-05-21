// Librería para poder usar cadenas de texto
#include <iostream>
using namespace std;

// Creación de la clase Estudiante
class Estudiante {

    // Atributos privados para proteger la información
    private:
        string cedula;
        string nombre;
        string apellido;
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        string estado;

    // Parte pública donde estarán los métodos
    public:

        // Constructor vacío
        // Sirve para crear el objeto estudiante
        Estudiante() {
            cedula = "";
            nombre = "";
            apellido = "";
            nota1 = 0;
            nota2 = 0;
            nota3 = 0;
            promedio = 0;
            estado = "";
        }

        // Métodos set
        // Estos métodos permiten guardar datos en los atributos

        void setCedula(string c) {
            cedula = c;
        }

        void setNombre(string n) {
            nombre = n;
        }

        void setApellido(string a) {
            apellido = a;
        }

        void setNota1(double n1) {
            nota1 = n1;
        }

        void setNota2(double n2) {
            nota2 = n2;
        }

        void setNota3(double n3) {
            nota3 = n3;
        }

        // Métodos get
        // Sirven para obtener o mostrar los datos guardados

        string getCedula() {
            return cedula;
        }

        string getNombre() {
            return nombre;
        }

        string getApellido() {
            return apellido;
        }

        double getPromedio() {
            return promedio;
        }

        string getEstado() {
            return estado;
        }

        // Método para calcular el promedio
        void calcularPromedio() {
            promedio = (nota1 + nota2 + nota3) / 3;
        }

        // Método para verificar si aprueba o reprueba
        void verificarEstado() {

            // Si el promedio es mayor o igual a 7 aprueba
            if(promedio >= 7) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
        }

        // Método para mostrar la información completa
        void mostrarInformacion() {

            cout << "\n--- DATOS DEL ESTUDIANTE ---" << endl;
            cout << "Cedula: " << cedula << endl;
            cout << "Nombre: " << nombre << endl;
            cout << "Apellido: " << apellido << endl;
            cout << "Promedio: " << promedio << endl;
            cout << "Estado: " << estado << endl;
        }
};