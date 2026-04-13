class Producto {
    String nombre;
    double precio;
    int cantidad;

    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    Producto() {
        this.nombre = "Producto genérico";
        this.precio = 10.0;
        this.cantidad = 5;
    }

    // Constructor vacío
    Producto(boolean vacio) {
        // No hace nada
    }

    void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("----------------------");
    }
}
