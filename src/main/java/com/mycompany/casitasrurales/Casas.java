package com.mycompany.casitasrurales;

///Esta clase son los objetos que se almacenaran
import java.util.*;
public class Casas {
    
    Scanner entrada=new Scanner(System.in);
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion = 0;
    private double precio = 0.0;
    private boolean esAlta;
    
    public Casas(){
    esAlta=true;
    asigna();
    
    
    }
    
    public void asigna()
{

try {
System.out.print("\n Codigo (10 caracteres): ");
codigo = entrada.nextLine();
System.out.print("\n Población: ");
poblacion = entrada.nextLine();
System.out.print("\n Dirección: ");
direccion = entrada.nextLine();
System.out.print("\n Número de habitaciones: ");
numHabitacion = Integer.parseInt(entrada.nextLine());
System.out.print("\n Precio por día de estancia: ");
precio = (new Double(entrada.nextLine())).doubleValue();
}
catch (Exception e)
{
System.out.println(" Excepcion en la entrada de datos " +
e.getMessage()+ " . No se da de alta");
esAlta = false;
}
}
    
    @Override
    public String toString(){

        return "Casa Rural " + codigo +"\n"+"Población: " + poblacion+"Dirección: " + direccion+"Precio por día: " + precio;


}

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

  
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the numHabitacion
     */
    public int getNumHabitacion() {
        return numHabitacion;
    }

    
    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the esAlta
     */
    public boolean isEsAlta() {
        return esAlta;
    }

  
    public void setEsAlta(boolean esAlta) {
        this.esAlta = esAlta;
    }

    
}
