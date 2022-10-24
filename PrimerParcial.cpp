#include "PrimerParcial.h"
#include <iostream>
using namespace std;

//Un método llamado  listarRecaudacion  que muestre para cada curso, 
//la recaudación obtenida desde el periodo del 10 / 05 / 2020.

void PrimerParcial::listarRecaudacion()
{
	int vCurso[10]{};

	cargarVRecaudacion(vCurso);

	for (int i = 0; i < 10; i++) {
		cout << "------------------------------" << endl;
		cout << "Curso " << i + 1 << " recaudacion " << vCurso[i] << endl;
	}
}

void PrimerParcial::cargarVRecaudacion(int vCurso[]) {
	PagosArchivo pagoArch;
	int cantidad = pagoArch.getCantidad();
	Pago pago;

	for (int i = 0; i < cantidad; i++) {
		pago = pagoArch.leer(i);
		if (pago.getFecha().getAnio() >= 2020 && pago.getFecha().getMes() >= 5 && pago.getFecha().getDia() >= 10) {
			vCurso[pago.getIdCurso() - 1] += pago.getMonto();
		}
	}
}
//Agregar un método llamado  listarAlumnosNoMorosos  y que usando el método del punto anterior, 
//muestre los legajos de los alumnos que nunca realizaron un pago vencido.

void PrimerParcial::listarAlumnosNoMorosos() {
	PagosArchivo pagoArch;
	EstudiantesArchivo estArch;
	Pago pago;

	//cantidad de pagos
	int cantidad = pagoArch.getCantidad();

	//cantidad de estudiantes
	int cantEst = estArch.getCantidad();
	Estudiante* vPagosNoVencidos = new Estudiante[cantEst];
	bool* vEstNoMorosos = new bool[cantEst];

	for (int i = 0; i < cantidad; i++) {
		if (!pago.esPagoVencido(pagoArch.leer(i).getLegajo())){
			vEstNoMorosos[i];
		}
	}


	delete[] vPagosNoVencidos;
	delete[] vEstNoMorosos;
}
//Un método llamado  soloUnCurso  que muestre el legajo, nombre y apellido de todos los alumnos que pagaron 
//solamente un curso del periodo(año período de cursada)  2021

void PrimerParcial::soloUnCurso() {
	EstudiantesArchivo estArch;
	//cantidad de estudiantes
	int cantEst = estArch.getCantidad();
	for (int i = 0; i < cantEst; i++) {
		if (calcularSoloUnCurso(estArch.leer(i).getLegajo())){
			cout << "------------------------";
			cout << "Legajo: " << estArch.leer(i).getLegajo() << " " << " Nombre: " << estArch.leer(i).getNombres() << " Apellido: " << estArch.leer(i).getApellidos() << endl;
		}
	}

}
bool PrimerParcial::calcularSoloUnCurso(int legajo) {
	PagosArchivo pagoArch;
	int cantidad = pagoArch.getCantidad();
	int cuantosCursos = 0;
	bool vCursos[10]{};
	bool soloUnCurso = false;

	for (int i = 0; i < cantidad; i++) {
		if (pagoArch.leer(i).getLegajo() == legajo && pagoArch.leer(i).getAnio()==2021) {
			vCursos[pagoArch.leer(i).getIdCurso() - 1] = true;
		}
	}

	for (int i = 0; i < 10; i++) {
		if (vCursos[i] == true) {
			cuantosCursos++;
		}
	}
	if (cuantosCursos == 1) {
		soloUnCurso = true;
	}
	return soloUnCurso;
}
void PrimerParcial::generarEstadistica(){
	PagosArchivo pagoArch;
	EstadisticaArchivo estArch;

	int cantidadPagos = pagoArch.getCantidad();
	int anioMinimo = pagoArch.leer(0).getFecha().getAnio();
	int anioMaximo = 0;

	for (int i = 0; i < cantidadPagos; i++) {
		if (pagoArch.leer(i).getFecha().getAnio() < anioMinimo) {
			anioMinimo = pagoArch.leer(i).getFecha().getAnio();
		}
	}
	for (int i = 0; i < cantidadPagos; i++) {
		if (pagoArch.leer(i).getFecha().getAnio() > anioMaximo) {
			anioMaximo = pagoArch.leer(i).getFecha().getAnio();
		}
	}

	int cantAnios = anioMaximo - anioMinimo;
	float* vRecaudacion = new float[cantAnios];
	Estadistica* vEst = new Estadistica[cantAnios];

	for (int i = 0; i < cantAnios; i++) {
		vRecaudacion[i] += calcularRecaudacion(anioMinimo, cantidadPagos);
		anioMinimo++;
	}

	for (int i = 0; i < cantAnios; i++) {
		vEst[i].setAnio(anioMinimo);
		vEst[i].setRecaudacion(vRecaudacion[i]);
		estArch.guardar(vEst[i]);
	}
	delete[] vEst;
	delete[] vRecaudacion;

}
float PrimerParcial::calcularRecaudacion(int anio, int cantidad) {
	PagosArchivo reg;
	float acuRecaudacion = 0;
	for (int i = 0; i < cantidad; i++) {
		if (reg.leer(i).getFecha().getAnio() == anio) {
			acuRecaudacion += reg.leer(i).getMonto();
		}
	}
	return acuRecaudacion;
}
void PrimerParcial::mostrarEstadisticas() {
	EstadisticaArchivo estArch;
	int cantidad = estArch.getCantidad();

	for (int i = 0; i < cantidad; i++) {
		estArch.leer(i).mostrar();
	}
}
