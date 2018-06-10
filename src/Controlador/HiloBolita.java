/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Product.Quincunce;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 * Genera el HiloBolita necesario para cada esfera
 * @author fcamp
 */
public class HiloBolita extends Thread {
    private int result; //Almacena resultado
    private int filaAct; //Amacena las filas actuales
    private int filasTotales;
    private int pausa; //pausa antes de presentar el mensaje
    private Quincunce aparato;
    private javax.swing.JLayeredPane Panel;
    private JLabel label;
    private ArrayList listaLabelsGrafico;
    
    public HiloBolita(Quincunce aparatoGalton, JLabel etiqueta, int  filastot,javax.swing.JLayeredPane Pane,
            ArrayList listaLabels){
        
        filaAct = 0;
        result = -1;
        pausa = 1;
        filasTotales = filastot;
        aparato = aparatoGalton;
        label = etiqueta;
        Panel = Pane;
        listaLabelsGrafico = listaLabels;
    }
    
    
    @Override
    public synchronized void run(){
        int origenY = 40;
        int origenX = 320;
        int direccion;
        for (int i = 1; i <= 30; i++){
            label.setLocation(origenX,origenY+1);
            origenY++;
            try {
                sleep(33);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloBolita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(true){
                direccion = determinarDireccion(filasTotales, filaAct);
                filaAct++;
                switch (direccion) {
                    case 1:
                        for (int i = 1; i <= 30; i++){
                            label.setLocation(origenX-1,origenY+1);
                            //anim.jLabelXLeft(origenX, origenX - 1, 1, 1, label);
                            //anim.jLabelYDown(origenY, origenY - 1, 1, 1, label);
                            origenX--;
                            origenY++;
                            try {
                                sleep(33);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(HiloBolita.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 30; i++){
                            label.setLocation(origenX+1,origenY+1);
                            //anim.jLabelXLeft(origenX, origenX + 1, 1, 1, label);
                            //anim.jLabelYDown(origenY, origenY - 1, 1, 1, label);
                            origenX++;
                            origenY++;
                            try {
                                sleep(33);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(HiloBolita.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    default:
                        if (direccion == 4){
                            for (int i = 1; i <= 30; i++){
                                label.setLocation(origenX-1,origenY+1);
                                //anim.jLabelXLeft(origenX, origenX - 1, 1, 1, label);
                                //anim.jLabelYDown(origenY, origenY - 1, 1, 1, label);
                                origenX--;
                                origenY++;
                                try {
                                sleep(33);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(HiloBolita.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                        else{ if (direccion == 5) {
                            for (int i = 1; i <= 30; i++){
                                label.setLocation(origenX+1,origenY+1);
                                //anim.jLabelXLeft(origenX, origenX + 1, 1, 1, label);
                                //anim.jLabelYDown(origenY, origenY - 1, 1, 1, label);
                                origenX++;
                                origenY++;
                                try {
                                    sleep(33);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(HiloBolita.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            }
                        }}
                        Panel.remove(label);
                        Panel.revalidate(); 
                        Panel.repaint();
                        return;
                }
        }
    }
        
    
    
    public int determinarDireccion(int filasTotales, int filaAct){
        if (result == -1){
            Random random = new Random();
            if (random.nextBoolean()) {
                result = 10;
                return 1;
            } 
            else{
                result = 12;
                return 2;
            }
        }
        if (filasTotales-1 > filaAct){
            Random random = new Random();
            if (random.nextBoolean()) {
                result--;
                return 1;
            } 
            else{
                result++;
                return 2;
            }
        }
            if (filasTotales > filaAct){                                
                Random random = new Random();
                if (random.nextBoolean()) {
                    result--;
                    int cuentaCasilla = (int) this.aparato.getEstadistica().get(result);
                    this.aparato.getEstadistica().set(result, cuentaCasilla + 1);

                    if (filasTotales % 2 == 0){
                        int casilla = (result/2) - 1;
                        
                        int tamañoBarra = ((JLabel)listaLabelsGrafico.get(casilla)).getSize().height;

                        if (tamañoBarra < 100)
                            actualizarBarraGrafico(casilla, tamañoBarra);
                        else{
                            actualizarBarras();
                            
                            int indexLabel = listaLabelsGrafico.size() - 2;
                            int lastIndex = indexLabel + 1;
                            int valorTamMaxBarrra = (int)listaLabelsGrafico.get(indexLabel);                            
                            valorTamMaxBarrra = valorTamMaxBarrra + 50; 
                            ((JLabel)listaLabelsGrafico.get(indexLabel-1)).setText(String.valueOf(valorTamMaxBarrra));
                            
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).revalidate();
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).repaint();
                        }
                    }
                    else{
                        int casilla = (result/2);
                        
                        int tamañoBarra = ((JLabel)listaLabelsGrafico.get(casilla)).getSize().height;

                        if (tamañoBarra < 100)
                            actualizarBarraGrafico(casilla, tamañoBarra);
                        else{
                            actualizarBarras();
                            
                            int indexLabel = listaLabelsGrafico.size() - 2;
                            int lastIndex = indexLabel + 1;
                            int valorTamMaxBarrra = (int)listaLabelsGrafico.get(indexLabel);
                            valorTamMaxBarrra = valorTamMaxBarrra + 50; 
                            ((JLabel)listaLabelsGrafico.get(indexLabel-1)).setText(String.valueOf(valorTamMaxBarrra));
                            
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).revalidate();
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).repaint();
                        }
                    }

                    return 4;
                } 
                else{
                    result++;
                    int cuentaCasilla = (int) this.aparato.getEstadistica().get(result);
                    this.aparato.getEstadistica().set(result, cuentaCasilla + 1);
                    
                    if (filasTotales % 2 == 0){
                        int casilla = (result/2) - 1;
                        System.out.println(casilla);
                        
                        int tamañoBarra = ((JLabel)listaLabelsGrafico.get(casilla)).getSize().height;
                        System.out.println(tamañoBarra);

                        if (tamañoBarra < 100)
                            actualizarBarraGrafico(casilla, tamañoBarra);
                        else{
                            actualizarBarras();
                            
                            int indexLabel = listaLabelsGrafico.size() - 2;
                            int lastIndex = indexLabel + 1;
                            int valorTamMaxBarrra = (int)listaLabelsGrafico.get(indexLabel);
                            valorTamMaxBarrra = valorTamMaxBarrra + 50;
                            ((JLabel)listaLabelsGrafico.get(indexLabel-1)).setText(String.valueOf(valorTamMaxBarrra));
                            
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).revalidate();
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).repaint();
                        }
                    }
                    else{
                        int casilla = (result/2);
                        
                        int tamañoBarra = ((JLabel)listaLabelsGrafico.get(casilla)).getSize().height;

                        if (tamañoBarra < 100)
                            actualizarBarraGrafico(casilla, tamañoBarra);
                        else{
                            actualizarBarras();
                            
                            int indexLabel = listaLabelsGrafico.size() - 2;
                            int lastIndex = indexLabel + 1;
                            int valorTamMaxBarrra = (int)listaLabelsGrafico.get(indexLabel);                            
                            valorTamMaxBarrra = valorTamMaxBarrra + 50; 
                            ((JLabel)listaLabelsGrafico.get(indexLabel-1)).setText(String.valueOf(valorTamMaxBarrra));
                            
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).revalidate();
                            ((JLayeredPane)listaLabelsGrafico.get(lastIndex)).repaint();
                        }
                    }
                    
                    return 5;
                }                                
            }            
        
        return 0;
    }
    
    private void actualizarBarraGrafico(int casilla, int tamaño){
        tamaño++;
        ((JLabel)listaLabelsGrafico.get(casilla)).setSize(60, tamaño);      
    }
    
    private void actualizarBarras(){
        for (int i = 0; i < 11; i++){
            int tamañoBarra = ((JLabel)listaLabelsGrafico.get(i)).getSize().height;
            
            if (tamañoBarra < 50)
                ((JLabel)listaLabelsGrafico.get(i)).setSize(60, 0);
            else
                ((JLabel)listaLabelsGrafico.get(i)).setSize(60, tamañoBarra - 50);
        }
    }
}