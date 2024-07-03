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



## Ejercicios
### 1. Ordenes
`
public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = items;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        // Lógica para calcular el total de la orden
        return 100.0; // simplificado
    }

    public void printOrder() {
        // Lógica para imprimir la orden
    }

    public void saveToDatabase() {
        // Lógica para guardar la orden en la base de datos
    }
}`

Refactoriza la clase Order para que cumpla con el Principio de Responsabilidad Única. Debes separar las responsabilidades de cálculo, impresión y almacenamiento en clases diferentes.

Pistas:

- La clase Order solo debe gestionar los datos de la orden.
-     Crea una nueva clase para manejar la impresión de la orden.
-     Crea una nueva clase para manejar el almacenamiento de la orden en la base de datos.

###2. Métodos de pago

Refactoriza el código para que cumpla con el Principio de Abierto/Cerrado. Debes permitir la extensión de nuevos métodos de pago sin modificar la clase PaymentProcessor.
`
 public class PaymentProcessor {


public class HumanWorker implements Worker {
    @Override
    public void work() {
        // Lógica para trabajar
    }

    @Override
    public void eat() {
        // Lógica para comer
    }
}

public class RobotWorker implements Worker {
    @Override
    public void work() {
        // Lógica para trabajar
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}`

#####Pistas

   - Crea una interfaz Workable para la funcionalidad de trabajo.
   -     Crea una interfaz Eatable para la funcionalidad de comer.
   -     Implementa estas interfaces en las clases correspondientes.

###4. Database

Refactoriza el código para que cumpla con el Principio de Inversión de Dependencias. Introduce una abstracción para la funcionalidad de almacenamiento de datos.
`
public class Database {
    public void save(String data) {
        // Lógica para guardar datos en la base de datos
    }
}

public class DataService {
    private Database database = new Database();

    public void saveData(String data) {
        database.save(data);
    }
}`

#####Pistas
  -   Crea una interfaz DataStorage con un método save.
  -     Implementa DataStorage en la clase Database.
  -     Modifica DataService para que dependa de DataStorage en lugar de Database.

###5. Employees

Refactoriza la clase Employee para que cumpla con el Principio de Responsabilidad Única. Debes separar las responsabilidades de cálculo, generación de reportes y almacenamiento en clases diferentes.
`
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculatePay() {
        // Lógica para calcular el salario
    }

    public void generateReport() {
        // Lógica para generar un reporte del empleado
    }

    public void saveToDatabase() {
        // Lógica para guardar el empleado en la base de datos
    }
}`

#####Pistas

  -  La clase Employee solo debe manejar los datos del empleado.
  -     Crea una nueva clase PayrollService para manejar el cálculo del salario.
  -     Crea una nueva clase EmployeeReport para manejar la generación del reporte.
  -     Crea una nueva clase EmployeeRepository para manejar el almacenamiento en la base de datos.

###6. TaxCalculator

Refactoriza el código para que cumpla con el Principio de Abierto/Cerrado. Debes permitir la extensión de nuevos cálculos de impuestos sin modificar la clase TaxCalculator.
`
public class TaxCalculator {
    public double calculateTax(String country) {
        if (country.equals("USA")) {
            // Lógica para calcular el impuesto en USA
            return 0.1;
        } else if (country.equals("UK")) {
            // Lógica para calcular el impuesto en UK
            return 0.2;
        }
        return 0;
    }
}`

##### Pistas

 -   Crea una interfaz TaxStrategy con un método calculateTax.
 -     Implementa esta interfaz en clases concretas para cada país (por ejemplo, USATaxStrategy y UKTaxStrategy).
 -     Modifica TaxCalculator para que use la interfaz TaxStrategy.

