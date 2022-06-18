package com.mycompany.casitasrurales;

///Esta clase son los objetos que se almacenaran
public class Casas {
    
    private String codigo;
    private String poblacion;
    private String direccion;
    private int numHabitacion = 0;
    private double precio = 0.0;
    private boolean esAlta;
    
    public Casas(String codigo,String poblacion, String direccion, int numHabitacion,double precio){
    esAlta=true;
    this.codigo=codigo;
    this.poblacion=poblacion;
    this.direccion=direccion;
    this.numHabitacion =numHabitacion;
    this.precio = precio;
    
    
    }
    
    
    @Override
    public String toString(){

        return "";


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
