package Datos;
import Package.Estudiante;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String URL = "jdbc:mysql://localhost:3306/parciallabo2";
    private ResultSet result;

    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, user, password);

            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //este metodo nos retorna la conexion
    public Connection getConnection() {
        return conn;
    }

    public int listarRecaudacion(int idCurso){
        int monto = 0;
        try{
            Statement consulta = conn.createStatement();
            ResultSet registro = consulta.executeQuery("SELECT IdCurso, Monto" + "FROM pagos WHERE IdCurso=" + idCurso);
            if(registro.next()){
                monto = registro.getInt("monto");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return monto;
    }

    //con este metodo nos desconectamos de la DB
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Conexion terminada");
        }
    }

    public ResultSet getResult() {
        return result;
    }
}

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*public Estudiante leerRegistro(int numeroRegistro) {
        Estudiante estudiante = new Estudiante();

        PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM estudiantes WHERE " +
                        "legajo = ?");
        ps.setString(1, estudiante.setLegajo(legajo));

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Address a = (Address) rs.getObject(1);
            // set the destination address on the envelope
            e.setAddress(firstName, lastName, a);
        }
        conn.close();

     catch(SQLException sqe)
        {
            sqe.printStackTrace();
            System.exit(2);
        }
        // if everything was successful, print the envelope
        e.print();
    }

}
private void setAddress(String fname, String lname, Address a)
        {
        street = a.streetNumber + " " + a.street + " " +
        a.apartmentNumber;
        city = a.city;
        zip = "" + a.zipCode;
        }
private void print()
        {
        // Print the name and address on the envelope.
        ...
        }
        }
}
}*/



//    public Conectar(){
//        conn = null;
//        try{
//            Class.forName(driver);
//            conn = DriverManager.getConnection(URL, user, password);
//
//        //PARA INSERTAR UN NUEVO REGISTRO EN LA TABLA
////            String sql = "INSERT INTO estudiantes (nombre, apellido, FechaNac) VALUES (?, ?, ?)";
////
////            PreparedStatement statement = getConnection().prepareStatement(sql);
////            statement.setString(1, "Nam");
////            statement.setString(2, "Ha Minh");
////            statement.setString(3, "2000-03-03");
////
////            int rows = statement.executeUpdate();
////            if(rows > 0){
////                System.out.println("A row has been inserted");
////            }
//
//            if(conn != null){
//                System.out.println("Conexion establecida");
//            }
//
//            String sql = "SELECT * FROM estudiantes";
//            Statement statement = conn.createStatement();
//            ResultSet result = statement.executeQuery(sql);
//
//            while(result.next()){
//                String id = result.getString("Legajo");
//                String nombre = result.getString("Nombre");
//                String apellido = result.getString("Apellido");
//                String fechaNac = result.getString("FechaNac");
//
//                System.out.println("Estudiante " + id + " " + nombre + " " + apellido + " " + fechaNac);
//            }
//
//            //statement.close();
//            conn.close();
//
//        }catch(Exception e){
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//
//    //este metodo nos retorna la conexion
//    public Connection getConnection(){
//        return conn;
//    }
//
//    //con este metodo nos desconectamos de la DB
//    public void desconectar(){
//        conn = null;
//        if(conn == null){
//            System.out.println("Conexion terminada");
//        }
//    }
//}
