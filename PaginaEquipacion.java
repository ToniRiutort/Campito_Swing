import java.awt.event.ActionEvent;

public class PaginaEquipacion extends javax.swing.JFrame {

    /**
     * Creates new form PaginaP
     */
    public PaginaEquipacion() {
        initComponents();
        setVisible(true);
        setSize(825,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        FondoRojo = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        BotonEquipo = new javax.swing.JButton();
        BotonCampo = new javax.swing.JButton();
        BotonEquipacion = new javax.swing.JButton();
        BotonPartidos = new javax.swing.JButton();
        BotonTienda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        FondoRojo.setBackground(new java.awt.Color(227, 21, 59));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinal/LogoCampito2.jpg"))); // NOI18N
        Logo.setText("jLabel1");

        BotonEquipo.setBackground(new java.awt.Color(227, 21, 59));
        BotonEquipo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonEquipo.setForeground(new java.awt.Color(255, 255, 255));
        BotonEquipo.setText("EQUIPO");
        BotonEquipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEquipoActionPerformed(evt);
            }
        });

        BotonCampo.setBackground(new java.awt.Color(227, 21, 59));
        BotonCampo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonCampo.setForeground(new java.awt.Color(255, 255, 255));
        BotonCampo.setText("CAMPO");
        BotonCampo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCampoActionPerformed(evt);
            }
        });

        BotonEquipacion.setBackground(new java.awt.Color(227, 21, 59));
        BotonEquipacion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonEquipacion.setForeground(new java.awt.Color(255, 255, 255));
        BotonEquipacion.setText("EQUIPACIÓN");
        BotonEquipacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonEquipacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEquipacionActionPerformed(evt);
            }
        });

        BotonPartidos.setBackground(new java.awt.Color(227, 21, 59));
        BotonPartidos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonPartidos.setForeground(new java.awt.Color(255, 255, 255));
        BotonPartidos.setText("PARTIDOS");
        BotonPartidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPartidosActionPerformed(evt);
            }
        });

        BotonTienda.setBackground(new java.awt.Color(227, 21, 59));
        BotonTienda.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        BotonTienda.setForeground(new java.awt.Color(255, 255, 255));
        BotonTienda.setText("TIENDA");
        BotonTienda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoRojoLayout = new javax.swing.GroupLayout(FondoRojo);
        FondoRojo.setLayout(FondoRojoLayout);
        FondoRojoLayout.setHorizontalGroup(
            FondoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoRojoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonEquipacion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(FondoRojoLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoRojoLayout.setVerticalGroup(
            FondoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoRojoLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEquipacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("<html>Esta es la equipación de nuestro equipo, la cual su color principal es el rojo junto con el color secundario, que es el blanco. En la parte delantera se puede apreciar una dibujo que va desde la parte superior derecha hasta el lado izquierdo por la mitad, también esta el escudo arriba a la izquierda del dibujo de color blanco. Los nombres estan centrados en la parte superior, el dorsal también esta centrado y esta justo debajo de los nombre y el logo de nuestro pratrocinador, que esta justo debajo de la dorsal y todos son de color blanco y estan en la parte posterior de la camiseta.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinal/eqcampitode2.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajofinal/eqcampitoes2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(FondoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    //Aqui esta el codigo que se ejecuta cuando el boton equipo es pulsado
    private void BotonEquipoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //Cerramos la PaginaEquipacion
        dispose();
        //Abrimos la PaginaEquipo
        PaginaEquipo peq = new PaginaEquipo();
        //Con estas dimensiones
        peq.setSize(825,540);
        peq.setVisible(true);
    }                                           

    private void BotonCampoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //Cerramos la PaginaEquipacion
        dispose();
        //Abrimos la PaginaCampo
        PaginaCampo pc = new PaginaCampo();
        //Con estas dimensiones
        pc.setSize(820,550);
        pc.setVisible(true);
    }                                          

    private void BotonEquipacionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //Cerramos la PaginaEquipacion
        dispose();
        //Abrimos la PaginaEquipacion
        PaginaEquipacion peqn = new PaginaEquipacion();
        //Con estas dimensiones
        peqn.setSize(820,550);
        peqn.setVisible(true);
    }                                               

    private void BotonPartidosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //Cerramos la PaginaEquipacion
        dispose();
        //Abrimos la PaginaPartidos
        PaginaPartidos pp = new PaginaPartidos();
        pp.setVisible(true);
    }                                             

    private void BotonTiendaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //Cerramos la PaginaEquipacion
        dispose();
        //Abrimos la PaginaTienda
        PaginaTienda pt = new PaginaTienda();
        pt.setVisible(true);
    }                                           
    
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
            java.util.logging.Logger.getLogger(PaginaEquipacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEquipacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonCampo;
    private javax.swing.JButton BotonEquipacion;
    private javax.swing.JButton BotonEquipo;
    private javax.swing.JButton BotonPartidos;
    private javax.swing.JButton BotonTienda;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel FondoRojo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}
