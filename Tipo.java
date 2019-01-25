/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproductos;

import java.util.Scanner;

/**
 *
 * @author USERPC
 */
public class Tipo {
    Scanner teclado=new Scanner (System.in);
    private String tipo;
    private String tamaño;

    public Tipo(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    Tipo() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    Void Modificar(){
        int op;
       String nombre ="Colcafe";
                String nom;
        System.out.println("Que desea modificar: ");
        System.out.println("1. Nombre del Producto");
        System.out.println("2. Codigo del Producto");
        System.out.println("3. Tipo del Producto");
        System.out.println("4. Precio del Producto");
        op=teclado.nextInt();
        switch(op){
            case 1:
                 
                System.out.println("El Nombre anterior es: "+nombre);
                System.out.println("Escriba el nuevo nombre: ");
                nom=teclado.nextLine();
                System.out.println("Se cambio de nombre: "+nom);
                break;
        }
        return null;
    
    }
}

