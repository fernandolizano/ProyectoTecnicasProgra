package proyecto1ventabienes;


public class Propiedad {

    public String nombre;
    public int numero;
    public int cantidad;
    public double precio;
    public Propiedad next;

    public Propiedad (String name, int itemNumber, int qty, double price) {

        this.nombre = name;
        this.numero = itemNumber;
        this.cantidad = qty;
        this.precio = price;
    }

    public void displayItem() {

        System.out.println(nombre + " " + numero + " " + cantidad + " " + precio);
        System.out.println();
    }

}
