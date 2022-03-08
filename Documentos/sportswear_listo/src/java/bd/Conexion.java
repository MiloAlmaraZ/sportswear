/*

 */
package bd;

import java.sql.Connection;

public class Conexion {
private final Connection conexion;
private final String url;
private final String user;
private final String pws;
public Conexion() {
    }

    public final Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
         this.conexion = conexion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

public static void  main(String[] args){
    
}

    


}
