#pragma once
#include "Pago.h"
#include "PagosArchivo.h"
#include "EstudiantesArchivo.h"
#include "EstadisticaArchivo.h"
#include "Estadistica.h"

class PrimerParcial
{
public:
	void listarRecaudacion();
	void cargarVRecaudacion(int vCurso[]);
	void listarAlumnosNoMorosos();
	void soloUnCurso();
	bool calcularSoloUnCurso(int legajo);
	void generarEstadistica();
	float calcularRecaudacion(int anio, int cantidad);
	void mostrarEstadisticas();
};

