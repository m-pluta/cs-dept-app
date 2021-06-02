/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.application;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

/**
 *
 * @author Michal
 */
public class CourseFrame extends javax.swing.JFrame {

    MsgDialog msgDlg = new MsgDialog(new javax.swing.JFrame(), true);

    /**
     * Creates new form CourseFrame
     */
    public CourseFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        updateFaculties();
        cbQuery.addItem("Runtime Object Method");
        cbQuery.addItem("Java execute() Method");
    }

    private void updateFaculties() {
        cbFaculty.removeAllItems();

        String query = "SELECT faculty_name from Faculty";
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = LoginFrame.conn.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                cbFaculty.addItem(rs.getString(1));
            }

        } catch (SQLException ex) {
            msgDlg.setMessage("SQLException " + ex.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFaculty = new javax.swing.JPanel();
        lblFacultyName = new javax.swing.JLabel();
        lblQueryMethod = new javax.swing.JLabel();
        cbFaculty = new javax.swing.JComboBox<>();
        cbQuery = new javax.swing.JComboBox<>();
        pCourse = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsCourses = new javax.swing.JList<>();
        pCourseDetails = new javax.swing.JPanel();
        lblCourse = new javax.swing.JLabel();
        lblSchedule = new javax.swing.JLabel();
        lblClassroom = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        lblEnrolment = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CourseFrame");

        pFaculty.setBorder(javax.swing.BorderFactory.createTitledBorder("Faculty Name & Query Method"));

        lblFacultyName.setText("Faculty Name:");

        lblQueryMethod.setText("Query Method");

        javax.swing.GroupLayout pFacultyLayout = new javax.swing.GroupLayout(pFaculty);
        pFaculty.setLayout(pFacultyLayout);
        pFacultyLayout.setHorizontalGroup(
            pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFacultyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQueryMethod)
                    .addComponent(lblFacultyName))
                .addGap(18, 18, 18)
                .addGroup(pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFaculty, 0, 246, Short.MAX_VALUE)
                    .addComponent(cbQuery, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        pFacultyLayout.setVerticalGroup(
            pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFacultyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultyName)
                    .addComponent(cbFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueryMethod)
                    .addComponent(cbQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCourse.setBorder(javax.swing.BorderFactory.createTitledBorder("Course ID List"));
        pCourse.setToolTipText("");

        jScrollPane1.setViewportView(lsCourses);

        javax.swing.GroupLayout pCourseLayout = new javax.swing.GroupLayout(pCourse);
        pCourse.setLayout(pCourseLayout);
        pCourseLayout.setHorizontalGroup(
            pCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCourseLayout.setVerticalGroup(
            pCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCourseLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pCourseDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Information"));

        lblCourse.setText("Course:");

        lblSchedule.setText("Schedule:");

        lblClassroom.setText("Classroom:");

        lblCredits.setText("Credits:");

        lblEnrolment.setText("Enrolment:");

        javax.swing.GroupLayout pCourseDetailsLayout = new javax.swing.GroupLayout(pCourseDetails);
        pCourseDetails.setLayout(pCourseDetailsLayout);
        pCourseDetailsLayout.setHorizontalGroup(
            pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCourseDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEnrolment)
                    .addGroup(pCourseDetailsLayout.createSequentialGroup()
                        .addComponent(lblSchedule)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCourseDetailsLayout.createSequentialGroup()
                        .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClassroom)
                            .addComponent(lblCredits))
                        .addGap(18, 18, 18)
                        .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)))
                    .addGroup(pCourseDetailsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCourse)
                        .addGap(33, 33, 33)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCourseDetailsLayout.setVerticalGroup(
            pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCourseDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourse)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSchedule)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClassroom)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredits)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCourseDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnrolment)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addComponent(pFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(pCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed

        String faculty_email = fetchFacultyEmail();
        System.out.println(faculty_email);

        DefaultListModel model = new DefaultListModel();
        lsCourses.setModel(model);

        String query = "SELECT faculty, course_id, course_name, schedule, classroom, credits, enrolment " + "FROM Courses WHERE faculty = ?";
        if (cbQuery.getSelectedItem() == "Runtime Object Method") {
            try {
                DatabaseMetaData dbmd = LoginFrame.conn.getMetaData();
                String drName = dbmd.getDriverName();
                String drVersion = dbmd.getDriverVersion();
                msgDlg.setMessage("DriverName is: " + drName + ", Version is: " + drVersion);
                msgDlg.setVisible(true);

                PreparedStatement pstmt = LoginFrame.conn.prepareStatement(query);
                pstmt.setString(1, faculty_email);
                ResultSet rs = pstmt.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
                msgDlg.setMessage("Faculty Table has " + rsmd.getColumnCount() + " Columns");
                msgDlg.setVisible(true);

                while (rs.next()) {
                    model.addElement(rs.getString(2));
                }

            } catch (SQLException e) {
                msgDlg.setMessage("Error in statement! " + e.getMessage());
                msgDlg.setVisible(true);
            }

        } else if (cbQuery.getSelectedItem() == "Java execute() Method") {
            try {
                PreparedStatement pstmt = LoginFrame.conn.prepareStatement(query);
                pstmt.setString(1, faculty_email);

                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    model.addElement(rs.getString(2));
                }
            } catch (SQLException e) {
                msgDlg.setMessage("Error in statement! " + e.getMessage());
                msgDlg.setVisible(true);

            }

        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private String fetchFacultyEmail() {
        String out = "";
        String query = "SELECT email " + "FROM Faculty WHERE faculty_name = ?";
        System.out.println(query);

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = LoginFrame.conn.prepareStatement(query);
            pstmt.setString(1, (String) cbFaculty.getSelectedItem());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                out += rs.getString(1);
                break;
            }
        } catch (SQLException ex) {
            msgDlg.setMessage("Error in statement! " + ex.getMessage());
            msgDlg.setVisible(true);
        }

        return out;
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
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cbFaculty;
    private javax.swing.JComboBox<String> cbQuery;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblClassroom;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblEnrolment;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblQueryMethod;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JList<String> lsCourses;
    private javax.swing.JPanel pCourse;
    private javax.swing.JPanel pCourseDetails;
    private javax.swing.JPanel pFaculty;
    private javax.swing.JTextField txtCourse;
    // End of variables declaration//GEN-END:variables
}
