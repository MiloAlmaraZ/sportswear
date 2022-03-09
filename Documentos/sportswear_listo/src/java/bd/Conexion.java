/*

 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
private  Connection conexion=null;
private  String url="";
private  String user="postgres";
private  String pws="ramirez";
ResultSet rs=null;
public Conexion() {
    }

//    public final Connection getConexion() {
//        return conexion;
//    }
//
//    public void setConexion(Connection conexion) {
//         this.conexion = conexion;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public String getPws() {
//        return pws;
//    }
//
//    public void setPws(String pws) {
//        this.pws = pws;
//    }


public Connection conectaServer(){
 
    try{
        
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection("jdbc:postgresql://loclahost"+"/",user,pws);
        System.out.println("Conecion establecida");
    }catch(Exception ex){
        System.out.println("Error:" + ex);
    }
    
    return conexion; 
}

public Connection conectaBase(String bd){
    try{
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection("jdbc:postgresql://loclahost"+"/"+bd,user,pws);
        System.out.println("Conecion establecida");
        
    }catch(Exception ex){
      System.out.println("Error:" + ex);

    }
    return conexion;
}

public ResultSet Consultar(String sql, String bd){
    
    try{
        ResultSet rs=null;
        Connection con=null; 
        con=conectaBase(bd);
        Statement st =con.createStatement();
        rs=st.executeQuery(sql);
    }catch(Exception ex){
        System.out.println("Error: "+ ex);
    }
    
    return rs;
    
    
}
//public v

public static void  main(String[] args){
    
}

    


}
