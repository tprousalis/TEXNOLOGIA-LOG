/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Kevin
 */
public class NewCase extends javax.swing.JPanel {

    /**
     * Creates new form AddLesson
     */
    public NewCase() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Δήλωση Κρούσματος");

        jCheckBox2.setText("Έχω διαβάσει τους όρους");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Δήλωση");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Α. Ενδεχόμενο κρούσμα:\nΑσθενής που πληροί τα κλινικά κριτήρια\nΒ. Πιθανό κρούσμα:\nΑσθενής που πληροί τα κλινικά κριτήρια και ένα επιδημιολογικό κριτήριο\nή\nΆτομο που πληροί τα απεικονιστικά διαγνωστικά κριτήρια\nΓ. Επιβεβαιωμένο κρούσμα:\nΆτομο που πληροί τα εργαστηριακά κριτήρια\n[1] Επιπρόσθετα λιγότερο ειδικά συμπτώματα περιλαμβάνουν: κεφαλαλγία, φρίκια,\nμυαλγίες, καταβολή, έμετο και διάρροια.\n[2] Η ταχεία δοκιμασία αντιγόνου θα πρέπει να πραγματοποιείται εντός 5 ημερών\nαπό την έναρξη των συμπτωμάτων ή εντός 7 ημερών από το χρόνο έκθεσης. Αν ο\nχρόνος έκθεσης είναι άγνωστος, η ταχεία δοκιμασία αντιγόνου θα πρέπει να\nπραγματοποιείται το συντομότερο δυνατό.\nΓια περισσότερες οδηγίες σχετικά με τις περιπτώσεις στις οποίες οι ταχείες\nδοκιμασίες ελέγχου θα πρέπει να χρησιμοποιούνται και για περισσότερες \n5\nλεπτομέρειες σχετικά με την επιβεβαίωση των αποτελεσμάτων των ταχέων\nδοκιμασιών αντιγόνου μεταξύ ασυμπτωματικών ατόμων, παρακαλούμε όπως\nανατρέξετε στο τεχνικές οδηγίες ταχείας δοκιμασίας αντιγόνου του Ευρωπαϊκού\nΚέντρου και Πρόληψης και Ελέγχου Νοσημάτων [3], όπως και στο σχετικό\nνομοθετικό πλαίσιο του Υπουργείου Υγείας [4].\nΩς «επαφή» κρούσματος λοίμωξης COVID-19 ορίζεται άτομο που είχε ιστορικό\nεπαφής με κρούσμα COVID-19 εντός χρονικού διαστήματος που κυμαίνεται από 48\nώρες πριν την έναρξη συμπτωμάτων του κρούσματος έως και 10 ημέρες μετά την\nέναρξη των συμπτωμάτων (Εξετάστε το ενδεχόμενο παράτασης σε 20 ημέρες εάν το\nκρούσμα έχει σοβαρά συμπτώματα ή είναι ανοσοκατεσταλμένο).\nΑν το κρούσμα COVID-19 δεν είχε συμπτώματα κατά τη διάγνωσή του, ως «επαφή»\nκρούσματος ορίζεται άτομο που είχε επαφή με το κρούσμα εντός χρονικού\nδιαστήματος που κυμαίνεται από 48 ώρες πριν να ληφθεί το δείγμα το οποίο\nοδήγησε στην επιβεβαίωση του κρούσματος έως και 10 ημέρες μετά τη λήψη του\nδείγματος. Ο σχετιζόμενος με την έκθεση κίνδυνος λοίμωξης εξαρτάται από το\nεπίπεδο έκθεσης, ο οποίος, με τη σειρά του, καθορίζει και την περαιτέρω διαχείριση\nτων «επαφών» του κρούσματος.\n");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
