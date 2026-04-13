
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

}
