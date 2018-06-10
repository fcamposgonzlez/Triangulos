/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Product.Quincunce;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fcamp
 */
public class Catalizador extends Thread {
    private javax.swing.JLayeredPane Panel;
    private int filasTotales;
    private Quincunce aparatoGalton;
    private ArrayList listaLabelsGrafico;
    
    public Catalizador(javax.swing.JLayeredPane Panelito, int filasTot, Quincunce aparatoGalto, ArrayList listaLabels){
        Panel = Panelito;
        filasTotales = filasTot;
        aparatoGalton = aparatoGalto;
        listaLabelsGrafico = listaLabels;
    }
    
    public void Pausar(){
        suspend();
    }
    
      @Override
    public synchronized void run(){
        boolean primeravez = true;
        while(true){
                try {
                    sleep (999);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Catalizador.class.getName()).log(Level.SEVERE, null, ex);
                }
                javax.swing.JLabel jLB_bolita;
                jLB_bolita = new javax.swing.JLabel();
                jLB_bolita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Bolita.png"))); // NOI18N
                Panel.add(jLB_bolita,3,0);
                jLB_bolita.setBounds(320, 40, 30, 30);
                HiloBolita bola = new HiloBolita((Quincunce) aparatoGalton, jLB_bolita,filasTotales,Panel, listaLabelsGrafico);
                int posX = 320;
                int posY = 60;
                boolean par;
                if (primeravez){
                for (int filaact = 0;filaact <=filasTotales;filaact++){
                    par = filaact%2 == 0;
                    posY = posY+30;
                    if (filaact != 0 && filaact != filasTotales){
                        if (par)
                            posX = posX-30;
                        else
                            posX = posX+30;
                    }
                    if (filaact == filasTotales){
                        if (par)
                            posX = posX-60;
                        else
                            posX = posX+60;
                    }
                    if (filaact != filasTotales){
                        for(int x=0; x<=filaact; x++){
                            if (par){
                                if (x == 0){
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Clavo.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 30, 30);
                                }
                                else{
                                    posX = posX+60;
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Clavo.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 30, 30);
                                }
                            }
                            else{
                                if (x == 0){
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Clavo.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 30, 30);
                                }
                                else{
                                    posX = posX-60;
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Clavo.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 30, 30);
                                }
                            }
                       }
                    }
                    else{
                        for(int x=0; x<=filaact; x++){
                            if (par){
                                if (x == 0){
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Contenedor.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 60, 50);
                                }
                                else{
                                    posX = posX+60;
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Contenedor.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 60, 50);
                                }
                            }
                            else{
                                if (x == 0){
                                    posX = posX-60;
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Contenedor.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 60, 50);
                                }
                                else{
                                    posX = posX-60;
                                    javax.swing.JLabel jLB_clavo;
                                    jLB_clavo = new javax.swing.JLabel();
                                    jLB_clavo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Contenedor.png"))); // NOI18N
                                    Panel.add(jLB_clavo,2,0);
                                    jLB_clavo.setBounds(posX, posY, 60, 50);
                                }
                            }
                       }
                    }
                }
                }
                primeravez= false;
                bola.start();
        }
    }
    
    
}
