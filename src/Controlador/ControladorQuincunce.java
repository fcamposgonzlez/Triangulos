/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Factory.FactoriaQuincunce;
import Product.Quincunce;
import Product.Triangulo;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author dms
 */
public class ControladorQuincunce extends javax.swing.JFrame {
    private Factory.FactoriaQuincunce fabrica = new FactoriaQuincunce();
    private Triangulo aparatoGalton;
    private int filasTotales;
    public static Catalizador cata;
    private int control;
    private ArrayList barrasGrafico;
    public ControladorQuincunce(){
        initComponents();
        
    }
    /**
     * Creates new form Quincunce
     * @param filas
     */
    public ControladorQuincunce(int filas) {
        initComponents();
        filasTotales = filas;
        aparatoGalton = fabrica.Generar(filasTotales);
        control = 0;         
        barrasGrafico = new ArrayList();
        barrasGrafico.add(barra1);
        barrasGrafico.add(barra2);
        barrasGrafico.add(barra3);
        barrasGrafico.add(barra4);
        barrasGrafico.add(barra5);
        barrasGrafico.add(barra6);
        barrasGrafico.add(barra7);
        barrasGrafico.add(barra8);
        barrasGrafico.add(barra9);
        barrasGrafico.add(barra10);
        barrasGrafico.add(barra11);
        barrasGrafico.add(jL_ValMax);
        barrasGrafico.add(Integer.valueOf(jL_ValMax.getText()));
        barrasGrafico.add(paneGrafico);
        
        for (int i = 0; i < 11; i++)
            ((JLabel)barrasGrafico.get(i)).setSize(60, 0);
        
        cata = new Catalizador(jLayeredPane1, filasTotales, (Quincunce) aparatoGalton, barrasGrafico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_Pausar = new javax.swing.JButton();
        jB_Comenzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        paneGrafico = new javax.swing.JLayeredPane();
        barra11 = new javax.swing.JLabel();
        jL_ValMax = new javax.swing.JLabel();
        barra1 = new javax.swing.JLabel();
        barra2 = new javax.swing.JLabel();
        barra3 = new javax.swing.JLabel();
        barra4 = new javax.swing.JLabel();
        barra5 = new javax.swing.JLabel();
        barra6 = new javax.swing.JLabel();
        barra7 = new javax.swing.JLabel();
        barra8 = new javax.swing.JLabel();
        barra9 = new javax.swing.JLabel();
        barra10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulación Quincunce");
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jB_Pausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/noun_55660_cc.png"))); // NOI18N
        jB_Pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PausarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 40));

        jB_Comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/noun_419263_cc.png"))); // NOI18N
        jB_Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 40));

        jLabel1.setText("Pausar simulación:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 90, 140, -1));

        jLabel2.setText("Comenzar simulación:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/Fondo.png"))); // NOI18N
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(0, 0, 680, 450);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 680, 450));

        paneGrafico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        barra11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/11.png"))); // NOI18N
        barra11.setMaximumSize(new java.awt.Dimension(60, 100));
        barra11.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra11);
        barra11.setBounds(760, 50, 70, 100);

        jL_ValMax.setText("100");
        paneGrafico.add(jL_ValMax);
        jL_ValMax.setBounds(10, 140, 18, 14);

        barra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/1.png"))); // NOI18N
        barra1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra1.setMaximumSize(new java.awt.Dimension(60, 100));
        barra1.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra1);
        barra1.setBounds(50, 50, 70, 100);

        barra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/2.png"))); // NOI18N
        barra2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra2.setMaximumSize(new java.awt.Dimension(60, 100));
        barra2.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra2);
        barra2.setBounds(120, 50, 70, 100);

        barra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/3.png"))); // NOI18N
        barra3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra3.setMaximumSize(new java.awt.Dimension(60, 100));
        barra3.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra3);
        barra3.setBounds(190, 50, 70, 100);

        barra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/4.png"))); // NOI18N
        barra4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra4.setMaximumSize(new java.awt.Dimension(60, 100));
        barra4.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra4);
        barra4.setBounds(260, 50, 70, 100);

        barra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/5.png"))); // NOI18N
        barra5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra5.setMaximumSize(new java.awt.Dimension(60, 100));
        barra5.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra5);
        barra5.setBounds(330, 50, 70, 100);

        barra6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/6.png"))); // NOI18N
        barra6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barra6.setMaximumSize(new java.awt.Dimension(60, 100));
        barra6.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra6);
        barra6.setBounds(400, 50, 70, 100);

        barra7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/7.png"))); // NOI18N
        barra7.setMaximumSize(new java.awt.Dimension(60, 100));
        barra7.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra7);
        barra7.setBounds(470, 50, 70, 100);

        barra8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/8.png"))); // NOI18N
        barra8.setMaximumSize(new java.awt.Dimension(60, 100));
        barra8.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra8);
        barra8.setBounds(540, 50, 70, 100);

        barra9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/9.png"))); // NOI18N
        barra9.setMaximumSize(new java.awt.Dimension(60, 100));
        barra9.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra9);
        barra9.setBounds(610, 50, 70, 100);

        barra10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/10.png"))); // NOI18N
        barra10.setMaximumSize(new java.awt.Dimension(60, 100));
        barra10.setMinimumSize(new java.awt.Dimension(60, 0));
        paneGrafico.add(barra10);
        barra10.setBounds(680, 50, 70, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controlador/escala.png"))); // NOI18N
        paneGrafico.add(jLabel4);
        jLabel4.setBounds(40, 20, 800, 160);

        jLabel6.setText("0");
        paneGrafico.add(jLabel6);
        jLabel6.setBounds(20, 30, 10, 14);

        getContentPane().add(paneGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 850, 180));
        getContentPane().add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 110, 90));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_PausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PausarActionPerformed
        cata.Pausar();
    }//GEN-LAST:event_jB_PausarActionPerformed

    private void jB_ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ComenzarActionPerformed
        cata.start();
    }//GEN-LAST:event_jB_ComenzarActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControladorQuincunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControladorQuincunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControladorQuincunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControladorQuincunce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControladorQuincunce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra1;
    private javax.swing.JLabel barra10;
    private javax.swing.JLabel barra11;
    private javax.swing.JLabel barra2;
    private javax.swing.JLabel barra3;
    private javax.swing.JLabel barra4;
    private javax.swing.JLabel barra5;
    private javax.swing.JLabel barra6;
    private javax.swing.JLabel barra7;
    private javax.swing.JLabel barra8;
    private javax.swing.JLabel barra9;
    private javax.swing.JButton jB_Comenzar;
    private javax.swing.JButton jB_Pausar;
    private javax.swing.JLabel jL_ValMax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane paneGrafico;
    // End of variables declaration//GEN-END:variables
}
