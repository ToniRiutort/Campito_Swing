import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PaginaTienda extends javax.swing.JFrame {

    /**
     * Creates new form PaginaP
     */
    public PaginaTienda() {
        //Inicializacion de los strings para mostrar la informacion de la querry
        String tiendap = "";
        String tiendad = "";
        String tiendapr = "";
        String tiendast = "";
        initComponents();
        //Aqui ponemos un try y catch por si la conexion no va bien
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //A la variable conexion le indicamos "jdbc:mysql://IP:3306/Nombre de la base de datos","Nombre usuario","Contraseña"
            Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.56.2:3306/Campito","toni","1234");
            Statement s = conexion.createStatement();
            //rs es donde se guarda la ejecucion de la querry
            ResultSet rs = s.executeQuery("SELECT * FROM TIENDA");
            
            //Bucle donde vamos guardando la información del resultado de la querry
            while(rs.next()){
                tiendap = tiendap +(rs.getString(1)+"<br>");
                Labeltiendap.setText(tiendap);
                tiendad = tiendad +(rs.getString(2)+"<br>");
                Labeltiendad.setText(tiendad);
                tiendapr = tiendapr +(rs.getInt(3)+"<br>");
                Labeltiendapr.setText(tiendapr);
                tiendast = tiendast +(rs.getInt(4)+"<br>");
                Labeltiendast.setText(tiendast);
            }
            //Pasamos la información al label
            Labeltiendap.setText("<html>"+tiendap+"</html>");
            Labeltiendad.setText("<html>"+tiendad+"</html>");
            Labeltiendapr.setText("<html>"+tiendapr+"</html>");
            Labeltiendast.setText("<html>"+tiendast+"</html>");
            conexion.close();
        }
        //Catch que si encuentra un error lo mostrara y dira donde ha fallado 
        catch(Exception e){
            System.out.println("ERROR EN PAGINATIENDA");
            System.out.println(e);
        }
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
        Labeltiendapr = new javax.swing.JLabel();
        Labeltiendap = new javax.swing.JLabel();
        Labeltiendad = new javax.swing.JLabel();
        Labeltiendast = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        Labeltiendapr.setBackground(new java.awt.Color(227, 21, 59));
        Labeltiendapr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Labeltiendap.setBackground(new java.awt.Color(227, 21, 59));
        Labeltiendap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Labeltiendad.setBackground(new java.awt.Color(227, 21, 59));
        Labeltiendad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Labeltiendast.setBackground(new java.awt.Color(227, 21, 59));
        Labeltiendast.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("DESCRICIÓN");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("PRECIO(EURO)");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("STOCK");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(Labeltiendap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Labeltiendad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Labeltiendapr, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Labeltiendast, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(FondoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labeltiendad, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeltiendap, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeltiendapr, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeltiendast, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
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
        //Cerramos la PaginaTienda
        dispose();
        //Abrimos la PaginaEquipo
        PaginaEquipo peq = new PaginaEquipo();
        //Con estas dimensiones
        peq.setSize(825,540);
        peq.setVisible(true);
    }                                           

    //Aqui esta el codigo que se ejecuta cuando el boton campo es pulsado
    private void BotonCampoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //Cerramos la PaginaTienda
        dispose();
        //Abrimos la PaginaCampo
        PaginaCampo pc = new PaginaCampo();
        //Con estas dimensiones
        pc.setSize(820,550);
        pc.setVisible(true);
    }                                          

    //Aqui esta el codigo que se ejecuta cuando el boton campo es pulsado
    private void BotonEquipacionActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //Cerramos la PaginaTienda
        dispose();
        //Abrimos la PaginaEquipacion
        PaginaEquipacion peqn = new PaginaEquipacion();
        //Con estas dimensiones
        peqn.setSize(820,550);
        peqn.setVisible(true);
    }                                               

    //Aqui esta el codigo que se ejecuta cuando el boton partidos es pulsado
    private void BotonPartidosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //Cerramos la PaginaTienda
        dispose();
        //Abrimos la PaginaPartidos
        PaginaPartidos pp = new PaginaPartidos();
        pp.setVisible(true);
    }                                             

    //Aqui esta el codigo que se ejecuta cuando el boton tienda es pulsado
    private void BotonTiendaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //Cerramos la PaginaTienda
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
            java.util.logging.Logger.getLogger(PaginaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaTienda().setVisible(true);
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
    private javax.swing.JLabel Labeltiendad;
    private javax.swing.JLabel Labeltiendap;
    private javax.swing.JLabel Labeltiendapr;
    private javax.swing.JLabel Labeltiendast;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}
