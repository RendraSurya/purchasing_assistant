/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import java.awt.Image;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import model.purchaseRequest;
import model.warehouse;

/**
 *
 * @author Windows 10
 */
public class DashboardNP extends javax.swing.JFrame {
    Connection connection;
    Statement stmt;
    ResultSet rsPR;
    ResultSet rsStock;
    Object[] itemID =new Object[1];
    ArrayList<purchaseRequest> listPR= new ArrayList<purchaseRequest>();
    ArrayList<warehouse> listStock= new ArrayList<warehouse>();
    String[] headerPR= {"Purchase Request ID","Purchase Request Name","Status Purchase Request"}; 
    String[] headerStock= {"Item ID","Item Name","Ending Stock"}; 
    String[] comboItem={"MLG2417", "KAS4402", "PEP5248"};
    String[] comboUM={"pcs", "pack", "eksemplar"};
  
    public DashboardNP() {
        initComponents();
        getContentPane().requestFocusInWindow();
        this.setIconImage(new ImageIcon(getClass().getResource("/image/icon.png")).getImage());
        showMinPR();
        showStock();
        JComboBox itemc= new JComboBox(comboItem);
        TableColumn itc= createPRTable.getColumnModel().getColumn(0);
        TableCellEditor itce = new DefaultCellEditor(itemc);
        itc.setCellEditor(itce);
        JComboBox umc= new JComboBox(comboUM);
        TableColumn utc= createPRTable.getColumnModel().getColumn(3);
        TableCellEditor utce = new DefaultCellEditor(umc);
        utc.setCellEditor(utce);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBtn = new javax.swing.JButton();
        Tab = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        scrollDashboard = new javax.swing.JScrollPane();
        prTable = new javax.swing.JTable();
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/image/dashboardNP2.png")); Image image2 = icon2.getImage();
        panelPR = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image2,0,0,getWidth(),getHeight(),this);
            }
        };
        prText = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        requestDateLabel = new javax.swing.JLabel();
        receivingDateLabel = new javax.swing.JLabel();
        scrollCreatePR = new javax.swing.JScrollPane();
        createPRTable = new javax.swing.JTable();
        submitBtn = new javax.swing.JButton();
        userLabel1 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        reqDate = new org.jdesktop.swingx.JXDatePicker();
        receDate = new org.jdesktop.swingx.JXDatePicker();
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/image/dashboardNP3.png")); Image image3 = icon3.getImage();
        jDesktopPane3 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image3,0,0,getWidth(),getHeight(),this);
            }
        };
        masterStockLabel = new javax.swing.JLabel();
        dateStockLabel = new javax.swing.JLabel();
        scrollStock = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchasing Assistant");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setBackground(new java.awt.Color(255, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setToolTipText("");
        logoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.setName("logoutBtn"); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 6, 95, 25));

        Tab.setBackground(new java.awt.Color(255, 255, 255));
        Tab.setAlignmentX(0.8F);
        Tab.setFocusable(false);
        Tab.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Tab.setInheritsPopupMenu(true);
        Tab.setName("Tab"); // NOI18N
        Tab.setPreferredSize(new java.awt.Dimension(800, 600));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        scrollDashboard.setBorder(null);
        scrollDashboard.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        scrollDashboard.setOpaque(false);

        prTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Purchase Request ID", "Purchase Request Name", "Status Purchase Request"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prTable.setEnabled(false);
        prTable.setIntercellSpacing(new java.awt.Dimension(1, 10));
        prTable.setName("prTable"); // NOI18N
        prTable.setRowHeight(60);
        scrollDashboard.setViewportView(prTable);

        jDesktopPane1.setLayer(scrollDashboard, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 37, Short.MAX_VALUE)
                    .addComponent(scrollDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 37, Short.MAX_VALUE)))
        );

        Tab.addTab("Dashboard", jDesktopPane1);

        panelPR.setBackground(new java.awt.Color(153, 153, 153));
        panelPR.setMinimumSize(new java.awt.Dimension(20, 20));
        panelPR.setName("panelPR"); // NOI18N
        panelPR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        prText.setText("Nama Purchase Request");
        prText.setBorder(null);
        prText.setName("prText"); // NOI18N
        prText.setOpaque(false);
        prText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prTextFocusLost(evt);
            }
        });
        panelPR.add(prText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 211, 35));

        userLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("PR Name");
        panelPR.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        requestDateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        requestDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestDateLabel.setText("Request Date");
        panelPR.add(requestDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        receivingDateLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        receivingDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receivingDateLabel.setText("Receiving Date");
        panelPR.add(receivingDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        scrollCreatePR.setBackground(new java.awt.Color(255, 255, 255));
        scrollCreatePR.setBorder(null);
        scrollCreatePR.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        scrollCreatePR.setOpaque(false);

        createPRTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        createPRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Item ID", "Nama Barang",  new Integer(1), "Pengukuran", "Tulis Keterangan"}
            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "UM", "Remark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        createPRTable.setToolTipText("");
        createPRTable.setAlignmentY(1.2F);
        createPRTable.setGridColor(new java.awt.Color(255, 255, 255));
        createPRTable.setName("createPRTable"); // NOI18N
        createPRTable.setRowHeight(27);
        createPRTable.getTableHeader().setReorderingAllowed(false);
        createPRTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                createPRTablePropertyChange(evt);
            }
        });
        scrollCreatePR.setViewportView(createPRTable);
        if (createPRTable.getColumnModel().getColumnCount() > 0) {
            createPRTable.getColumnModel().getColumn(0).setResizable(false);
            createPRTable.getColumnModel().getColumn(1).setResizable(false);
            createPRTable.getColumnModel().getColumn(2).setResizable(false);
            createPRTable.getColumnModel().getColumn(3).setResizable(false);
            createPRTable.getColumnModel().getColumn(4).setResizable(false);
        }

        panelPR.add(scrollCreatePR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 777, 240));

        submitBtn.setBackground(new java.awt.Color(0, 153, 255));
        submitBtn.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.setToolTipText("");
        submitBtn.setBorder(null);
        submitBtn.setName("submitBtn"); // NOI18N
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        panelPR.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 520, 95, 31));

        userLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel1.setText("User ID");
        panelPR.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, -1));

        userID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userID.setText("ID Requester");
        userID.setBorder(null);
        userID.setName("userID"); // NOI18N
        userID.setOpaque(false);
        userID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userIDFocusGained(evt);
            }
        });
        panelPR.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 59, 211, 35));

        reqDate.setName("reqDate"); // NOI18N
        panelPR.add(reqDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 106, 211, 35));

        receDate.setName("receDate"); // NOI18N
        panelPR.add(receDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 151, 211, 35));

        Tab.addTab("Purchase Request", panelPR);

        masterStockLabel.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        masterStockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masterStockLabel.setText("Master Stock From Warehouse");

        dateStockLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dateStockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateStockLabel.setText("Date");
        dateStockLabel.setName("dateStockLabel"); // NOI18N

        scrollStock.setBorder(null);
        scrollStock.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        scrollStock.setOpaque(false);

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Ending Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.setEnabled(false);
        stockTable.setName("stockTable"); // NOI18N
        stockTable.setRowHeight(30);
        scrollStock.setViewportView(stockTable);

        jDesktopPane3.setLayer(masterStockLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(dateStockLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(scrollStock, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane3Layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(masterStockLabel))
                        .addGroup(jDesktopPane3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(dateStockLabel))
                        .addComponent(scrollStock, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(masterStockLabel)
                    .addGap(31, 31, 31)
                    .addComponent(dateStockLabel)
                    .addGap(21, 21, 21)
                    .addComponent(scrollStock, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Tab.addTab("Warehouse", jDesktopPane3);

        getContentPane().add(Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));
        Tab.getAccessibleContext().setAccessibleName("Tab");
        Tab.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void prTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prTextFocusGained
        // TODO add your handling code here:
        if(prText.getText().equals("Nama Purchase Request")){
            prText.setText("");
        }
    }//GEN-LAST:event_prTextFocusGained

    private void prTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_prTextFocusLost

    private void userIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusGained
        // TODO add your handling code here:
        if(userID.getText().equals("ID Requester")){
            userID.setText("");
        }
    }//GEN-LAST:event_userIDFocusGained

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String itemID = createPRTable.getValueAt(0, 0).toString();
        String itemName = createPRTable.getValueAt(0, 1).toString();
        int itemQuant = Integer.parseInt(createPRTable.getValueAt(0, 2).toString());
        String pengukuran = createPRTable.getValueAt(0, 3).toString();
        String remark = createPRTable.getValueAt(0, 4).toString();
        if(prText.getText().equalsIgnoreCase("") || userID.getText().equalsIgnoreCase("") || reqDate.getDate()==null || 
                receDate.getDate()==null || itemID.equalsIgnoreCase("") || itemName.equalsIgnoreCase("Nama Barang") || 
                itemName.equalsIgnoreCase("") || remark.equalsIgnoreCase("") || remark.equalsIgnoreCase("Tulis Keterangan")|| 
                itemQuant==0 || isNumeric(userID.getText())==false ){
           JOptionPane.showMessageDialog(null, "Data harus diisi dengan lengkap dan benar");
        }
        else{
            createPR();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            showMinPR();
            createPRTable.setFocusable(false);
            prText.setText("Nama Purchase Request");
            userID.setText("ID Requester ");
            createPRTable.setValueAt("ItemID", 0, 0);
            createPRTable.setValueAt("Nama Barang", 0, 1);
            createPRTable.setValueAt("1", 0, 2);
            createPRTable.setValueAt("Pengukuran", 0, 3);
            createPRTable.setValueAt("Tulis Keterangan", 0, 4);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void createPRTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_createPRTablePropertyChange
        // TODO add your handling code here:
        String itemID = createPRTable.getValueAt(0, 0).toString();
        switch(itemID){
            case "MLG2417":
                createPRTable.setValueAt("Mouse Logitech",0,1);
                createPRTable.setValueAt("pcs",0,3);
                break;
            case "KAS4402":
                createPRTable.setValueAt("Laptop Asus",0,1);
                createPRTable.setValueAt("pcs",0,3);
                break;
            case "PEP5248":
                createPRTable.setValueAt("Printer EPSON",0,1);
                createPRTable.setValueAt("pcs",0,3);
                break;
        }
    }//GEN-LAST:event_createPRTablePropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardNP().setVisible(true);
            }
        });
    }
    
    public void getData(){
        listPR.clear();
        listStock.clear();
        try{
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + "D:/PurchasingAssistant.accdb;","", "");
            System.out.println("Berhasil konek");
                    stmt = connection.createStatement();
            rsPR = stmt.executeQuery("SELECT * FROM PR");
            while(rsPR.next()){
                listPR.add(new purchaseRequest(rsPR.getString("employeeID"), rsPR.getString("itemID"), 
                        rsPR.getString("um"), rsPR.getString("remark"), rsPR.getString("statusPR"), rsPR.getString("prName"),
                        rsPR.getDate("requestDate"), rsPR.getDate("receivingDate"), rsPR.getBoolean("approvalManager"), 
                        rsPR.getInt("prID"), rsPR.getInt("quantity")));
            } 
            
            rsStock = stmt.executeQuery("SELECT * FROM Warehouse");
            while(rsStock.next()){
                listStock.add(new warehouse(rsStock.getString("itemID"), rsStock.getString("itemName"), rsStock.getInt("endingStock")));
                itemID[0] = rsStock.getString("itemID");
            } 
        }
        catch(SQLException errMsg)
        {
            System.out.println(errMsg.getMessage());

        }
    }
    
    private void createPR(){

        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
        DateFormat writeFormat = new SimpleDateFormat( "MM/dd/yyyy");
        String req = reqDate.getDate().toString();
        Date reqdate = null;
        try {
            reqdate = (Date)format.parse(req);
        }catch (ParseException ex) {
            Logger.getLogger(DashboardNP.class.getName()).log(Level.SEVERE, null, ex);
        }
        String formattedReqDate = "";
        if( reqdate != null ) {
            formattedReqDate = writeFormat.format( reqdate );
        }
        
        String rece = receDate.getDate().toString();
        Date recedate = null;
        try {
            recedate = (Date)format.parse(rece);
        }catch (ParseException ex) {
            Logger.getLogger(DashboardNP.class.getName()).log(Level.SEVERE, null, ex);
        }
        String formattedReceDate = "";
        if( recedate != null ) {
            formattedReceDate = writeFormat.format( recedate );
        }

        String itemID = createPRTable.getValueAt(0, 0).toString();
        String itemName = createPRTable.getValueAt(0, 1).toString();
        int itemQuant = Integer.parseInt(createPRTable.getValueAt(0, 2).toString());
        String pengukuran = createPRTable.getValueAt(0, 3).toString();
        String remark = createPRTable.getValueAt(0, 4).toString();
        String sql;
        String status = "Waiting for approval";
        sql = "INSERT INTO PR (prName, employeeID, requestDate, receivingDate, itemID, quantity, UM, remark, statusPR) " 
                + "VALUES ('"+ prText.getText() +"',"
                + "'"+ userID.getText() +"',"
                + "#"+ formattedReqDate +"#,"
                + "#"+ formattedReceDate +"#,"
                + "'"+ itemID +"',"
                + "'"+ itemQuant +"',"
                + "'"+ pengukuran +"',"
                + "'"+ remark +"',"
                + "'"+ status +"') ";
        
        try{
            int berhasil = stmt.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
        
    public void logout(){
        int reply = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin Logout?", "Logout?",  JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
            LoginScreen login = new LoginScreen();
            login.setVisible(true);
            this.dispose();
        }
        else{
            getContentPane().requestFocusInWindow();
        }
    }
    
    private void showMinPR(){
        getData();
        Object[][] data=new Object[this.listPR.size()][3];
        int x=0;
        for(purchaseRequest pr:this.listPR){
            data[x][0]= pr.getPrID();
            data[x][1]= pr.getPrName();
            data[x][2]= pr.getStatusPR();
            ++x;
        }
        
        Date date = new Date();
        reqDate.setDate(date);
        receDate.setDate(date);
        prTable.setModel(new DefaultTableModel(data,headerPR));
        
    }

    private void showStock(){
        getData();
        Object[][] data=new Object[this.listStock.size()][3];
        int x=0;
        for(warehouse wh:this.listStock){
            data[x][0]= wh.getItemID();
            data[x][1]= wh.getItemName();
            data[x][2]= wh.getEndingStock();
            ++x;
        }
        stockTable.setModel(new DefaultTableModel(data,headerStock));
        
        Date date = new Date();
        DateFormat writeFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateStockLabel.setText("Date: "+writeFormat.format(date));
    }
    
    public boolean isNumeric(String s){
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JTable createPRTable;
    private javax.swing.JLabel dateStockLabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel masterStockLabel;
    private javax.swing.JDesktopPane panelPR;
    private javax.swing.JTable prTable;
    private javax.swing.JTextField prText;
    private org.jdesktop.swingx.JXDatePicker receDate;
    private javax.swing.JLabel receivingDateLabel;
    private org.jdesktop.swingx.JXDatePicker reqDate;
    private javax.swing.JLabel requestDateLabel;
    private javax.swing.JScrollPane scrollCreatePR;
    private javax.swing.JScrollPane scrollDashboard;
    private javax.swing.JScrollPane scrollStock;
    private javax.swing.JTable stockTable;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField userID;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables

}
