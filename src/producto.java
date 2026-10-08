import java.sql.SQLOutput;

public class producto {
    public String nombre;
    public double precio;
    String categoria;

    public void mostrarInformacion() {
        System.out.println("Mostrando Información");

        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Categoría: "+ precio);

    }

    void mostrarCategoria() {
        System.out.println("Mostrando Categoría");
        System.out.println("La categoría del producto "+nombre+"Es "+categoria);
    }

    void mostrarPrecio(){
        System.out.println("Mostrando Precio");
        System.out.println("El precio del producto "+nombre+"Es "+precio);
    }
}



