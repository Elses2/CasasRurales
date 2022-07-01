package com.mycompany.casitasrurales;

/**
 *
 * @author elses
 */
public class Tabla {
    
    static final int TAMTABLA = 101;
    private int numElementos;
    private double factorCarga;
    private Casas [] tabla;
    public Tabla()
        {
        tabla = new Casas[TAMTABLA];
        for(int j = 0; j < TAMTABLA ; j++)
        tabla[j] = null;
        numElementos = 0;
        factorCarga = 0.0;
        }
    public int direccion(String clave)
{
        int i = 0, p;
        long d;
        d = transformaCadena(clave);
        // aplica aritmética modular para obtener dirección base
        p = (int)(d % TAMTABLA);
        // bucle de exploración
        while (tabla[p]!= null &&
        !tabla[p].getCodigo().equals(clave))
        {
        i++;
        p = p + i*i;
        p = p % TAMTABLA; // considera el array como circular
        }
        return p;
        }
        long transformaCadena(String c)
        {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(10,c.length()); j++)
        {
        d = d * 27 + (int)c.charAt(j);
        }
        if (d < 0) d = -d;
        return d;
        }
        public void insertar(Casas r)
        {
            int posicion;
            posicion = direccion(r.getCodigo());
            tabla[posicion] = r;
            numElementos++;
            factorCarga = (double)(numElementos)/TAMTABLA;
            if (factorCarga > 0.5)
            System.out.println("\n!! Factor de carga supera el 50%.!!"
            + " Conviene aumentar el tamaño." );
        }
        public Casas buscar(String clave)
        {
            Casas pr;
            int posicion;
            posicion = direccion(clave);
            pr = tabla[posicion];
            if (pr != null)
            if (! pr.isEsAlta()) pr = null;
            return pr;
        }
        public void eliminar(String clave)
        {
            int posicion;
            posicion = direccion(clave);
            if (tabla[posicion] != null)
            tabla[posicion].setEsAlta(false);
        }
}
