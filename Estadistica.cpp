#include "Estadistica.h"
#include <iostream>
using namespace std;

void Estadistica::setAnio(int anio)
{
	_anio = anio;
}

void Estadistica::setRecaudacion(float recaudacion)
{
	_recaudacion = recaudacion;
}
void Estadistica::mostrar() {
	cout << "------------------------------" << endl;
	cout << "Anio " << _anio << " recaudacion " << _recaudacion << endl;
}
