void main() {
    sensor sensor1 = new sensor();
    sensor sensor2 = new sensor();

    sensor1.nombre = "Sensor_Temp_01";
    sensor1.tipo = "Temperatura";
    sensor1.lectura = 24.5;

    sensor2.nombre = "Sensor_Hum_01";
    sensor2.tipo = "Humedad";
    sensor2.lectura = 60.2;

    System.out.println("Información del Sensor 1");
    sensor1.mostrarInformacion();
    sensor1.mostrarLectura();

    System.out.println("\nInformación del Sensor 2");
    sensor2.mostrarInformacion();
    sensor2.mostrarLectura();

    System.out.println("\nModificando el Sensor 1");
    sensor1.actualizarLectura(26.8);

    sensor1.mostrarInformacion();
    System.out.println("");
    sensor2.mostrarInformacion();
}
