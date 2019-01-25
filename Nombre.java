/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproductos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USERPC
 */
public class Nombre {
    
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private int codigo;
    private String tipo;
    private int precio;

    public Nombre(String nombre, int codigo, String tipo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    Nombre() {
      
    
    }

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

    
    void Nombre(){
               
        System.out.println("Ingrese el Nombre del Producto: ");
        nombre=teclado.nextLine();
                System.out.println("Ingrese el Tipo del Producto: ");
        tipo=teclado.nextLine();
        System.out.println("Ingrese el Codigo del Producto: ");
        codigo=teclado.nextInt();

        System.out.println("Ingrese el Precio del Producto: ");
        precio=teclado.nextInt();
    }
    
}
