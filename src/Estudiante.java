class Estudiante {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        setNota(nota); // usamos el setter para validar
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("----------------------");
    }
}