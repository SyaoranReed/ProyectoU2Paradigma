/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syaoran
 */
public class Main
{
    public static void main(String[] args)
    {
        BST<Persona> prueba = new BST();
        
        prueba.insertar(new Persona(4, "Matias"));
        prueba.insertar(new Persona(18, "Cesar"));
        prueba.insertar(new Persona(7, "Mary"));

        System.out.println(prueba.toString());
        
        System.out.println(prueba.buscar(new Persona(7, "Mary")));
        System.out.println(prueba.buscar(new Persona(10, "Juan")));
    }
}
