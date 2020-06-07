import com.sun.org.apache.bcel.internal.generic.ObjectType;

import javax.swing.*;
import java.awt.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
enum ObjectsTypes {
    Dube, Autobuze, Incarcatura, ItemIncarcatura, Flota
}
public class AddObjectForm extends JPanel {
    private JButton confirmButton;
    private JPanel panel1;
    private Map<String, JTextField> textFields = new HashMap<String, JTextField>();
    AddObjectForm(ObjectsTypes objectType) {
        confirmButton = new JButton("confirm");
        this.add(confirmButton, BorderLayout.SOUTH);
        JPanel listPane = new JPanel();
        BoxLayout textFieldsLayout = new BoxLayout(listPane, BoxLayout.Y_AXIS);
        listPane.setLayout(textFieldsLayout);
        switch (objectType) {
            case Dube: initForDube(listPane);
        }

        this.setVisible(true);
    }
    private void initForDube(JPanel pannelToAdd) {
        textFields.put("capacitate", new JTextField());
        textFields.put("model", new JTextField());
        textFields.put("anFab", new JTextField());
        textFields.put("isLoaded", new JTextField());
        for(Map.Entry<String, JTextField> entry : textFields.entrySet()) {
          pannelToAdd.add(entry.getValue());
        }
    }
}
