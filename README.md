# SOLID-Learning-riwi

# Principios SOLID

Los principios **SOLID** son un conjunto de principios de diseño de software que nos ayudan a crear sistemas más mantenibles, escalables y fáciles de entender.

## 1. Principio de Responsabilidad Única (Single Responsibility Principle)

Este principio establece que una clase debe tener una única razón para cambiar, es decir, debe tener una sola responsabilidad. Esto promueve la cohesión y facilita la reutilización del código.

💡 Al seguir este principio, las clases tienden a ser más pequeñas y más enfocadas, lo que facilita su prueba y mantenimiento.

🔍 **Ejemplo**: En una aplicación de gestión de libros, podrías tener una clase `Book` que se encarga únicamente de las propiedades del libro (título, autor, etc.) y otra clase `BookPrinter` que se encarga de imprimir los detalles del libro.

## 2. Principio de Abierto/Cerrado (Open/Closed Principle)

Según este principio, las entidades de software deben estar abiertas para la extensión pero cerradas para la modificación. Esto se logra utilizando la herencia, la composición y el uso de interfaces.

💡 Este principio fomenta el uso de polimorfismo y patrones de diseño como el patrón Estrategia.

🔍 **Ejemplo**: Si tienes una clase `Shape` con un método `calculateArea()`, en lugar de modificar la clase `Shape` cada vez que agregas una nueva forma, puedes crear subclases como `Circle`, `Square`, etc., que implementan el método `calculateArea()`.

## 3. Principio de Sustitución de Liskov (Liskov Substitution Principle)

Este principio establece que los objetos de un programa deben ser reemplazables por instancias de sus subtipos sin alterar la corrección del programa. Asegura que una subclase pueda reemplazar a su superclase sin que el programa falle.

💡 Esto asegura que una subclase pueda reemplazar a su superclase sin que el programa falle.

🔍 Si tienes una clase base `Bird` con un método `fly()`, y una subclase `Penguin` que no puede volar, `Penguin` no debería heredar de `Bird` ya que violaría este principio.

## 4. Principio de Segregación de la Interfaz (Interface Segregation Principle)

Según este principio, los clientes no deben verse obligados a depender de interfaces que no utilizan. Es mejor tener varias interfaces específicas que los clientes puedan implementar según sus necesidades.

💡 Este principio ayuda a evitar interfaces infladas y asegura que las clases solo implementen lo que realmente necesitan.

🔍 En lugar de tener una interfaz `Worker` con métodos `work()`, `eat()`, y `sleep()`, podrías tener interfaces separadas como `Workable`, `Eatable`, y `Sleepable` que los clientes implementen según sus necesidades.

## 5. Principio de Inversión de Dependencias (Dependency Inversion Principle)

Este principio establece que los módulos de alto nivel no deben depender de módulos de bajo nivel, ambos deben depender de abstracciones. Además, las abstracciones no deben depender de detalles, sino al revés: los detalles deben depender de las abstracciones.

💡 Este principio promueve el desacoplamiento y facilita el cambio de implementaciones sin afectar los módulos de alto nivel.

🔍 En lugar de que una clase `ReportGenerator` dependa directamente de una clase `FileLogger`, podría depender de una interfaz `Logger`. Luego puedes tener implementaciones de `Logger` como `FileLogger` y `DatabaseLogger`.
