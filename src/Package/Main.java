package Package;

import Datos.AdminPago;
import Datos.Conectar;

public class Main {
    public static void main(String[] args) {
//        AdminPago admin = new AdminPago();
//        admin.getConexion();
        Conectar connection = new Conectar();
        connection.getConnection();
        connection.desconectar();
    }
}