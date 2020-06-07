import javafx.scene.control.ComboBox;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.List;

public class MainEntry extends JFrame {
    private JTable table1 = new JTable();
    private JScrollPane tableJpane;
    private JComboBox comboBox1;
    private JTextField textField1;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    MainEntry() {
        setTitle("Manager");// db se


        //ui setup
        table1.setBackground(Color.BLACK);
        table1.setForeground(Color.BLACK);
        
        List <Flota> flote = DBAccess.getInstance().getFlote();


        
        table1.setRowHeight(30);
        table1 = new JTable(Flota.formatFlotaToObjTable(flote), Flota.getFlotaTableHeader());
        table1.setVisible(true);
        setSize(screenSize.width, screenSize.height);
        tableJpane = new JScrollPane(table1);

        table1.setFillsViewportHeight(true);
        comboBox1 = new JComboBox();
        setLayout(new BorderLayout());
        add(comboBox1,BorderLayout.NORTH);
        add(tableJpane, BorderLayout.CENTER);
        textField1 = new JTextField();
        add(textField1, BorderLayout.SOUTH);
        comboBox1.addItem("Vezi Flote");
        comboBox1.addItem("Vezi Dube");
        comboBox1.addItem("Vezi Autobuze");
        comboBox1.addItem("Vezi Iteme Incarcatura");
        comboBox1.addItem("Vezi Incarcaturi");
        //comboBox1.addItem("sort asc by group");
        //comboBox1.addItem("sort desc by group");
        this.setVisible(true);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //students = dbAccess.getAllStudentHavingGroup(textField1.getText());
                //System.out.print(textField1.getText());
                //table1.setModel(new DefaultTableModel(Student.formatStudentsToObjTable(students), Student.getStudentTableHeader()));
            }
        });
        comboBox1.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {

                if(comboBox1.getSelectedItem() == "Vezi Flote") {
                    System.out.print("Vezi Flote");
                    List <Flota> fleets  = DBAccess.getInstance().getFlote();
                    table1.setModel(new DefaultTableModel(Flota.formatFlotaToObjTable(fleets), Flota.getFlotaTableHeader()));
                } else if(comboBox1.getSelectedItem() == "Vezi Dube") {
                    List<Duba> dube = DBAccess.getInstance().getDube();
                    table1.setModel(new DefaultTableModel(Duba.formatDubaToTable(dube), Duba.getDubeHeader()));
                } else if(comboBox1.getSelectedItem() == "Vezi Autobuze") {
                    List <Autobuz> autobuze = DBAccess.getInstance().getAutobuze();
                    table1.setModel(new DefaultTableModel(Autobuz.formatAutobuzToTable(autobuze), Autobuz.getAutobuzeHeader()));
                }else if(comboBox1.getSelectedItem() == "Vezi Iteme Incarcatura") {
                    List <ItemIncarcatura> items = DBAccess.getInstance().getItemeIncarcatura();
                    table1.setModel(new DefaultTableModel(ItemIncarcatura.formatItemIncarcaturaToObjTable(items), ItemIncarcatura.getItemIncarcaturaTableHeader()));
                }else if(comboBox1.getSelectedItem() == "Vezi Incarcaturi") {
                    List<Incarcatura> loads = DBAccess.getInstance().getIncarcatura();
                    table1.setModel(new DefaultTableModel(Incarcatura.formatIncarcaturaToObjTable(loads), Flota.getFlotaTableHeader()));
                }
                //}
            }
        });
    }
}
