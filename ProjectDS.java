//<editor-fold>

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.SingleSelectionModel;
import javax.swing.table.TableModel;
//</editor-fold>

public class ProjectDS extends javax.swing.JFrame {

    public DCLinkedList Lists = new DCLinkedList();
    public static Clip Clip;
    public static AudioInputStream AudioInput;
    public static File MusicPath;
    public static String Name;
    public DefaultListModel model = new DefaultListModel();

    public ProjectDS() {
        initComponents();
        setLocation(450, 200);
        setTitle("MP3Player");
        setSize(600, 370);
        setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoopCurrent = new javax.swing.JCheckBox();
        PLAY = new javax.swing.JButton();
        STOP = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        NEXT = new javax.swing.JButton();
        PREVIOUS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SongsList = new javax.swing.JList<>();
        RESET = new javax.swing.JButton();
        SKIP = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        LoopCurrent.setForeground(new java.awt.Color(255, 255, 255));
        LoopCurrent.setText("LoopCurr");
        LoopCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoopCurrentActionPerformed(evt);
            }
        });
        jPanel1.add(LoopCurrent);
        LoopCurrent.setBounds(0, 270, 130, 18);

        PLAY.setBackground(new java.awt.Color(0, 0, 0));
        PLAY.setForeground(new java.awt.Color(255, 255, 255));
        PLAY.setText("PLAY");
        PLAY.setToolTipText("");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });
        jPanel1.add(PLAY);
        PLAY.setBounds(490, 170, 90, 28);

        STOP.setBackground(new java.awt.Color(0, 0, 0));
        STOP.setForeground(new java.awt.Color(255, 255, 255));
        STOP.setText("STOP");
        STOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STOPActionPerformed(evt);
            }
        });
        jPanel1.add(STOP);
        STOP.setBounds(490, 200, 90, 28);

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(480, 10, 100, 30);

        NEXT.setBackground(new java.awt.Color(0, 0, 0));
        NEXT.setForeground(new java.awt.Color(255, 255, 255));
        NEXT.setText("NEXT");
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });
        jPanel1.add(NEXT);
        NEXT.setBounds(490, 140, 90, 28);

        PREVIOUS.setBackground(new java.awt.Color(0, 0, 0));
        PREVIOUS.setForeground(new java.awt.Color(255, 255, 255));
        PREVIOUS.setText("PREVIOUS");
        PREVIOUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUSActionPerformed(evt);
            }
        });
        jPanel1.add(PREVIOUS);
        PREVIOUS.setBounds(490, 230, 90, 28);

        SongsList.setBackground(new java.awt.Color(0, 0, 0));
        SongsList.setBorder(null);
        SongsList.setForeground(new java.awt.Color(255, 255, 255));
        SongsList.setFocusTraversalPolicyProvider(true);
        SongsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SongsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SongsList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 160, 270);

        RESET.setBackground(new java.awt.Color(0, 0, 0));
        RESET.setForeground(new java.awt.Color(255, 255, 255));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET);
        RESET.setBounds(490, 110, 90, 28);

        SKIP.setBackground(new java.awt.Color(0, 0, 0));
        SKIP.setForeground(new java.awt.Color(255, 255, 255));
        SKIP.setText("SKIP");
        SKIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKIPActionPerformed(evt);
            }
        });
        jPanel1.add(SKIP);
        SKIP.setBounds(490, 80, 90, 28);

        DELETE.setBackground(new java.awt.Color(0, 0, 0));
        DELETE.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(480, 40, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\marshmello-neon-musical-instrument-the-killers-wallpaper-preview.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-40, 0, 640, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void OpenSong() {
        try {
            MusicPath = new File(Lists.Head.SongName);
            if (MusicPath.exists()) {
                AudioInput = AudioSystem.getAudioInputStream(MusicPath);
                Clip = AudioSystem.getClip();
                Clip.open(AudioInput);
            } else {
                System.out.println("NotFound");
            }
        } catch (UnsupportedAudioFileException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex);

        } catch (LineUnavailableException ex) {
            Logger.getLogger(ProjectDS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        JFileChooser Choose = new JFileChooser();
        Choose.showOpenDialog(null);
        File f = Choose.getSelectedFile();
        Name = f.getAbsolutePath();
        model.addElement(f.getName());
        SongsList.setModel(model);
        Lists.InsertLast("MUSIC\\" + f.getName());
        OpenSong();
    }//GEN-LAST:event_AddActionPerformed

    private void LoopCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoopCurrentActionPerformed
        boolean isSelected = LoopCurrent.isSelected();
        if (isSelected) {
            Lists.Loop();
        } else {
            Clip.loop(0);
        }
    }//GEN-LAST:event_LoopCurrentActionPerformed

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        Lists.Play();
    }//GEN-LAST:event_PLAYActionPerformed

    private void STOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STOPActionPerformed
        Lists.Stop();
    }//GEN-LAST:event_STOPActionPerformed

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
        try {
            Clip.stop();
            Clip.close();
            Lists.Head = Lists.Head.GetNext();
            MusicPath = new File(String.valueOf(Lists.Head.GetSongName()));
            AudioInput = AudioSystem.getAudioInputStream(MusicPath);
            Clip = AudioSystem.getClip();
            Clip.open(AudioInput);
            Clip.start();

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(ProjectDS.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NEXTActionPerformed

    private void PREVIOUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUSActionPerformed
        try {
            Clip.stop();
            Clip.close();
            Lists.Head = Lists.Head.GetPrevious();
            MusicPath = new File(String.valueOf(Lists.Head.GetSongName()));
            AudioInput = AudioSystem.getAudioInputStream(MusicPath);
            Clip = AudioSystem.getClip();
            Clip.open(AudioInput);
            Clip.start();

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(ProjectDS.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PREVIOUSActionPerformed

    private void SongsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SongsListMouseClicked
        String Text = (String) model.getElementAt(SongsList.getSelectedIndex());
        while (true) {
            if (Lists.Head.GetSongName().equals("MUSIC\\" + Text)) {
                if (Clip.isOpen()) {
                    Clip.stop();
                    Clip.close();
                }
                OpenSong();
                Lists.Play();
                return;
            } else {
                Lists.Head = Lists.Head.GetNext();
            }
        }
    }//GEN-LAST:event_SongsListMouseClicked

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        Lists.Reset();
    }//GEN-LAST:event_RESETActionPerformed

    private void SKIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKIPActionPerformed
        try {
            Clip.stop();
            Clip.close();
            Lists.Head = Lists.Head.GetNext().GetNext();
            MusicPath = new File(String.valueOf(Lists.Head.GetSongName()));
            AudioInput = AudioSystem.getAudioInputStream(MusicPath);
            Clip = AudioSystem.getClip();
            Clip.open(AudioInput);
            Clip.start();

        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(ProjectDS.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SKIPActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        model.removeElementAt(SongsList.getSelectedIndex());
        Lists.Clear();
        model = (DefaultListModel) SongsList.getModel();
        for (int i = 0;; ++i) {
            if (model.getElementAt(i) != null) {
                Lists.InsertLast("MUSIC\\" + model.getElementAt(i));
            }
        }
    }//GEN-LAST:event_DELETEActionPerformed

    /*_Linked List_*/    //<editor-fold>
    static class Node {

        private String SongName;
        private Node Next;
        private Node Previous;

        public void SetSongName(String SongName) {
            this.SongName = SongName;
        }

        public String GetSongName() {
            return this.SongName;
        }

        public void SetNext(Node Next) {
            this.Next = Next;
        }

        public Node GetNext() {
            return this.Next;
        }

        public void SetPrevious(Node Previous) {
            this.Previous = Previous;
        }

        public Node GetPrevious() {
            return this.Previous;
        }

    }

    static class DCLinkedList {

        Node Head;
        Node Tail;

        void InsertFirst(String SongName) {
            if (this.Head == null) {
                this.Head = new Node();
                this.Head.SetSongName(SongName);
                this.Tail = this.Head;
            } else {
                Node NewNode = new Node();
                NewNode.SetSongName(SongName);
                NewNode.SetNext(this.Head);
                NewNode.SetPrevious(this.Tail);

                this.Head.SetPrevious(NewNode);
                this.Tail.SetNext(NewNode);
                this.Head = NewNode;
            }
        }

        void InsertLast(String NameSong) {
            if (this.Head == null) {
                this.Head = new Node();
                this.Head.SetSongName(NameSong);
                this.Tail = this.Head;
            } else {
                Node NewNode = new Node();
                NewNode.SetSongName(NameSong);
                NewNode.SetPrevious(this.Tail);
                NewNode.SetNext(this.Head);

                this.Head.SetPrevious(NewNode);
                this.Tail.SetNext(NewNode);
                this.Tail = NewNode;
            }
        }

        Node RemoveLast() {
            Node Temp = new Node();
            Temp = this.Tail;
            this.Tail = this.Head.Previous.Previous;
            this.Tail.Next = this.Head;
            this.Head.Previous = this.Tail;
            return Temp;
        }

        Node RemoveFirst() {
            Node Temp = new Node();
            Temp = this.Head;
            this.Head = this.Head.Next;
            this.Head.Previous = Temp.Previous;
            this.Tail.Next = this.Head;
            return Temp;
        }

        void Remove(String Value) {
            if (this.Head.GetNext() == this.Head) {
                return;
            }
            if (this.Head != null) {
                Node CurrNode = this.Head;
                Node PrevNode = this.Head;
                while (CurrNode != null) {
                    if (CurrNode.GetSongName().equals(Value)) {
                        PrevNode.SetNext(CurrNode.GetNext());
                        CurrNode.SetPrevious(CurrNode.GetPrevious().GetPrevious());
                        return;
                    } else {
                        PrevNode = CurrNode;
                        CurrNode = CurrNode.GetNext();
                    }
                }
            }
        }

        void Clear() {
            Head = Tail = null;
        }

        void PrintListF() {
            Node CurrentNode = this.Head;
            if (this.Head == null) {
                System.out.println("Double linked list is empty");
                return;
            }
            while (CurrentNode != null) {
                System.out.println(CurrentNode.GetSongName() + " ");
                if (CurrentNode.GetNext() == this.Head) {
                    CurrentNode = null;
                } else {
                    CurrentNode = CurrentNode.GetNext();
                }
            }
            System.out.println("");
        }

        void PrintListB() {
            Node CurrentNode = this.Tail;
            if (this.Tail == null) {
                System.out.println("Double linked list is empty");
                return;
            }
            while (CurrentNode != null) {
                System.out.println(CurrentNode.GetSongName() + " ");
                if (CurrentNode.GetPrevious() == this.Tail) {
                    CurrentNode = null;
                } else {
                    CurrentNode = CurrentNode.GetPrevious();
                }
            }
            System.out.println("");
        }

        void Play() {
            Clip.start();
        }

        void Stop() {
            Clip.stop();
        }

        void Loop() {
            Clip.loop(Clip.LOOP_CONTINUOUSLY);
        }

        void Reset() {
            Clip.setMicrosecondPosition(0);
        }
    }
//</editor-fold>

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="comment">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        //</editor-fold>
        /*CreateForm.*/ java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProjectDS().setVisible(true);
            }
        });
        System.out.print("");

    }
//<editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton DELETE;
    private javax.swing.JCheckBox LoopCurrent;
    private javax.swing.JButton NEXT;
    private javax.swing.JButton PLAY;
    private javax.swing.JButton PREVIOUS;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SKIP;
    private javax.swing.JButton STOP;
    private javax.swing.JList<String> SongsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
//</editor-fold>
