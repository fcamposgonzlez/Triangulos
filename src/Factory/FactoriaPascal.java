/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Product.Celda;
import Product.Pascal;
import Product.Triangulo;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author dms
 */
public class FactoriaPascal extends FactoriaTriangulo{
    
    @Override
    public Triangulo Generar(int filas){
        ArrayList <ArrayList> estructura = new ArrayList();
        for (int j = 0; j < filas; j++)
            estructura.add(new ArrayList());
        
        int filaAct = 0;
        while(filaAct < filas){
            int casilla = 0;
            while(casilla <= filaAct){
                int valor = calcularPascal(filaAct+1,casilla+1);
                estructura.get(filaAct).add(new Celda(valor,Color.white));
                casilla ++;
        }
            filaAct ++;
        }
        Pascal pascal;
        pascal = new Pascal(filas,estructura);
        return (Triangulo)pascal;
    }
    
    public int calcularPascal(int n1,int n2){
        n1 --;
        n2 --;
        int numera = factorial(n1);
        int deno = factorial(n2) * factorial(n1-n2);
        System.out.println("Fila: " + n1 + "Pos: " + n2);
        System.out.println("Numerador: " + numera + "Deno: " + deno );
        int result = (numera)/(deno);
        System.out.println("Resultado :" + result);
        return result;
    }
    
    private int factorial(int num){
        if (num == 0)
            return 1;
        int numero = num-1;
        while(numero > 0){
            num = numero * num;
            numero--;
        }
        return num;
    }
}
