class Vehiculo {

    private String marca;
    private int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        setVelocidad(velocidad);
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Velocidad inválida");
        }
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}