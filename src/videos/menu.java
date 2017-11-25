/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package videos;

import static java.lang.System.exit;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Reyes
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        
    }
    
    public void selection(){
        //Autor - Grabar
    if(k==1 && l==1){
    L1.setText("");
    TF1.setVisible(false);
    
    L2.setText("Nombre Actor");
    TF2.setVisible(true);
    TF2.setEnabled(true);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("Fecha Nacimiento");
    C1.setVisible(true);
    C1.setEnabled(true);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Grabar Autor");
    
    LM.setText("Autor - Grabar");
    
    C1.setCalendar(Calendar.getInstance());
    }
    
    //Autor - Modificar
    if(k==1 && l==2){
    L1.setText("id");
    TF1.setVisible(true);
    
    L2.setText("Nombre Actor");
    TF2.setVisible(true);
    TF2.setEnabled(false);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("Fecha Nacimiento");
    C1.setVisible(true);
    C1.setEnabled(false);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Modificar Autor");
    
    LM.setText("Autor - Modificar");
    C1.setCalendar(Calendar.getInstance());
    }
    
    //Autor - Eliminar
    if(k==1 && l==3){
    L1.setText("");
    TF1.setVisible(false);
    
    L2.setText("id");
    TF2.setVisible(true);
    TF2.setEnabled(true);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("");
    C1.setVisible(false);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Eliminar Autor");
    
    LM.setText("Autor - Eliminar");
    }
    
     //Categoria - Grabar
    if(k==4 && l==1){
    L1.setText("");
    TF1.setVisible(false);
    
    L2.setText("Nombre Categoria");
    TF2.setVisible(true);
    TF2.setEnabled(true);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("");
    C1.setVisible(false);
    C1.setEnabled(false);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Grabar Categoria");
    
    LM.setText("Categoria - Grabar");
    
    C1.setCalendar(Calendar.getInstance());
    }
    
    //Categoria - Modificar
    if(k==4 && l==2){
    L1.setText("id");
    TF1.setVisible(true);
    
    L2.setText("Nombre Categoria:");
    TF2.setVisible(true);
    TF2.setEnabled(false);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("");
    C1.setVisible(false);
    C1.setEnabled(false);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Modificar Categoria");
    
    LM.setText("Categoria - Modificar");
    C1.setCalendar(Calendar.getInstance());
    }
    
    //Categoria - Eliminar
    if(k==4 && l==3){
    L1.setText("");
    TF1.setVisible(false);
    
    L2.setText("id");
    TF2.setVisible(true);
    TF2.setEnabled(true);
    
    L3.setText("");
    TF3.setVisible(false);
    
    L4.setText("");
    TF4.setVisible(false);
    
    L5.setText("");
    TF5.setVisible(false);
    
    L6.setText("");
    C1.setVisible(false);
    
    L7.setText("");
    C2.setVisible(false);
    
    L8.setText("");
    CB1.setVisible(false);
    
    L9.setText("");
    CB2.setVisible(false);
   
    B.setVisible(true);
    B.setText("Eliminar Categoria");
    
    LM.setText("Categoria - Eliminar");
    }
    
     }
    public void primero(){
     DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre Actor");
            modelo.addColumn("DATE");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT* FROM actor");
         datos=new String[3];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        l=1; k=1;
        selection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb1 = new javax.swing.JTable();
        B = new javax.swing.JButton();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        C1 = new com.toedter.calendar.JDateChooser();
        C2 = new com.toedter.calendar.JDateChooser();
        CB1 = new javax.swing.JComboBox();
        CB2 = new javax.swing.JComboBox();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        TF3 = new javax.swing.JTextField();
        TF4 = new javax.swing.JTextField();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        TF5 = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        LM = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Archivo = new javax.swing.JMenu();
        Item_Salir = new javax.swing.JMenuItem();
        Menu_Consultar = new javax.swing.JMenu();
        Item_Actor = new javax.swing.JMenuItem();
        Item_Cartucho = new javax.swing.JMenuItem();
        Item_Cliente = new javax.swing.JMenuItem();
        Item_Categoria = new javax.swing.JMenuItem();
        Item_Pelicula = new javax.swing.JMenuItem();
        Item_Formato = new javax.swing.JMenuItem();
        Item_Prestamo = new javax.swing.JMenuItem();
        Item_PeliculaActor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Menu_Accion = new javax.swing.JMenu();
        Item_Grabar = new javax.swing.JMenuItem();
        Item_Modificar = new javax.swing.JMenuItem();
        Item_Eliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tb1);

        B.setText("GRABAR");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        TF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF1KeyReleased(evt);
            }
        });

        CB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        L1.setText("Nombre");

        L2.setText("Apellido");

        L6.setText("Fecha Salida");

        L7.setText("Fecha Entrada");

        L8.setText("Pelicula");

        L9.setText("Formato");

        L3.setText("Credito");

        L4.setText("Telefono");

        L5.setText("Direccion");

        LM.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LM.setText("Autor - Grabar");
        LM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Menu_Archivo.setText("Archivo");

        Item_Salir.setText("Salir");
        Item_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SalirActionPerformed(evt);
            }
        });
        Menu_Archivo.add(Item_Salir);

        jMenuBar1.add(Menu_Archivo);

        Menu_Consultar.setText("Consultar");
        Menu_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ConsultarActionPerformed(evt);
            }
        });

        Item_Actor.setText("Actor");
        Item_Actor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ActorActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Actor);

        Item_Cartucho.setText("Cartucho");
        Item_Cartucho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_CartuchoActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Cartucho);

        Item_Cliente.setText("Cliente");
        Item_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ClienteActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Cliente);

        Item_Categoria.setText("Categoria");
        Item_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_CategoriaActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Categoria);

        Item_Pelicula.setText("Pelicula");
        Item_Pelicula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Item_PeliculaItemStateChanged(evt);
            }
        });
        Item_Pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PeliculaActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Pelicula);

        Item_Formato.setText("Formato");
        Item_Formato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_FormatoActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Formato);

        Item_Prestamo.setText("Prestamo");
        Item_Prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PrestamoActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_Prestamo);

        Item_PeliculaActor.setText("PeliculaActor");
        Item_PeliculaActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PeliculaActorActionPerformed(evt);
            }
        });
        Menu_Consultar.add(Item_PeliculaActor);
        Menu_Consultar.add(jSeparator2);
        Menu_Consultar.add(jSeparator1);

        jMenuBar1.add(Menu_Consultar);

        Menu_Accion.setText("Accion");

        Item_Grabar.setText("Grabar");
        Item_Grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_GrabarActionPerformed(evt);
            }
        });
        Menu_Accion.add(Item_Grabar);

        Item_Modificar.setText("Modificar");
        Item_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ModificarActionPerformed(evt);
            }
        });
        Menu_Accion.add(Item_Modificar);

        Item_Eliminar.setText("Eliminar");
        Item_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_EliminarActionPerformed(evt);
            }
        });
        Menu_Accion.add(Item_Eliminar);

        jMenuBar1.add(Menu_Accion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF2)
                                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF4)
                                    .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CB2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(LM, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(L2)
                                        .addComponent(L1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(L7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(L6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L9)
                            .addComponent(L8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L3)
                            .addComponent(L4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(L5)
                .addGap(18, 18, 18)
                .addComponent(TF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_CategoriaActionPerformed
        // TODO add your handling code here:
        k=4;
        DefaultTableModel modelo=new DefaultTableModel();
        try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre Categoria");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT* FROM categoria");
         datos=new String[2];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_CategoriaActionPerformed

    private void Item_ActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ActorActionPerformed
        // TODO add your handling code here:
        k=1;
        DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre Actor");
            modelo.addColumn("DATE");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT* FROM actor");
         datos=new String[3];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_ActorActionPerformed

    private void Item_PeliculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Item_PeliculaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_PeliculaItemStateChanged

    private void Menu_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ConsultarActionPerformed

    private void Item_CartuchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_CartuchoActionPerformed
        // TODO add your handling code here:
        k=2;
        DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Pelicula");
            modelo.addColumn("Formato");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT A.id_cartucho,B.titulo,C.nombre FROM "
                  + "cartucho A,pelicula B,formato C WHERE A.id_pelicula=B.id_pelicula "
                  + "AND A.id_formato=C.id_formato ORDER BY A.id_cartucho");
         datos=new String[3];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_CartuchoActionPerformed

    private void Item_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Item_SalirActionPerformed

    private void Item_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ClienteActionPerformed
        // TODO add your handling code here:
        k=3;
        DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Credito");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            modelo.addColumn("Direccion");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT* FROM cliente ");
         datos=new String[6];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          datos[3]=rs.getString(4);
          datos[4]=rs.getString(5);
          datos[5]=rs.getString(6);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_ClienteActionPerformed

    private void Item_PeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PeliculaActionPerformed
        // TODO add your handling code here:
        k=5;
         DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre de la pelicula");
            modelo.addColumn("Categoria");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT pelicula.id_pelicula,pelicula.titulo,"
                  + "categoria.nombre  FROM pelicula,categoria WHERE "
                  + "pelicula.id_categoria=categoria.id_categoria ORDER BY "
                  + "pelicula.id_pelicula");
         datos=new String[3];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_PeliculaActionPerformed

    private void Item_FormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_FormatoActionPerformed
        // TODO add your handling code here:
        k=6;
        DefaultTableModel modelo=new DefaultTableModel();
        try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre del formato");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT* FROM formato");
         datos=new String[2];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_FormatoActionPerformed

    private void Item_PrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PrestamoActionPerformed
        // TODO add your handling code here:
        k=7;
        DefaultTableModel modelo=new DefaultTableModel();
        try {
            modelo.addColumn("id");
            modelo.addColumn("NombreCliente");
            modelo.addColumn("ApellidoCliente");
            modelo.addColumn("Fecha Prestamo");
            modelo.addColumn("Fecha Entrega");
            modelo.addColumn("Pelicula");
            modelo.addColumn("Formato");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT prestamo.id_prestamo,cliente.nombre_1,"
                  + "cliente.nombre_2,prestamo.fecha_prest,prestamo.fecha_ent,"
                  + "pelicula.titulo,formato.nombre FROM prestamo,cliente,cartucho,"
                  + "pelicula,formato WHERE prestamo.id_cliente=cliente.id_cliente"
                  + " AND prestamo.id_cartucho=cartucho.id_cartucho AND  "
                  + "cartucho.id_pelicula=pelicula.id_pelicula AND "
                  + "cartucho.id_formato=formato.id_formato ORDER BY prestamo.id_prestamo");
         datos=new String[7];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          datos[3]=rs.getString(4);
          datos[4]=rs.getString(5);
          datos[5]=rs.getString(6);
          datos[6]=rs.getString(7);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_PrestamoActionPerformed

    private void Item_PeliculaActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PeliculaActorActionPerformed
        // TODO add your handling code here:
        k=8;
        DefaultTableModel modelo=new DefaultTableModel();
         try {
            modelo.addColumn("id");
            modelo.addColumn("Nombre Actor");
            modelo.addColumn("Pelicula");
            modelo.addColumn("Rol");
          st=cn.createStatement();
          rs=st.executeQuery("SELECT pel_act.id_pel_act, actor.nombre,pelicula.titulo,pel_act.rol "
                  + "FROM pel_act,pelicula,actor WHERE pel_act.id_pelicula=pelicula.id_pelicula "
                  + "AND pel_act.id_actor=actor.id_actor ORDER BY pel_act.id_actor");
         datos=new String[4];
          while(rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          datos[3]=rs.getString(4);
          modelo.addRow(datos);
          }
        } catch (Exception e) {
        }
        
        Tb1.setModel(modelo);
        selection();
    }//GEN-LAST:event_Item_PeliculaActorActionPerformed

    private void Item_GrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_GrabarActionPerformed
        // TODO add your handling code here:
        l=1;
        selection();
    }//GEN-LAST:event_Item_GrabarActionPerformed

    private void Item_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ModificarActionPerformed
        // TODO add your handling code here:
        l=2;
        selection();
    }//GEN-LAST:event_Item_ModificarActionPerformed

    private void Item_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_EliminarActionPerformed
        // TODO add your handling code here:
        l=3;
        selection();
    }//GEN-LAST:event_Item_EliminarActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        //Autor - Grabar
        if(k==1 && l==1){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                String Date=String.valueOf(C1.getCalendar().get(Calendar.YEAR))
                        +"/"+String.valueOf(C1.getCalendar().get(Calendar.MONTH)+1)
                        +"/"+String.valueOf(C1.getCalendar().get(Calendar.DAY_OF_MONTH));
                PreparedStatement pst = cn.prepareStatement("INSERT INTO actor"
                        + "(nombre,date) VALUES(?,?)");
                pst.setString(1, TF2.getText());
                pst.setString(2, Date);
                pst.executeUpdate();
                TF2.setText("");
                Item_ActorActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       }
        //Autor - Modificar
        if(k==1 && l==2){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                String Date=String.valueOf(C1.getCalendar().get(Calendar.YEAR))
                        +"/"+String.valueOf(C1.getCalendar().get(Calendar.MONTH)+1)
                        +"/"+String.valueOf(C1.getCalendar().get(Calendar.DAY_OF_MONTH));
                PreparedStatement pst = cn.prepareStatement("UPDATE actor SET nombre='"
                        +TF2.getText()+"',date='"+Date+"' WHERE id_actor='"+TF1.getText()+"'");
                pst.executeUpdate();
                TF1.setText("");
                TF2.setText("");
                Item_ActorActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       }
        
        //Autor - eliminar
        if(k==1 && l==3){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                
                PreparedStatement pst = cn.prepareStatement("DELETE FROM actor"
                        + " WHERE id_actor='"+TF2.getText()+"'");
                pst.executeUpdate();
                TF2.setText("");
                Item_ActorActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
       }
        
       /////////////////////////77
        //Categoria - Grabar
        if(k==4 && l==1){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                
                PreparedStatement pst = cn.prepareStatement("INSERT INTO categoria"
                        + "(nombre) VALUES(?)");
                pst.setString(1, TF2.getText());
                pst.executeUpdate();
                TF2.setText("");
                Item_CategoriaActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       }
        //Categoria - Modificar
        if(k==4 && l==2){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                PreparedStatement pst = cn.prepareStatement("UPDATE categoria SET nombre='"
                        +TF2.getText()+"' WHERE id_categoria='"+TF1.getText()+"'");
                pst.executeUpdate();
                TF1.setText("");
                TF2.setText("");
                Item_CategoriaActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       }
         //Categoria - eliminar
        if(k==4 && l==3){
            if(TF2.getText().equals(Empty)){
    JOptionPane.showMessageDialog(null, "Campos vacios ");
    }    else{ 
            try {
                
                PreparedStatement pst = cn.prepareStatement("DELETE FROM categoria"
                        + " WHERE id_categoria='"+TF2.getText()+"'");
                pst.executeUpdate();
                TF2.setText("");
                Item_CategoriaActionPerformed(evt);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
       }
        
    }//GEN-LAST:event_BActionPerformed

    private void TF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF1KeyReleased
        // TODO add your handling code here:
        
        if(TF1.getText().equals(Empty) && k==1 && l==2){
         TF2.setEnabled(false);
        C1.setEnabled(false);
        }else{
         TF2.setEnabled(true);
        C1.setEnabled(true);
        }
        
        if(TF1.getText().equals(Empty) && k==4 && l==2){
         TF2.setEnabled(false);
        }else{
         TF2.setEnabled(true);
        }
    }//GEN-LAST:event_TF1KeyReleased

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B;
    private com.toedter.calendar.JDateChooser C1;
    private com.toedter.calendar.JDateChooser C2;
    private javax.swing.JComboBox CB1;
    private javax.swing.JComboBox CB2;
    private javax.swing.JMenuItem Item_Actor;
    private javax.swing.JMenuItem Item_Cartucho;
    private javax.swing.JMenuItem Item_Categoria;
    private javax.swing.JMenuItem Item_Cliente;
    private javax.swing.JMenuItem Item_Eliminar;
    private javax.swing.JMenuItem Item_Formato;
    private javax.swing.JMenuItem Item_Grabar;
    private javax.swing.JMenuItem Item_Modificar;
    private javax.swing.JMenuItem Item_Pelicula;
    private javax.swing.JMenuItem Item_PeliculaActor;
    private javax.swing.JMenuItem Item_Prestamo;
    private javax.swing.JMenuItem Item_Salir;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JLabel LM;
    private javax.swing.JMenu Menu_Accion;
    private javax.swing.JMenu Menu_Archivo;
    private javax.swing.JMenu Menu_Consultar;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JTextField TF5;
    private javax.swing.JTable Tb1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

conexion ob = new conexion();
Connection cn=ob.con();
Statement st;
ResultSet rs;
int i,j,k,l;
String []datos;
String Empty=new String ();
}
