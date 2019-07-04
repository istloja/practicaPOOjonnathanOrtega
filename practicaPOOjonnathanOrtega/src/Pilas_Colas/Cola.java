/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas_Colas;

/**
 *
 * @author ISTLOJA12
 */
public class Cola {
    private Object[] colas;
    private int frente;
    private int fin;
    
    public Cola(int tamanio)
    {
        colas = new Object[tamanio];
        frente = fin = -1;
    }
    
    public boolean isEmpty()
    {
        return frente == fin;
    }
    
    public boolean isFull()
    {
        return fin == colas.length-1;
    }
    
    
    public void insert(Object elemento)
    {
        if(isFull())
            System.out.println("La cola esta llena, elimine datos!");
        else
            colas[++fin] = elemento;
    }
    
    public Object remove()
    {
        if(isEmpty())
        {
            System.out.println("La cola esta vacia, inserte datos!");
            return "Cola vacia";
        }
        else
            return colas[++frente];
    }
    
    
    public void print()
    {
        if(isEmpty())
            System.out.println("La cola esta vacia!");
        else if(frente == -1)
        {
            for(int i = 0; i <= fin; i++)
            {
                System.out.println(colas[i]);
            }
        }
        else
        {
            for(int j = frente; j <= fin; j++)
            {
                System.out.println(colas[j]);
            }
        }
    }
    
}
