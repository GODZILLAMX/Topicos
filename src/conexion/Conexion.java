//besan putos si contestan (menos vale porque es niña y chilla )
//por cierto hay que tener que estar cambiando la contraseña cada que usemos esto porque si no no jala pero bueno
//ademas hay que decirles a todos que el commit debe ser en "source package", no en el proyecto
package conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    Statement stmt;
    ResultSet rs;
    public Conexion(){
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            
            String url ="jdbc:mysql://localhost:3306/mastografica";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mastografica","root","Agbaes31@_");     
            //stmt = con.createStatement();
            //stmt.executeUpdate("INSERT INTO clientes VALUES(1,'CARLOS','SANCHEZ',40)" );
//            JOptionPane.showMessageDialog(null,"Conexión establecida");
        }
        catch(Exception ex)
        //catch(ClassNotFoundException ex)
        {
            //Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"No se pudo establecer la conexion . Error+"+ex);
        }
            
    }
    public Connection getConnection()
    {
        return con;
    }
}
