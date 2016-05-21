/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaoran
 */
public class Persona implements Comparable<Persona>
{

    private int edad;
    private String nombre;

    public Persona(int edad, String nombre)
    {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona o)
    { //Metodo sobre-escrito de Comparable
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString()
    { //Metodo sobre-escrito de Object
        return this.nombre + " " + this.edad;
    }
}
