/*
Hermilo Almaraz Vargas  
7 de marzo del 2022
7 de marzo del 2022
En esta clase se generan los datos que utilizaremos en la página web
 */
package entity;

import java.util.ArrayList;

public class Producto {

    private String codigo, nombre, descripcion;
    private double precio;

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static void main (String[] args){
        Producto pro =new Producto();
        Producto pro1 =new Producto();
       ArrayList<Producto> lista = new ArrayList<>(); 
       
       
        pro.setCodigo("1545");
        pro.setNombre("sudadera");
        pro.setDescripcion("sudadera 100% algodon");
        pro.setPrecio(1500);
        lista.add(pro);
        
        pro.setCodigo("1222");
        pro.setNombre("playera");
        pro.setDescripcion("100% algodon");
        pro.setPrecio(150);
        lista.add(pro1);
        
        
        System.out.println(pro.getCodigo());
//        System.out.println(lista.get(1));
//        System.out.println(lista.get(2));
//         
        
      
    }
}
