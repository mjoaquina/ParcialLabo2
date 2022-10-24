package Datos;
import Package.*;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

public class AdminPago {

    Conectar conectar = new Conectar();


}
/*    public static final String URL = "http://localhost/phpmyadmin/index.php?route=/sql&pos=0&db=parciallabo2&table=pagos";

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    public Pago leer(int nroRegistro) {
        Pago pago;
        FILE * p;
        p = fopen("pagos.dat", "rb");
        if (p == NULL) {
            return pago;
        }
        fseek(p, nroRegistro * sizeof(Pago), SEEK_SET);
        fread( & pago, sizeof(Pago), 1, p);
        fclose(p);
        return pago;
    }
}*/
//
//    public boolean leerTodos(Pago pagos[], int cantidad)
//    {
//        FILE* p;
//        p = fopen("pagos.dat", "rb");
//        if (p == NULL)
//        {
//            return false;
//        }
//        fread(pagos, sizeof(Pago), cantidad, p);
//        fclose(p);
//        return true;
//    }
//
//    public boolean guardar(Pago pago)
//    {
//        FILE* p = fopen("pagos.dat", "ab");
//        if (p == NULL)
//        {
//            return false;
//        }
//        bool ok = fwrite(&pago, sizeof(Pago), 1, p);
//        fclose(p);
//        return ok;
//    }
//
//    public boolean guardar(Pago pago, int nroRegistro)
//    {
//        FILE* p = fopen("pagos.dat", "rb+");
//        if (p == NULL)
//        {
//            return false;
//        }
//        fseek(p, nroRegistro * sizeof(Pago), SEEK_SET);
//        bool ok = fwrite(&pago, sizeof(Pago), 1, p);
//        fclose(p);
//        return ok;
//    }
//
//    public int getCantidad()
//    {
//        FILE* p = fopen("pagos.dat", "rb");
//        if (p == NULL)
//        {
//            return 0;
//        }
//        fseek(p, 0, SEEK_END);
//        int cant = ftell(p) / sizeof(Pago);
//        fclose(p);
//        return cant;
//    }

//    public int buscar(int id)
//    {
//        int cant = getCantidad();
//        Pago pago;
//        for (int i = 0; i < cant; i++)
//        {
//            pago = leer(i);
//            if (pago.getId() == id)
//            {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
