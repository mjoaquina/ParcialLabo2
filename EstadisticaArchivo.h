#pragma once
#include "Estadistica.h"
#include "Pago.h"
class EstadisticaArchivo
{
private: 
public:
	Estadistica leer(int nroRegistro);
	bool guardar(Estadistica est);
	int getCantidad();
};

