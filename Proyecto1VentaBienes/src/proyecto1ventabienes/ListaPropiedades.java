package proyecto1ventabienes;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaPropiedades extends JFrame {

    public Propiedad first;

    public ListaPropiedades() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(String nombre, int numero, int cantidad, double precio) {

        Propiedad newItem = new Propiedad(nombre, numero, cantidad, precio);
        newItem.next = first;
        first = newItem;
        //JOptionPane.showMessageDialog(null, "Item saved");
    }

    public Propiedad delete(int itNumber) {
        Propiedad current = first;
        Propiedad previous = first;

        while (current.numero != itNumber) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public Propiedad find(int itNumber) {
        Propiedad current = first; 
        while (current.numero != itNumber) {
            if (current.next == null) 
            {
                return null; 
            } else 
            {
                current = current.next;
            }
        }
        return current;
    }

    public void displayList() {
        
            /*Item current = first;
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setRowCount(0);
            while (current != null) {
                model.addRow(new Object[]{current.itemNumber, current.name, current.qty, current.price});
                current = current.next;
            }*/
    }

}
