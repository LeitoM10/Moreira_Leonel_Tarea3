1. Crear una clase Estudiante con atributos privados:

nombre (String)
nota (double)

Aplicar encapsulamiento usando getters y setters.
Validar que la nota esté entre 0 y 10.

EXPLICACIÓN
En este ejercicio se usa encapsulamiento al hacer que la nota y el nombre sean privados, evitando que se modifiquen directamente. En lugar de eso, se usan métodos como setNota() para cambiar la nota, donde además se valida que esté entre 0 y 10. Esto hace que los datos sean más seguros y evita errores, ya que cualquier cambio pasa por un control. También se ve cómo el objeto puede reutilizarse y actualizar su información de forma ordenada.

2. Crear una clase Vehiculo con:

marca (String)
velocidad (int)

No permitir velocidades negativas.

EXPLICACIÓN
Aquí también se aplica encapsulamiento al hacer privada la velocidad, evitando valores incorrectos como negativos. Se usa un setter para validar los cambios y un método acelerar() para aumentar la velocidad de forma lógica, como pasaría en la vida real. Esto demuestra que no solo se protegen los datos, sino que también se controla cómo el objeto funciona, haciendo el programa más coherente y fácil de manejar.
