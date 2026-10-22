package proyecto12;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBD {

    static int Verificar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conectar = null; //variable con la cual nos vamos a conectar
    public Connection conexion(){
        try{
            //Establecemos el nombre del drive
            //Class.forName("com.mysql.jdbc.Driver") o ("com.mysql.cj.jdbc.Driver")
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar= DriverManager.getConnection("jdbc:mysql://localhost/alumnos4a","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return conectar;
    }
}
