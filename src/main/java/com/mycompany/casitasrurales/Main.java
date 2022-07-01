package com.mycompany.casitasrurales;

/**
 *
 * @author elses
 */
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
public class Main {
    
    public static void main(String []args){
        Tabla tablita=new Tabla();
        Scanner input=new Scanner(System.in);
        int n=2;
        String opcionS="";///opcion ingresa como String despues lo transformo en int
        int opcion; 
        presentacion();
        do{
            opciones();
            opcion= input.nextInt();
            input.nextLine();
            switch(opcion){
                case 1: 
                    System.out.println("1");
                    tablita.insertar(new Casas());
                    
                break;
                case 2: 
                    System.out.println("2");
                break;
                case 3: 
                    System.out.println("3");
                break;
                case 4: 
                    n=3;
                    System.out.println("Gracias por usarnos");
                break;
                default:
                    System.out.println("eleccion fuera de rango");
            }
            
        
        
        
        
        }
        
        while(n==2);
        
    
    }
    
    public static void presentacion(){
        System.out.println("########################################################");
        System.out.println("Bienvenido a la base de datos de La Alcarria");
    }
    public static void opciones(){
    
        System.out.println("1: Ingresar");
        System.out.println("2: Eliminar");
        System.out.println("3: Mostrar");
        System.out.println("4: Cerrar el programa");
    }
    
    }

