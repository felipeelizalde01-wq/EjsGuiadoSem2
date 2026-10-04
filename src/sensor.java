public class sensor {
    public String nombre;
    String tipo;
    public double lectura;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura);
    }

    void mostrarLectura() {
        System.out.println("La lectura actual de " + nombre + " es: " + lectura);
    }

    //
    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
        //Como fue sensor1 quien ejecutó
        //Java traduce ese this a sensor1.

        System.out.println("Lectura de " + nombre + " actualizada a: " + lectura);

        //Se utiliza 'public' para que cualquier otra clase
        //pueda registrar y actualizar las variaciones.
    }
}