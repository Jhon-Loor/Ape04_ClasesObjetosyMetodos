// Librerías necesarias
#include <iostream>
#include "Estudiante.h"

using namespace std;

int main() {

    // Variable para controlar el ciclo
    int i;

    // Contadores de aprobados y reprobados
    int aprobados = 0;
    int reprobados = 0;

    // Variables temporales para guardar datos
    string cedula, nombre, apellido;
    double nota1, nota2, nota3;

    // Creación de un arreglo de objetos
    // Aquí se almacenarán los 5 estudiantes
    Estudiante estudiantes[5];

    // Ciclo para registrar estudiantes
    for(i = 0; i < 5; i++) {

        cout << "\n==================================" << endl;
        cout << "REGISTRO DEL ESTUDIANTE " << i + 1 << endl;
        cout << "==================================" << endl;

        // Ingreso de datos personales
        cout << "Ingrese la cedula: ";
        cin >> cedula;

        cout << "Ingrese el nombre: ";
        cin >> nombre;

        cout << "Ingrese el apellido: ";
        cin >> apellido;

        // Validación de la nota 1
        do {
            cout << "Ingrese la nota 1: ";
            cin >> nota1;

            if(nota1 < 0 || nota1 > 10) {
                cout << "Error. La nota debe estar entre 0 y 10" << endl;
            }

        } while(nota1 < 0 || nota1 > 10);

        // Validación de la nota 2
        do {
            cout << "Ingrese la nota 2: ";
            cin >> nota2;

            if(nota2 < 0 || nota2 > 10) {
                cout << "Error. La nota debe estar entre 0 y 10" << endl;
            }

        } while(nota2 < 0 || nota2 > 10);

        // Validación de la nota 3
        do {
            cout << "Ingrese la nota 3: ";
            cin >> nota3;

            if(nota3 < 0 || nota3 > 10) {
                cout << "Error. La nota debe estar entre 0 y 10" << endl;
            }

        } while(nota3 < 0 || nota3 > 10);

        // Guardar datos dentro del objeto estudiante
        estudiantes[i].setCedula(cedula);
        estudiantes[i].setNombre(nombre);
        estudiantes[i].setApellido(apellido);
        estudiantes[i].setNota1(nota1);
        estudiantes[i].setNota2(nota2);
        estudiantes[i].setNota3(nota3);

        // Llamar al método para calcular promedio
        estudiantes[i].calcularPromedio();

        // Llamar al método para verificar estado
        estudiantes[i].verificarEstado();

        // Verificar si aprobó o reprobó
        if(estudiantes[i].getEstado() == "Aprobado") {
            aprobados++;
        } else {
            reprobados++;
        }
    }

    // Mostrar listado completo
    cout << "\n\n======= LISTA DE ESTUDIANTES =======" << endl;

    for(i = 0; i < 5; i++) {

        // Mostrar información usando el método de la clase
        estudiantes[i].mostrarInformacion();
    }

    // Mostrar resultados finales
    cout << "\n==================================" << endl;
    cout << "Total de aprobados: " << aprobados << endl;
    cout << "Total de reprobados: " << reprobados << endl;

    return 0;
}
