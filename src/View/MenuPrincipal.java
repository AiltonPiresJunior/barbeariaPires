/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuPrincipalController;

/**
 *
 * @author Ailton
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuServiços = new javax.swing.JMenuItem();
        MenuOperação = new javax.swing.JMenu();
        MenuAgenda = new javax.swing.JMenuItem();
        Relatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo-MenuPrincipal.jpg"))); // NOI18N

        MenuCadastro.setText("Cadastro");

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/cliente32-icon.png"))); // NOI18N
        MenuCliente.setText("Cliente");
        MenuCadastro.add(MenuCliente);

        MenuServiços.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/tesoura32-icon.png"))); // NOI18N
        MenuServiços.setText("Serviço");
        MenuCadastro.add(MenuServiços);

        jMenuBar1.add(MenuCadastro);

        MenuOperação.setText("Operação");

        MenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbeariaPires/src/View/imagens/icones/agenda32-icon.png"))); // NOI18N
        MenuAgenda.setText("Agenda");
        MenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaActionPerformed(evt);
            }
        });
        MenuOperação.add(MenuAgenda);

        jMenuBar1.add(MenuOperação);

        Relatorio.setText("Relatorio");
        jMenuBar1.add(Relatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlFundo)
                .addGap(0, 181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlFundo)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaActionPerformed
       
        this.controller.navegarParaAgendar();
  
        
    }//GEN-LAST:event_MenuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAgenda;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenu MenuOperação;
    private javax.swing.JMenuItem MenuServiços;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlFundo;
    // End of variables declaration//GEN-END:variables
}
