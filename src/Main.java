
void main() {

    //Ejercicio 1
    Libro libro=new Libro( "La bella y la bestia", "Gabrielle-Suzanne", 1740);
    libro.mostrarInformacion();

    Libro libro2=new Libro( "Biblia RVR 1960", "", 1960);
    libro2.mostrarInformacion();

    //Ejercicio 2

    Producto p1 = new Producto("Laptop", 1200.50, 3);

    Producto p2 = new Producto();

    Producto p3 = new Producto(true);

    p1.mostrar();
    p2.mostrar();
    p3.mostrar();

    //Ejercicio 3

    CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0);

    cuenta1.mostrarInformacion();

    cuenta1.depositar(50.0);
    cuenta1.mostrarInformacion();

    cuenta1.retirar(30.0);
    cuenta1.mostrarInformacion();

    //Ejercicio 4

        Estudiante e1 = new Estudiante("Leonel", 9.5);
        e1.mostrar();

        e1.setNota(11); 
        e1.setNota(8.0); 
        e1.mostrar();

    //Ejercicio 5

    Vehiculo v1 = new Vehiculo("Toyota", 60);
        v1.mostrar();

        v1.acelerar(20);
        v1.mostrar();

        v1.setVelocidad(-10); 

}
