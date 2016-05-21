
import java.util.Random;

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
        Random random = new Random(System.currentTimeMillis());
        int i = 0;
        while (i++ < 100){
            int r = random.nextInt(1000);
            
            bst.insertar(r);
            
            if (r > 500){
                System.out.printf("%d : %b\n",r,bst.buscar(r));
            }
        }
        
        System.out.println(bst.toString());
    }
}
