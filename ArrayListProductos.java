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
public class ArrayListProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada=new Scanner (System.in);
        int op;
        do{
        System.out.println("Menu de Opciones");
        System.out.println(" 1.Añadir Producto");
        System.out.println(" 2.Modificar Producto");
        System.out.println(" 3.Buscar Producto");
        System.out.println(" 4.Eliminar Producto");
        op=entrada.nextInt();
       switch(op){
           
           case 1:
        Precio a1=new Precio();
        a1.Ingresar();
        break;
           case 2:
               Tipo a2=new Tipo();
               a2.Modificar();
               break;
           case 3:
               Precio a3=new Precio();
               a3.Buscar("Colcafe");
             
               break;
           case 4:
               Precio a4=new Precio();
               a4.Eliminar();
               break;
       }
    }while(0!=5);
        }
}
