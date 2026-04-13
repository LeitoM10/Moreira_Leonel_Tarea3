1. En una institución educativa se necesita desarrollar un sistema que gestione la información de los estudiantes, donde cada uno tiene un nombre y una nota entre 0 y 10. Para evitar errores, se debe aplicar encapsulamiento, impidiendo el acceso directo a los atributos y usando métodos para controlarlos. Se pide crear una clase Estudiante con métodos para consultar y modificar la nota de forma segura, y demostrar su uso desde una clase principal.
Aplicar encapsulamiento usando getters y setters.
Validar que la nota esté entre 0 y 10.

EXPLICACIÓN
En este ejercicio se usa encapsulamiento al hacer que la nota y el nombre sean privados, evitando que se modifiquen directamente. En lugar de eso, se usan métodos como setNota() para cambiar la nota, donde además se valida que esté entre 0 y 10. Esto hace que los datos sean más seguros y evita errores, ya que cualquier cambio pasa por un control. También se ve cómo el objeto puede reutilizarse y actualizar su información de forma ordenada.

2. Se desea crear un programa que simule un vehículo con atributos como marca y velocidad, asegurando que esta no sea negativa. Para ello, se debe aplicar encapsulamiento, controlando el acceso a los datos mediante métodos. Se pide crear una clase Vehiculo con métodos para modificar y consultar la velocidad, además de simular acciones como acelerar, y demostrar su funcionamiento en una clase principal.

EXPLICACIÓN
Aquí también se aplica encapsulamiento al hacer privada la velocidad, evitando valores incorrectos como negativos. Se usa un setter para validar los cambios y un método acelerar() para aumentar la velocidad de forma lógica, como pasaría en la vida real. Esto demuestra que no solo se protegen los datos, sino que también se controla cómo el objeto funciona, haciendo el programa más coherente y fácil de manejar.
