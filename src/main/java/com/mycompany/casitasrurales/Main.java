/*
A continuación se implementa una tabla dispersa para almacenar un conjunto de elementos:
Casas Rurales de la comarca La Alcarria. La resolución de colisiones se realiza formando una
secuencia de posiciones aplicando el método de exploración cuadrática.
Los elementos de la tabla son objetos con los siguientes datos: población, dirección,
numHabitacion, precio por día y código de identificación. El código, normalmente 5 carac-
teres, tiene una relación biunívoca con la Casa Rural; por ello, se elige como campo clave.
Los campos población y dirección son de tipo cadena; y numHabitacion, precio de tipo int
y double respectivamente.
La clase TablaDispersa consta de un array de referencias a los objetos CasaRural . El tama-
ño de la tabla está en función del número de Casas conocido, 50 . Entonces, el tamaño elegido es el
número primo 101 . Cada posición de la tabla contiene null o bien la referencia a un objeto Casa
Rural. Se ha tomado la decisión de que los elementos dados de baja permanezcan en la tabla (para
no perder información histórica); por ello, se añade el atributo esAlta , que si está activo (true)
indica que es un alta; en caso contrario (false) se dio de baja. El número de elementos que hay
en la tabla, incluyendo las bajas, se almacena en la variable numElementos ; además, se añade la
variable factorCarga , de tal forma que cuando se alcance el 0.5 se pueda generar un aviso.
*/

package com.mycompany.casitasrurales;

/**
 *
 * @author elses
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
