package Datos;
import Package.*;

import java.io.File;

public class AdminEstudiante {
    /*public Estudiante leer(int nroRegistro) {
        Estudiante estudiante = new Estudiante();

    }*/
//
//    public boolean leerTodos(Estudiante estudiantes[], int cantidad) {
//        FILE* p;
//        p = fopen("estudiantes.dat", "rb");
//        if (p == NULL) {
//            return false;
//        }
//        fread(estudiantes, sizeof(Estudiante), cantidad, p);
//        fclose(p);
//        return true;
//    }
//
//    public void guardar(Estudiante est) {
//        FILE* p = fopen("estudiantes.dat", "ab");
//        if (p == NULL) {
//            return false;
//        }
//        bool ok = fwrite(&est, sizeof(Estudiante), 1, p);
//        fclose(p);
//        return ok;
//    }
//
//    public boolean guardar(Estudiante est, int nroRegistro) {
//        FILE* p = fopen("estudiantes.dat", "rb+");
//        if (p == NULL) {
//            return false;
//        }
//        fseek(p, nroRegistro * sizeof(Estudiante), SEEK_SET);
//        bool ok = fwrite(&est, sizeof(Estudiante), 1, p);
//        fclose(p);
//        return ok;
//    }
//
//    public int getCantidad() {
//        FILE* p = fopen("estudiantes.dat", "rb");
//        if (p == NULL) {
//            return 0;
//        }
//        fseek(p, 0, SEEK_END);
//        int cant = ftell(p) / sizeof(Estudiante);
//        fclose(p);
//        return cant;
//    }
//
//    public int buscar(int legajo) {
//        int cant = getCantidad();
//        Estudiante est;
//        for (int i = 0; i < cant; i++) {
//            est = leer(i);
//            if (est.getLegajo() == legajo) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
