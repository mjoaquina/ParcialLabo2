#include "EstadisticaArchivo.h"

bool EstadisticaArchivo::guardar(Estadistica estadistica)
{
	FILE* p = fopen("estadisticas.dat", "ab");
	if (p == NULL)
	{
		return false;
	}
	bool ok = fwrite(&estadistica, sizeof(Estadistica), 1, p);
	fclose(p);
	return ok;
}

 Estadistica EstadisticaArchivo::leer(int nroRegistro)
{
	Estadistica estadistica;
	FILE* p;
	p = fopen("estadisticas.dat", "rb");
	if (p == NULL)
		{
			return estadistica;
		}
		fseek(p, nroRegistro * sizeof(Estadistica), SEEK_SET);
		fread(&estadistica, sizeof(Estadistica), 1, p);
		fclose(p);
		return estadistica;
}

 int EstadisticaArchivo::getCantidad()
 {
	 FILE* p = fopen("estadisticas.dat", "rb");
	 if (p == NULL)
	 {
		 return 0;
	 }
	 fseek(p, 0, SEEK_END);
	 int cant = ftell(p) / sizeof(Estadistica);
	 fclose(p);
	 return cant;
 }
