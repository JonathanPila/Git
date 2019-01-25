/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproductos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USERPC
 */
public class Precio {
     Scanner teclado = new Scanner(System.in);
    private String nombre;
    private int codigo;
    private String tipo;
    private int precio;

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
    private ArrayList<Nombre> producto = new ArrayList<Nombre>();
    
   public void Ingresar(){
         System.out.println("Ingrese el Nombre del Producto: ");
        nombre=teclado.nextLine();
                System.out.println("Ingrese el Tipo del Producto: ");
        tipo=teclado.nextLine();
        System.out.println("Ingrese el Codigo del Producto: ");
        codigo=teclado.nextInt();

        System.out.println("Ingrese el Precio del Producto: ");
        precio=teclado.nextInt();
       
        
    }

    public void Eliminar(){
        String name;
        System.out.println("Ingrese el producto:");
        name=teclado.nextLine();
        
        System.out.println("Producto a eliminar");
            
    }
    public void Buscar(String nombre){
        Boolean op =false;
        
          Iterator miIterator=(Iterator) producto.iterator(); // DESCOMPONE EL LISTADO DE EMPLEADOS PARA PASAR UNO A UNO
        while(miIterator.hasNext()){
            Nombre obj =(Nombre) miIterator.next();
            if(obj.equals(nombre)){
                System.out.println("1. Nombre: "+obj.getNombre());
                op=true;
            }
        }
        if(op==false){
            System.out.println("No se encuentra producto a buscar");
        }
    }
}
