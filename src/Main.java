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
        BST<Integer> bst = new BST<Integer>();
        bst.insertar(4);
        bst.insertar(7);
        bst.insertar(1);
        bst.insertar(8);
        bst.insertar(3);
        bst.insertar(12);
        System.out.println(bst.toString()); //Salida: 1 3 4 7 8 12
        System.out.println(bst.buscar(7)); //true
        System.out.println(bst.buscar(5)); //false
    }
}
