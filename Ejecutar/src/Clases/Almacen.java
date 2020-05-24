package Clases;
import java.util.ArrayList;
public class Almacen {
    private ArrayList<Productos> listado;
    public Almacen() {
        this.listado = new ArrayList<>();
    }
    public void agregarProducto(int codigo,String nombre,Double precio,int stock,int cod_cat) {
        Productos c = new Productos(codigo,nombre, precio, stock, cod_cat);
        this.listado.add(c);
    }
    public String buscarProductos(String nombreBuscado) {
        String s = "";
        for (Productos c : this.listado) {
            if (c.getNombre().toUpperCase().contains(nombreBuscado.toUpperCase())) {
                s += "\nProducto: " + c.getNombre() + "\nPRECIO: " + c.getPrecio();
            }
        }
        return s;
    }
    public String obtenerListado() {
        String s = "";
        int idx = 1;
        for (Productos c : this.listado) {
            s += "\n (" + idx++ + ") " + c.getNombre() +"\nStock: "+c.getStock();
        }
        return s;
    }
    public String buscarProductos(int numero) {
        numero--;
        if (numero >= this.listado.size() || numero < 0) {
            return "Contacto no encontrado";
        }
        Productos c = this.listado.get(numero);
        return c.getNombre();
    }public void eliminarProductos(int numero) {
        numero--;
        if (numero >= this.listado.size() || numero < 0) 
            return;
        
        this.listado.remove(numero);
    }

}
