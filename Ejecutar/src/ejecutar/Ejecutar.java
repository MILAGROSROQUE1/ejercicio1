package ejecutar;
//748
import java.util.Scanner;
import Clases.Almacen;

public class Ejecutar {

    public static void menu() {

        System.out.println("************************************************" + "\n*     BIENVENIDO A BOTICAS ATENDEL      *\n"
                + "************************************************");
        System.out.println("----------INGRESE UNA OPCION----------");
        System.out.println("1-INGRESAR PRODUCTO");
        System.out.println("2-BUSCAR PRODUCTO POR NOMBRE");
        System.out.println("3-ELIMINAR PRODUCTO MAL INGRESADO");
        System.out.println("4-MOSTRAR PRODUCTOS EN STOCK");
        System.out.println("5-SALIR");

    }

    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        menu();
        opcion = sc.nextInt();
        //menu2();

        while (opcion != 5) {

            if (opcion == 1) {
                System.out.println("Ingrese el codigo: ");
                int codigo = sc.nextInt();
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio: ");
                Double precio = sc.nextDouble();
                System.out.println("Ingrese el stock: ");
                int stock = sc.nextInt();
                System.out.println("Ingrese el codigo de catalogo: ");
                int cod_cat = sc.nextInt();
                almacen.agregarProducto(codigo, nombre, precio, stock, cod_cat);
            }
            if (opcion == 2) {
                System.out.println("Ingrese nombre del producto: ");
                String nombre = sc.next();
                System.out.println(almacen.buscarProductos(nombre));
            }
            if (opcion == 3) {
                System.out.println(almacen.obtenerListado());
                System.out.println("Ingrese el producto a eliminar: ");
                int numero = sc.nextInt();
                String datos = (almacen.buscarProductos(numero));
                if (!datos.equals("Producto no encontrado")) {
                    System.out.println("Se dispone a eliminar a " + datos);
                    System.out.println("¿Esta seguro? [1]SI [0]NO");
                    int seguro = sc.nextInt();
                    if (seguro == 1) {
                        almacen.eliminarProductos(numero);
                        System.out.println("Producto Eliminado");
                    }
                } else {
                    System.out.println(datos);
                }
            }
            if (opcion == 4) {
                System.out.println(almacen.obtenerListado());
            } else {
                System.out.println("");
            }
            menu();
            opcion = sc.nextInt();
        }

    }
}
