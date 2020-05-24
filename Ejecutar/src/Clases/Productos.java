package Clases;
public class Productos {
    private int codigo;
    private String nombre;
    private Double precio;
    private int stock;
    private int cod_cat;

   public Productos(int codigo,String nombre,Double precio,int stock,int cod_cat){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
        this.cod_cat=cod_cat;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(int cod_cat) {
        this.cod_cat = cod_cat;
    }
   
}
