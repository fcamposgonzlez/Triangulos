/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Product.Celda;
import Product.Pascal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dms
 */
public class Fibonacci extends Decorador{
    
    public Fibonacci(Pascal pascal) {
        this.pascal = pascal;
    }
    
    public void mostrarSucesion(){
        ArrayList estructura = pascal.getEstructura();
        
        ((Celda)((ArrayList)estructura.get(0)).get(0)).setColor(generarColor());
                        
        int filaAnterior;
        for (int i =  estructura.size() - 1; i > 1; i--){                        
            
            Color color;
            do{
                color = generarColor();
            } while(colorRepetido(color));
                
            int limite = (pascal.getFila() / 2) + 1;
            for (float j = 0; j < limite; j++){                
                try{
                    filaAnterior = (int) (i - j);                                                
                    ((Celda)((ArrayList)estructura.get(filaAnterior)).get((int) j)).setColor(color);
                }catch(Exception e){
                    break;
                }
            }
        }
    }
    
    private Color generarColor(){
        Color randomColor;
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        randomColor = new Color(r, g, b);
        
        return randomColor.brighter();
    }
    
    private boolean colorRepetido(Color color){
        ArrayList estructura = pascal.getEstructura();
        Color colorExist;
        for (int i = 0; i < estructura.size(); i++)
            for (int j = 0; j < ((ArrayList)estructura.get(i)).size(); j++){
                colorExist = ((Celda)((ArrayList)estructura.get(i)).get(j)).getColor();
                if (colorExist == color)
                    return true;
            }
        
        return false;
    }
    
}
