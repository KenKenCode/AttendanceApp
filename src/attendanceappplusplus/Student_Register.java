package attendanceappplusplus;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import java.net.InetAddress;
import javax.swing.*;
import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Student_Register extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Student_Register() {
        initComponents(); //initComponents() must be in the first to avoid NullPointerException
        Data();
        MarkedSectionsTable();
        ChoosingASection();
        DataAdminAccountFrameNoteTaking();
        CurrentDate();
        selectingFromCalendar();

        this.setLocationRelativeTo(null);
    }

    public void CurrentDate() {
        //For displaying the date
        Calendar dateandtimeone = new GregorianCalendar();
        int month = dateandtimeone.get(Calendar.MONTH);
        int year = dateandtimeone.get(Calendar.YEAR);
        int day = dateandtimeone.get(Calendar.DAY_OF_MONTH);

        MenuCurrentDate.setText((month + 1) + "/" + day + "/" + year);

        /*
        int second = dateandtimeone.get(Calendar.SECOND);
        int minute = dateandtimeone.get(Calendar.MINUTE);
        int hour = dateandtimeone.get(Calendar.HOUR);
        
        MenuCurrentTime.setText(hour + ":" + minute + ":" + second);
         */
    }

    //For highlighting the found word in the JTextArea
    class HighlightFind extends DefaultHighlighter.DefaultHighlightPainter {

        public HighlightFind(Color c) {
            super(c);

        }

    }
    //Set color highlight to the word that is found
    Highlighter.HighlightPainter highlightpaintfind = new HighlightFind(Color.yellow);

    //Fore removing the highlight:
    public void removeTheHighlight(JTextComponent componentToRemoveHighlight) {
        Highlighter highlightremoval = componentToRemoveHighlight.getHighlighter();
        Highlighter.Highlight[] highlightremovaltwo = highlightremoval.getHighlights();

        for (int i = 0; i < highlightremovaltwo.length; i++) {
            if (highlightremovaltwo[i].getPainter() instanceof HighlightFind) {
                highlightremoval.removeHighlight(highlightremovaltwo[i]);
            }
        }

    }

    public void highlight(JTextComponent textComponent, String patternlight) {

        removeTheHighlight(textComponent);
        try {

            Highlighter lighttheword = textComponent.getHighlighter();
            Document documentlight = textComponent.getDocument();
            String textlight = documentlight.getText(0, documentlight.getLength());
            int pos = 0;

            while ((pos = textlight.toUpperCase().indexOf(patternlight.toUpperCase(), pos)) >= 0) {
                lighttheword.addHighlight(pos, pos + patternlight.length(), highlightpaintfind);

                pos += patternlight.length();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while finding the word");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        numberLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        USNLabel = new javax.swing.JLabel();
        No_txt = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        Clear = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTB = new javax.swing.JTable();
        USN_txt = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        ChooseASectionBox = new javax.swing.JComboBox<>();
        sectionsLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        StatusBox = new javax.swing.JComboBox<>();
        thirdSearchButton = new javax.swing.JButton();
        secondSearchButton = new javax.swing.JButton();
        firstSearchButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        NotesForThisSection = new javax.swing.JTextArea();
        noteTitleLabel = new javax.swing.JLabel();
        Student_RegisterTitleNoteText = new javax.swing.JTextField();
        addContentsInNoteStudentRegister = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableForNoteRecordsStudentRegister = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        markedRecordsTableLists = new javax.swing.JTable();
        markedRecordsLabel = new javax.swing.JLabel();
        FindWordStudent_RegisterText = new javax.swing.JTextField();
        findwordLabel = new javax.swing.JLabel();
        findWordsInNoteStudentRegister = new javax.swing.JButton();
        updateNotesInNoteStudentRegister = new javax.swing.JButton();
        deleteNotesInNoteStudentRegister = new javax.swing.JButton();
        sectionLabel = new javax.swing.JLabel();
        SectionField = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        updateARecordInmarkedRecordsTableLists = new javax.swing.JButton();
        deleteARecordInmarkedRecordsTableLists = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        statusFinderComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chooseFromCalendarBox = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        readOnlyCheckBox = new javax.swing.JCheckBoxMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        dayViewMenuItem = new javax.swing.JMenuItem();
        nightViewMenuItem = new javax.swing.JMenuItem();
        defaultViewMenuItem = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        MenuCurrentDate = new javax.swing.JMenu();

        jMenuItem10.setText("jMenuItem10");
        jPopupMenu1.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem11");
        jPopupMenu1.add(jMenuItem11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setToolTipText("");

        numberLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberLabel.setText("No");

        firstNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");

        USNLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        USNLabel.setForeground(new java.awt.Color(255, 255, 255));
        USNLabel.setText("USN");

        No_txt.setEditable(false);
        No_txt.setText("AUTO_INCREMENT");
        No_txt.setToolTipText("No is on PRIMARY KEY and AUTOINCREMENTED");
        No_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_txtMouseClicked(evt);
            }
        });
        No_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_txtActionPerformed(evt);
            }
        });
        No_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                No_txtKeyTyped(evt);
            }
        });

        fname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                fnameCaretUpdate(evt);
            }
        });
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });

        Clear.setActionCommand("Clear");
        Clear.setBackground(new java.awt.Color(204, 0, 255));
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Clear.setLabel("Back");
        Clear.setName("Clear"); // NOI18N
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        myTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Section", "No", "First Name", "Last Name", "USN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myTB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myTB.setEditingColumn(0);
        myTB.setEditingRow(0);
        myTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTBMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myTBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                myTBMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(myTB);
        if (myTB.getColumnModel().getColumnCount() > 0) {
            myTB.getColumnModel().getColumn(0).setResizable(false);
            myTB.getColumnModel().getColumn(1).setResizable(false);
            myTB.getColumnModel().getColumn(2).setResizable(false);
            myTB.getColumnModel().getColumn(3).setResizable(false);
            myTB.getColumnModel().getColumn(4).setResizable(false);
        }

        USN_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USN_txtActionPerformed(evt);
            }
        });
        USN_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                USN_txtKeyTyped(evt);
            }
        });

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnameKeyTyped(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");

        ChooseASectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a section" }));
        ChooseASectionBox.setToolTipText("Select a section");
        ChooseASectionBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                ChooseASectionBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        ChooseASectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseASectionBoxActionPerformed(evt);
            }
        });

        sectionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionsLabel.setText("Sections");

        statusLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Status");

        StatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Present", "Late", "Excused", "Absent" }));
        StatusBox.setSelectedItem("Present, Late, Excused, Absent");
        StatusBox.setToolTipText("Attendance status of the student");
        StatusBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StatusBoxItemStateChanged(evt);
            }
        });
        StatusBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                StatusBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        StatusBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatusBoxMouseClicked(evt);
            }
        });
        StatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusBoxActionPerformed(evt);
            }
        });
        StatusBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StatusBoxKeyPressed(evt);
            }
        });

        thirdSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendanceappplusplus/Search.png"))); // NOI18N
        thirdSearchButton.setText("Search");
        thirdSearchButton.setToolTipText("Search USN");
        thirdSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdSearchButtonActionPerformed(evt);
            }
        });

        secondSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendanceappplusplus/Search.png"))); // NOI18N
        secondSearchButton.setText("Search");
        secondSearchButton.setToolTipText("Search last name");
        secondSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondSearchButtonActionPerformed(evt);
            }
        });

        firstSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendanceappplusplus/Search.png"))); // NOI18N
        firstSearchButton.setText("Search");
        firstSearchButton.setToolTipText("Search first name");
        firstSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstSearchButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.setToolTipText("Refresh the record/table");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        NotesForThisSection.setColumns(20);
        NotesForThisSection.setLineWrap(true);
        NotesForThisSection.setRows(5);
        NotesForThisSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotesForThisSectionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(NotesForThisSection);

        noteTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteTitleLabel.setText("Title:");

        Student_RegisterTitleNoteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_RegisterTitleNoteTextActionPerformed(evt);
            }
        });

        addContentsInNoteStudentRegister.setText("Add note");
        addContentsInNoteStudentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContentsInNoteStudentRegisterActionPerformed(evt);
            }
        });

        tableForNoteRecordsStudentRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Notes"
            }
        ));
        tableForNoteRecordsStudentRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableForNoteRecordsStudentRegisterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableForNoteRecordsStudentRegisterMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tableForNoteRecordsStudentRegister);

        markedRecordsTableLists.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Section", "First Name", "Last Name", "USN", "Status", "Time"
            }
        ));
        markedRecordsTableLists.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markedRecordsTableListsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                markedRecordsTableListsMousePressed(evt);
            }
        });
        markedRecordsTableLists.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markedRecordsTableListsKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(markedRecordsTableLists);
        if (markedRecordsTableLists.getColumnModel().getColumnCount() > 0) {
            markedRecordsTableLists.getColumnModel().getColumn(0).setResizable(false);
            markedRecordsTableLists.getColumnModel().getColumn(1).setResizable(false);
            markedRecordsTableLists.getColumnModel().getColumn(2).setResizable(false);
            markedRecordsTableLists.getColumnModel().getColumn(3).setResizable(false);
            markedRecordsTableLists.getColumnModel().getColumn(4).setResizable(false);
            markedRecordsTableLists.getColumnModel().getColumn(5).setResizable(false);
        }

        markedRecordsLabel.setForeground(new java.awt.Color(255, 255, 255));
        markedRecordsLabel.setText("Marked  record(s)");

        findwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        findwordLabel.setText("Find");

        findWordsInNoteStudentRegister.setText("Find");
        findWordsInNoteStudentRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        findWordsInNoteStudentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findWordsInNoteStudentRegisterActionPerformed(evt);
            }
        });

        updateNotesInNoteStudentRegister.setText("Update note");
        updateNotesInNoteStudentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNotesInNoteStudentRegisterActionPerformed(evt);
            }
        });

        deleteNotesInNoteStudentRegister.setText("Delete note");
        deleteNotesInNoteStudentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNotesInNoteStudentRegisterActionPerformed(evt);
            }
        });

        sectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectionLabel.setText("Section");

        SectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionFieldActionPerformed(evt);
            }
        });

        jButton9.setText("Mark Record");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        updateARecordInmarkedRecordsTableLists.setBackground(new java.awt.Color(0, 255, 153));
        updateARecordInmarkedRecordsTableLists.setToolTipText("jButton2. This would automatically update to the main table"
        );
        updateARecordInmarkedRecordsTableLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateARecordInmarkedRecordsTableListsActionPerformed(evt);
            }
        });

        deleteARecordInmarkedRecordsTableLists.setBackground(new java.awt.Color(255, 153, 0));
        deleteARecordInmarkedRecordsTableLists.setToolTipText("Delete. This would automatically delete to the main table"
        );
        deleteARecordInmarkedRecordsTableLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteARecordInmarkedRecordsTableListsActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 153));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Find:");

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Status");

        statusFinderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Present", "Late", "Excused", "Absent" }));
        statusFinderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFinderComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calendar");

        chooseFromCalendarBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select from calendar" }));
        chooseFromCalendarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFromCalendarBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(USNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(USN_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(thirdSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(StatusBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(firstSearchButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(secondSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 93, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshButton))
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sectionLabel))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(No_txt)
                                    .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sectionsLabel)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChooseASectionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statusFinderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chooseFromCalendarBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(markedRecordsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(findwordLabel))
                                    .addComponent(noteTitleLabel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateARecordInmarkedRecordsTableLists)
                                    .addComponent(deleteARecordInmarkedRecordsTableLists))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateNotesInNoteStudentRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteNotesInNoteStudentRegister))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(FindWordStudent_RegisterText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(findWordsInNoteStudentRegister)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(addContentsInNoteStudentRegister))
                                .addComponent(Student_RegisterTitleNoteText, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(findwordLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Student_RegisterTitleNoteText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(noteTitleLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addContentsInNoteStudentRegister)
                                            .addComponent(FindWordStudent_RegisterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(findWordsInNoteStudentRegister))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(updateNotesInNoteStudentRegister)
                                            .addComponent(deleteNotesInNoteStudentRegister)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(markedRecordsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(updateARecordInmarkedRecordsTableLists)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteARecordInmarkedRecordsTableLists))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sectionsLabel)
                            .addComponent(ChooseASectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(statusFinderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(chooseFromCalendarBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberLabel)
                            .addComponent(No_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sectionLabel)
                            .addComponent(SectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameLabel)
                            .addComponent(firstSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(secondSearchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USN_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(USNLabel)
                                .addComponent(thirdSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu5.setText("File");
        jMenu5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu5ItemStateChanged(evt);
            }
        });

        readOnlyCheckBox.setSelected(true);
        readOnlyCheckBox.setText("Read-only");
        readOnlyCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                readOnlyCheckBoxItemStateChanged(evt);
            }
        });
        readOnlyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readOnlyCheckBoxActionPerformed(evt);
            }
        });
        jMenu5.add(readOnlyCheckBox);

        jMenuItem8.setText("Send to...");
        jMenuItem8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuItem8ItemStateChanged(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Language");

        jMenuItem9.setText("Filipino/Tagalog");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("View");

        jMenuItem4.setText("Word style");
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Full-screen");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Sticky-window");
        jMenu3.add(jMenuItem6);

        dayViewMenuItem.setText("Day view");
        dayViewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayViewMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(dayViewMenuItem);

        nightViewMenuItem.setText("Night View");
        nightViewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightViewMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(nightViewMenuItem);

        defaultViewMenuItem.setText("Default View");
        defaultViewMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultViewMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(defaultViewMenuItem);

        jMenuItem12.setText("Custom view");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Accessibility mode");
        jMenuItem13.setToolTipText("Helps you access Attendance++ with more ease but with reduced functions");
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Tools");

        jMenuItem1.setText("Calculator");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Screen capture this window");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Search...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("Charts, graphs (Pie charts, bar graphs, etc.)");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem14.setText("Attendance++ automatic planning (beta)");
        jMenuItem14.setToolTipText("Helps you plan for a quality of an attendance record/status");
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        helpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(helpMenu);

        MenuCurrentDate.setText("Current date");
        MenuCurrentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCurrentDateActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuCurrentDate);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USN_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_USN_txtKeyTyped
        // TODO add your handling code here:

        char cnumberonly = evt.getKeyChar();
        if (Character.isDigit(cnumberonly) || Character.isDigit(cnumberonly) || Character.isISOControl(cnumberonly)) {
            USN_txt.setEditable(true);

        } else {
            USN_txt.setEditable(false);
        }

    }//GEN-LAST:event_USN_txtKeyTyped

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        AdminAccountFrame f = new AdminAccountFrame();
        f.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ClearActionPerformed

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
        // TODO add your handling code here:
        char clettersonlyfirstname = evt.getKeyChar();
        if (Character.isLetter(clettersonlyfirstname) || Character.isWhitespace(clettersonlyfirstname) || Character.isISOControl(clettersonlyfirstname)) {
            fname.setEditable(true);
            jButton1.setBackground(Color.YELLOW);

        } else {
            fname.setEditable(false);
        }

    }//GEN-LAST:event_fnameKeyTyped

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fnameActionPerformed

    private void No_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_No_txtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isDigit(c) || Character.isISOControl(c)) {
            No_txt.setEditable(true);

        } else {
            No_txt.setEditable(false);
        }

    }//GEN-LAST:event_No_txtKeyTyped

    private void No_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_txtActionPerformed
        // TODO add your handling code here:

        try {
            String query = "UPDATE `database_rec` SET StudentName = ?, USN= ?, Status = ? WHERE No = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_No_txtActionPerformed

    private void No_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_No_txtMouseClicked

    private void myTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTBMouseClicked


    }//GEN-LAST:event_myTBMouseClicked

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyTyped
        // TODO add your handling code here:

        char cletteronly = evt.getKeyChar();
        if (Character.isAlphabetic(cletteronly) || Character.isWhitespace(cletteronly) || Character.isISOControl(cletteronly)) {
            lname.setEditable(true);
            
        } else {
            lname.setEditable(false);
        }
    }//GEN-LAST:event_lnameKeyTyped

    private void ChooseASectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseASectionBoxActionPerformed
        //Change the table data using JComboBox //Also change sections
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String querychangesection = "SELECT * FROM database_rec WHERE Section = " + "'" + ChooseASectionBox.getSelectedItem().toString() + "'";
            pst = con.prepareStatement(querychangesection);
            rs = pst.executeQuery(querychangesection);

            myTB.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "Changed section(s)!");
            //Adding ChooseASection() method results to combobox duplicating it's diplayed data in it's selecteditem

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        /* November 29, 2019, The following codes don't work as it is expected to be. Notes: *No syntax errors. 
        if (ChooseASectionBox.getSelectedItem().equals("Select a Section")) {
                Data();
            }
        */
    }//GEN-LAST:event_ChooseASectionBoxActionPerformed

    private void StatusBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StatusBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusBoxItemStateChanged

    private void StatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_StatusBoxActionPerformed

    private void StatusBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StatusBoxKeyPressed

        try {
            String query = "UPDATE `database_rec` SET `Status` = ?  WHERE `No` = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);

            String val = StatusBox.getSelectedItem().toString();
            pst.setString(2, No_txt.getText());
            pst.setString(1, val);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Inserted!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

        StatusUpdate();
    }//GEN-LAST:event_StatusBoxKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new CalculatorForAttendance().setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void firstSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstSearchButtonActionPerformed
        // TODO add your handling code here:

        try {
            String no = "SELECT * FROM `database_rec` WHERE `FirstName` LIKE '%" + fname.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        /* ******FOR EXPERIMENTING WITH USING ONLY ONE SEARCH BUTTON FOR THREE JTEXTFIELDS
        if (lname.getText().equals("") || USN_txt.getText().equals("")){ //for fname
        try {
            String no = "SELECT * FROM `database_rec` WHERE `FirstName` LIKE'" + fname.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        //lname, USN
        
        if (fname.getText().equals("") || USN_txt.getText().equals("")){ //for lname
        try {
            String no = "SELECT * FROM `database_rec` WHERE `LastName` LIKE'" + lname.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        //fname, USN
        
        if (fname.getText().equals("") || lname.getText().equals("")) { //for USN
            try {
            String no = "SELECT * FROM `database_rec` WHERE `USN` LIKE'" + USN_txt.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        
        //fname, lname
         */
    }//GEN-LAST:event_firstSearchButtonActionPerformed

    private void secondSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondSearchButtonActionPerformed
        // TODO add your handling code here:

        try {
            String no = "SELECT * FROM `database_rec` WHERE `LastName` LIKE '%" + lname.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_secondSearchButtonActionPerformed

    private void thirdSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdSearchButtonActionPerformed
        // TODO add your handling code here:

        try {
            String no = "SELECT * FROM `database_rec` WHERE `USN` LIKE '%" + USN_txt.getText() + "%' ";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(no);

            rs = pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_thirdSearchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        Data(); //Show the attendance data from the sql database
        
        ClearTextFields(); //For refreshing the data in the table(s)
        MarkedSectionsTable();
        //There is a problem wherein when a new section is added, it does not show up in the ChooseASectionBox's lists
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void USN_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USN_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USN_txtActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void MenuCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCurrentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCurrentDateActionPerformed

    private void NotesForThisSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotesForThisSectionMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_NotesForThisSectionMouseClicked

    private void tableForNoteRecordsStudentRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableForNoteRecordsStudentRegisterMouseClicked
        // TODO add your handling code here:
        
        int selectANoteRecord = tableForNoteRecordsStudentRegister.getSelectedRow();
        
        TableModel modelForNotes = tableForNoteRecordsStudentRegister.getModel();
        
        //Display selected rows into the JTextArea
        try {
            Student_RegisterTitleNoteText.setText(modelForNotes.getValueAt(selectANoteRecord, 0).toString()); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Field might be empty, try to create notes in that field \n Error code: " + e);
        }
        try {
            NotesForThisSection.setText(modelForNotes.getValueAt(selectANoteRecord, 1).toString()); //Must start at 0 for first column
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Field might be empty, try to create notes in that field \n Error code: " + e);
        }
    }//GEN-LAST:event_tableForNoteRecordsStudentRegisterMouseClicked

    private void nightViewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightViewMenuItemActionPerformed
        // TODO add your handling code here:
        try {
            jPanel1.setBackground(Color.black);
            sectionsLabel.setForeground(Color.white);
            numberLabel.setForeground(Color.white);
            firstNameLabel.setForeground(Color.white);
            lastNameLabel.setForeground(Color.white);
            USNLabel.setForeground(Color.white);
            statusLabel.setForeground(Color.white);
            markedRecordsLabel.setForeground(Color.white);
            noteTitleLabel.setForeground(Color.white);
            sectionLabel.setForeground(Color.white);
            findwordLabel.setForeground(Color.white);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured while changing the theme" + e);
        }
    }//GEN-LAST:event_nightViewMenuItemActionPerformed

    private void dayViewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayViewMenuItemActionPerformed
        // TODO add your handling code here:
        try {
            jPanel1.setBackground(Color.white);
            sectionsLabel.setForeground(Color.black);
            numberLabel.setForeground(Color.black);
            firstNameLabel.setForeground(Color.black);
            lastNameLabel.setForeground(Color.black);
            USNLabel.setForeground(Color.black);
            statusLabel.setForeground(Color.black);
            markedRecordsLabel.setForeground(Color.black);
            noteTitleLabel.setForeground(Color.black);
            sectionLabel.setForeground(Color.black);
            findwordLabel.setForeground(Color.black);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured while changing the theme" + e);
        }
    }//GEN-LAST:event_dayViewMenuItemActionPerformed

    private void defaultViewMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultViewMenuItemActionPerformed
        // TODO add your handling code here:
        Color defaultColorView = new Color(0, 102, 153);
        try {
            jPanel1.setBackground(defaultColorView);
            sectionsLabel.setForeground(Color.white);
            numberLabel.setForeground(Color.white);
            firstNameLabel.setForeground(Color.white);
            lastNameLabel.setForeground(Color.white);
            USNLabel.setForeground(Color.white);
            statusLabel.setForeground(Color.white);
            markedRecordsLabel.setForeground(Color.white);
            noteTitleLabel.setForeground(Color.white);
            sectionLabel.setForeground(Color.white);
            findwordLabel.setForeground(Color.white);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occured while changing the theme" + e);
        }

    }//GEN-LAST:event_defaultViewMenuItemActionPerformed

    private void readOnlyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readOnlyCheckBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_readOnlyCheckBoxActionPerformed

    private void myTBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTBMousePressed
        // TODO add your handling code here:

        if (SwingUtilities.isLeftMouseButton(evt)) {
            int i = myTB.getSelectedRow();

            TableModel model = myTB.getModel();
            
            // Display Slected Row In JTextextFields
            try {
                No_txt.setText(model.getValueAt(i, 0).toString()); //Must start at 0 for first column
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                fname.setText(model.getValueAt(i, 1).toString()); //First name is in the second column
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "First name field might be empty, please input the first name value for the first name\nError code: " + e);
            }

            try {
                lname.setText(model.getValueAt(i, 2).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Last name field might be empty, please input the last name value for the last name\nError code: " + e);
            }

            try {
                USN_txt.setText(model.getValueAt(i, 5).toString()); //USN is now in the fifth column
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "USN field might be empty, please input the USN value for the USN\nError code: " + e);
            }

            try {
                SectionField.setText(model.getValueAt(i, 6).toString()); //6 is the seventh column, always think that columns are equals to array implementation
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Section field might be empty, please input the Section value for the Section \nError code: " + e);
            }

        }
    }//GEN-LAST:event_myTBMousePressed

    private void findWordsInNoteStudentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findWordsInNoteStudentRegisterActionPerformed
        // TODO add your handling code here:
        try {
            if (FindWordStudent_RegisterText.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "The 'Find' text area is empty");
                return; //return is important in this code in order to prevent hanging from an unknown cause/big/error that isn't displayed by the IDE 
            }
            highlight(NotesForThisSection, FindWordStudent_RegisterText.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_findWordsInNoteStudentRegisterActionPerformed

    private void helpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpMenuActionPerformed
        // TODO add your handling code here:
        try {
            new ListOfHelp().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, printStackTrace(e));
        }
    }//GEN-LAST:event_helpMenuActionPerformed

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        try {
            new ListOfHelp().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_helpMenuMouseClicked

    private void markedRecordsTableListsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markedRecordsTableListsMouseClicked
        // TODO add your handling code here:
        int selectedMarkedRecords = markedRecordsTableLists.getSelectedRow();
        TableModel modeltwo = markedRecordsTableLists.getModel();


    }//GEN-LAST:event_markedRecordsTableListsMouseClicked

    private void ChooseASectionBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_ChooseASectionBoxPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseASectionBoxPopupMenuWillBecomeInvisible

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO markedrecords"
                    + "(FirstName, LastName, USN, Section, Status)"
                    + "VALUES (?, ?, ?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");

            pst = con.prepareStatement(query);

            pst.setString(1, fname.getText());
            pst.setString(2, lname.getText());
            pst.setString(3, USN_txt.getText());
            pst.setString(4, SectionField.getText());
            pst.setString(5, StatusBox.getSelectedItem().toString());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Marked!");
            Data();
            ClearTextFields();
            MarkedSectionsTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Duplicate entry \n Error:" + e);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void myTBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTBMouseReleased
        // TODO add your handling code here:

        if (evt.isPopupTrigger()) {
            int row = myTB.rowAtPoint(evt.getPoint());
            int[] selectedRows = myTB.getSelectedRows();
            if (!myTB.isRowSelected(1)) {
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_myTBMouseReleased

    private void SectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionFieldActionPerformed

    private void Student_RegisterTitleNoteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_RegisterTitleNoteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_RegisterTitleNoteTextActionPerformed

    private void StatusBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_StatusBoxPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusBoxPopupMenuWillBecomeVisible

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:

        try {
            String querytocountstatus = "SELECT COUNT(*) FROM database_rec WHERE Status = 'Status'";
            JDBCCategoryDataSet dataset = new JDBCCategoryDataSet(Student_Register.ConnectDB(), querytocountstatus);
            JFreeChart chartone = ChartFactory.createLineChart("Query chart", "Status", "Status", (CategoryDataset) dataset, PlotOrientation.VERTICAL, false, true, true);
            BarRenderer renderer = null;
            CategoryPlot plot = null;
            renderer = new BarRenderer();
            ChartFrame frame = new ChartFrame("Query Chart", chartone);
            frame.setVisible(true);
            frame.setSize(400, 650);
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void StatusBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusBoxMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_StatusBoxMouseClicked

    private void fnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_fnameCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameCaretUpdate

    private void markedRecordsTableListsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markedRecordsTableListsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_markedRecordsTableListsKeyTyped

    private void markedRecordsTableListsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markedRecordsTableListsMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_markedRecordsTableListsMousePressed

    private void updateARecordInmarkedRecordsTableListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateARecordInmarkedRecordsTableListsActionPerformed
        // TODO add your handling code here:
        try {
            int selectamarkedrecord = markedRecordsTableLists.getSelectedRow();
            TableModel modelforselectingmarkedrecords = markedRecordsTableLists.getModel();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String queryamarkedrecord = "UPDATE markedrecords SET FirstName = ?, LastName = ?, Status = ?, Time = ?, Section = ? ";
            pst = con.prepareStatement(queryamarkedrecord);

            pst.setString(1, modelforselectingmarkedrecords.getValueAt(selectamarkedrecord, 0).toString());
            pst.setString(2, modelforselectingmarkedrecords.getValueAt(selectamarkedrecord, 1).toString());
            pst.setString(3, modelforselectingmarkedrecords.getValueAt(selectamarkedrecord, 2).toString());
            pst.setString(4, modelforselectingmarkedrecords.getValueAt(selectamarkedrecord, 3).toString());
            pst.setString(5, modelforselectingmarkedrecords.getValueAt(selectamarkedrecord, 4).toString());

            pst.executeUpdate();
            MarkedSectionsTable();
            JOptionPane.showMessageDialog(null, "Updated!");
            ClearTextFields();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateARecordInmarkedRecordsTableListsActionPerformed

    private void deleteARecordInmarkedRecordsTableListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteARecordInmarkedRecordsTableListsActionPerformed
        // TODO add your handling code here:
        int selectamarkedrecorddeleteversion = markedRecordsTableLists.getSelectedRow();
        TableModel modelforselectingmarkedrecordsdeleteversion = markedRecordsTableLists.getModel();
        int confirmationtodeletemarkedrecord = JOptionPane.showConfirmDialog(null, "Are you sure to delete the record(s)?", "Notice", JOptionPane.YES_NO_OPTION);
        
        if (confirmationtodeletemarkedrecord == JOptionPane.YES_OPTION) {
            try {

                String querydeletemarkedrecord = "DELETE FROM `markedrecords` WHERE USN = ?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(querydeletemarkedrecord);
                pst.setString(1, markedRecordsTableLists.getValueAt(selectamarkedrecorddeleteversion, 4).toString());

                pst.executeUpdate();
                MarkedSectionsTable();
                JOptionPane.showMessageDialog(null, "Deleted!");
                ClearTextFields();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_deleteARecordInmarkedRecordsTableListsActionPerformed

    private void addContentsInNoteStudentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addContentsInNoteStudentRegisterActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String query = "INSERT INTO notetakingforadmin"
            + "(TitleOfNotes, Notes)"
            + "VALUES (?, ?)";
            

            pst = con.prepareStatement(query);
            pst.setString(1, Student_RegisterTitleNoteText.getText());
            pst.setString(2, NotesForThisSection.getText());
            
            pst.executeUpdate();
            DataAdminAccountFrameNoteTaking();
            JOptionPane.showMessageDialog(null, "Added!");
            

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "An error occurred" + ex);

        }

        
    }//GEN-LAST:event_addContentsInNoteStudentRegisterActionPerformed

    private void updateNotesInNoteStudentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNotesInNoteStudentRegisterActionPerformed
        // TODO add your handling code here:
        try {
            String query = "UPDATE notetakingforadmin SET Notes = ?, TitleOfNotes = ?"; //As of 01/11/2019 there is a problem in sql connection. Right syntax of UPDATE syntax might help, searcg the right syntax for UPDATE syntax for sql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Some error occurred\nThis the error code: " + e);
        }
    }//GEN-LAST:event_updateNotesInNoteStudentRegisterActionPerformed

    private void tableForNoteRecordsStudentRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableForNoteRecordsStudentRegisterMousePressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_tableForNoteRecordsStudentRegisterMousePressed

    private void deleteNotesInNoteStudentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNotesInNoteStudentRegisterActionPerformed
        // TODO add your handling code here:
        int recordsinnotes = tableForNoteRecordsStudentRegister.getSelectedRow();

            TableModel recordsinnotesmodel = tableForNoteRecordsStudentRegister.getModel();
        int confirmationtodeletenotes = JOptionPane.showConfirmDialog(null, "Are you sure to delete note(s)?", "Notice", JOptionPane.YES_NO_OPTION);
        if (confirmationtodeletenotes == JOptionPane.YES_OPTION) {
            try {
                /*
                To delete in sql
                DELETE FROM table_name WHERE some_column = some_value;
                */
            String query = "DELETE FROM notetakingforadmin WHERE TitleOfNotes = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);
            
            
            pst.setString(1, recordsinnotesmodel.getValueAt(recordsinnotes, 1).toString()); //TitleOfNotes row is on the second row (0 is firt ro, 1 is the second row
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted!");
            DataAdminAccountFrameNoteTaking();
            
            Student_RegisterTitleNoteText.setText("");
            NotesForThisSection.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Some error occurred\nThis the error code: " + e);
        }
        
        }
        
        
        
    }//GEN-LAST:event_deleteNotesInNoteStudentRegisterActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void readOnlyCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_readOnlyCheckBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
        new readOnlyUser().setVisible(false);
}
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            new readOnlyUser().setVisible(true);
        }

    }//GEN-LAST:event_readOnlyCheckBoxItemStateChanged

    private void jMenu5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ItemStateChanged

    private void jMenuItem8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ItemStateChanged

    private void statusFinderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFinderComboBoxActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String findstatus = "SELECT * FROM database_rec WHERE Status = " + "'" + statusFinderComboBox.getSelectedItem().toString() + "'" + "AND" + " Section = " + "'" + ChooseASectionBox.getSelectedItem().toString() + "'";
            pst = con.prepareStatement(findstatus);
            
            rs = pst.executeQuery(findstatus);
            
            myTB.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "Found!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_statusFinderComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String query = "UPDATE `database_rec` SET Section = ?, FirstName = ?, LastName = ?, USN = ?, Status = ? WHERE No = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            pst = con.prepareStatement(query);

            pst.setString(1, SectionField.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, lname.getText());
            pst.setString(4, USN_txt.getText());
            pst.setString(5, StatusBox.getSelectedItem().toString());
            pst.setString(6, No_txt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!");
            Data();
            
            ClearTextFields();
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        Data();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Add a function where the Insert button can know what account is currently in use
        //Ask the user what table is currently in use
        //Add a combo box and list there the lists of table that are available

        try {
            String query = "INSERT INTO database_rec"
                    + "(FirstName, LastName, USN, Section, Status)"
                    + "VALUES (?, ?, ?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");

            pst = con.prepareStatement(query);

            pst.setString(1, fname.getText());
            pst.setString(2, lname.getText());
            pst.setString(3, USN_txt.getText());
            pst.setString(4, SectionField.getText());
            pst.setString(5, StatusBox.getSelectedItem().toString());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Inserted!");
            Data();
            
            ClearTextFields();
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Duplicate entry \n Error:" + ex);

        }

        //Try to use a method wherein the getText method is mosty used for getting the data of the table
        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Data();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = myTB.getSelectedRow();

            TableModel model = myTB.getModel();
        int confirmationtodeleterecords = JOptionPane.showConfirmDialog(null, "Are you sure to delete this record(s)?", "Notice", JOptionPane.YES_NO_OPTION);
        if (confirmationtodeleterecords == JOptionPane.YES_OPTION) {
            try {
                String query = "DELETE FROM `database_rec` WHERE No = ?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
                pst = con.prepareStatement(query);

                pst.setString(1, model.getValueAt(i, 0).toString());

                JOptionPane.showMessageDialog(null, "Deleted!");
                pst.executeUpdate();
                //Clear the JTextFields after a successful record(s) removal
                No_txt.setText("");
                SectionField.setText("");
                fname.setText("");
                lname.setText("");
                USN_txt.setText("");
                Data();
                
            } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ClearTextFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        String searchFunctionality = JOptionPane.showInputDialog(null, "Search");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void chooseFromCalendarBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFromCalendarBoxActionPerformed
        // TODO add your handling code here:
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String findFromCalendar = "SELECT * FROM database_rec WHERE Time = " + "'" + chooseFromCalendarBox.getSelectedItem() + "'";
            pst = con.prepareStatement(findFromCalendar);
            rs = pst.executeQuery(findFromCalendar);
            myTB.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "Found!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_chooseFromCalendarBoxActionPerformed

    public void Data() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM database_rec"; //Select a table
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void StatusUpdate() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM `database_rec` WHERE `No` ='" + fname.getText() + "' ";

            pst = con.prepareStatement(sql);
            pst.executeQuery();
            myTB.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void ChoosingASection() {
        //For selecting sections combobox
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sqlchoosesection = "SELECT Section FROM database_rec ";

            pst = con.prepareStatement(sqlchoosesection);
            rs = pst.executeQuery();

            while (rs.next()) {
                String section = rs.getString("Section");
                ChooseASectionBox.addItem(section);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void MarkedSectionsTable() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sqlmarkedrecords = "SELECT * FROM markedrecords";
            pst = con.prepareStatement(sqlmarkedrecords);
            rs = pst.executeQuery(sqlmarkedrecords);
            markedRecordsTableLists.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //This code is for chart
    public static Connection ConnectDB() {
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
           
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return null;
    }

    //This code is for clearing the textfields after clicking a refresh-like button
    public void ClearTextFields() {
        No_txt.setText("");
        SectionField.setText("");
        fname.setText("");
        lname.setText("");
        USN_txt.setText("");
        Student_RegisterTitleNoteText.setText("");
        NotesForThisSection.setText("");
        FindWordStudent_RegisterText.setText("");
    }
    
    public void DataAdminAccountFrameNoteTaking() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
            String sql = "SELECT * FROM notetakingforadmin";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tableForNoteRecordsStudentRegister.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void selectingFromCalendar()  {
        try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendancedatabase?useTimezone=true&serverTimezone=UTC", "root", "");
        String findCalendarSelect = "SELECT Time FROM database_rec";
        pst = con.prepareStatement(findCalendarSelect);
        rs = pst.executeQuery(findCalendarSelect);
        while (rs.next()) {
                String time = rs.getString("Time");
                chooseFromCalendarBox.addItem(time);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

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
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseASectionBox;
    private java.awt.Button Clear;
    private javax.swing.JTextField FindWordStudent_RegisterText;
    private javax.swing.JMenu MenuCurrentDate;
    private javax.swing.JTextField No_txt;
    private javax.swing.JTextArea NotesForThisSection;
    private javax.swing.JTextField SectionField;
    private javax.swing.JComboBox<String> StatusBox;
    private javax.swing.JTextField Student_RegisterTitleNoteText;
    private javax.swing.JLabel USNLabel;
    private javax.swing.JTextField USN_txt;
    private javax.swing.JButton addContentsInNoteStudentRegister;
    private javax.swing.JComboBox<String> chooseFromCalendarBox;
    private javax.swing.JMenuItem dayViewMenuItem;
    private javax.swing.JMenuItem defaultViewMenuItem;
    private javax.swing.JButton deleteARecordInmarkedRecordsTableLists;
    private javax.swing.JButton deleteNotesInNoteStudentRegister;
    private javax.swing.JButton findWordsInNoteStudentRegister;
    private javax.swing.JLabel findwordLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton firstSearchButton;
    private javax.swing.JTextField fname;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel markedRecordsLabel;
    private javax.swing.JTable markedRecordsTableLists;
    private javax.swing.JTable myTB;
    private javax.swing.JMenuItem nightViewMenuItem;
    private javax.swing.JLabel noteTitleLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JCheckBoxMenuItem readOnlyCheckBox;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton secondSearchButton;
    private javax.swing.JLabel sectionLabel;
    private javax.swing.JLabel sectionsLabel;
    private javax.swing.JComboBox<String> statusFinderComboBox;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tableForNoteRecordsStudentRegister;
    private javax.swing.JButton thirdSearchButton;
    private javax.swing.JButton updateARecordInmarkedRecordsTableLists;
    private javax.swing.JButton updateNotesInNoteStudentRegister;
    // End of variables declaration//GEN-END:variables
}
