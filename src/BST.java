
import javax.xml.transform.OutputKeys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Syaoran
 */
public class BST<T extends Comparable<T>>
{

    private Nodo raiz;

    public void insertar(T x)
    {
        if (this.raiz == null){
            this.raiz = new Nodo(x);
        }
        else{
            raiz.insertar(x);
        }
    }

    @Override
    public String toString()
    {
        return raiz.toString();
    }
    
    public boolean buscar(T x)
    {
        return raiz.buscar(x);
    }
    
    private class Nodo
    {

        private T valor;
        private Nodo nodoDerecho;
        private Nodo nodoIzquierdo;

        public Nodo(T x)
        {
            this.valor = x;
            this.nodoDerecho = null;
            this.nodoIzquierdo = null;
        }

        private void insertar(T x)
        {
            if (x.compareTo(valor) <= 0){
                insertarIzquierda(x);
            }
            else if (x.compareTo(valor) > 0){
                insertarDerecha(x);
            }
        }

        private void insertarDerecha(T x)
        {
            if (this.nodoDerecho == null){
                this.nodoDerecho = new Nodo(x);
            }
            else{
                this.nodoDerecho.insertar(x);
            }
        }

        private void insertarIzquierda(T x)
        {
            if (this.nodoIzquierdo == null){
                this.nodoIzquierdo = new Nodo(x);
            }
            else{
                this.nodoIzquierdo.insertar(x);
            }
        }

        @Override
        public String toString()
        {
            return "" + imprimirIzquierda() + " | " + this.valor + " | " + imprimirDerecha();
        }

        private String imprimirDerecha()
        {
            if (this.nodoDerecho == null){
                return "";
            }
            return this.nodoDerecho.toString();
        }

        private String imprimirIzquierda()
        {
            if (this.nodoIzquierdo == null){
                return "";
            }
            return this.nodoIzquierdo.toString();
        }

        private boolean buscar(T x)
        {
            if (this.valor.compareTo(x) == 0){
                return true;
            }
            else if (this.nodoDerecho == null && this.nodoIzquierdo == null){
                return false;
            }
            else{
                return nodoIzquierdo.buscar(x) || nodoDerecho.buscar(x);
            }
            
        }
    }
}
