import com.sun.org.apache.bcel.internal.generic.ObjectType;
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
    private JPanel bottom_pane;
    private JButton addButton;
    private JButton mapButton;
    private JButton deleteButton;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    MainEntry() {
        setTitle("Manager");// db se


        //ui setup
        table1.setBackground(Color.BLACK);
        table1.setForeground(Color.BLACK);
        
        List <Flota> flote = DBAccess.getInstance().getFlote();


        bottom_pane = new JPanel();
        bottom_pane.setLayout(new BorderLayout());
        addButton = new JButton("add");
        deleteButton = new JButton("delete");
        mapButton = new JButton("map");
        bottom_pane.add(deleteButton, BorderLayout.WEST);
        bottom_pane.add(addButton, BorderLayout.CENTER);
        bottom_pane.add(mapButton, BorderLayout.EAST);
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
        add(bottom_pane, BorderLayout.SOUTH);
        comboBox1.addItem("Vezi Flote");
        comboBox1.addItem("Vezi Dube");
        comboBox1.addItem("Vezi Autobuze");
        comboBox1.addItem("Vezi Iteme Incarcatura");
        comboBox1.addItem("Vezi Incarcaturi");
        //comboBox1.addItem("sort asc by group");
        //comboBox1.addItem("sort desc by group");
        this.setVisible(true);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            AddObjectForm addForm = new AddObjectForm(ObjectsTypes.Dube);
            addForm.setVisible(true);
            }
        });

        mapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
