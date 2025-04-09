# Diseño de Patrones de Diseño en Java

Este proyecto contiene tres patrones de diseño implementados en Java: **Builder**, **Observer** y **Callback**. A continuación, se describe brevemente el propósito de cada uno de ellos y cómo ejecutarlos.

## Patrones Implementados

### 1. **Builder Pattern** - **Configurador de Pizza**
El patrón **Builder** se utiliza para construir un objeto complejo paso a paso. En este caso, se crea una `Pizza` configurada con diferentes atributos como tipo, tamaño, masa y toppings. El `PizzaConfiguratorBuilder` permite ir añadiendo estos atributos y, finalmente, construir la pizza.

**Clases principales**:
- `Pizza`: Representa una pizza con sus atributos (tipo, tamaño, masa, toppings).
- `PizzaBuilder`: Interfaz que define los métodos para configurar la pizza.
- `PizzaConfiguratorBuilder`: Implementación del builder que construye la pizza paso a paso.
- `Main`: Clase de ejecución que utiliza el builder para crear una pizza.

### 2. **Observer Pattern** - **Agentes de Bolsa y Agencias**
El patrón **Observer** se emplea para crear un sistema en el que un objeto (el **Observable**, en este caso la Bolsa) notifica a varios objetos interesados (los **Observers**, en este caso las agencias de bolsa) cuando ocurre un cambio en el estado. Cuando la Bolsa cambia su estado (sube o baja), todas las agencias suscritas reciben una notificación.

**Clases principales**:
- `StockExchange`: Representa la Bolsa (observable) que notifica a las agencias de bolsa.
- `StockBrokerAgency`: Representa una agencia de bolsa (observer) que recibe actualizaciones del mercado.
- `Observable`: Interfaz que define los métodos para suscribir y notificar a los observadores.
- `Observer`: Interfaz que define el método que los observadores deben implementar para recibir actualizaciones.

### 3. **Callback Pattern** - **Pasarela de Pago en Tienda de Zapatos**
El patrón **Callback** se utiliza para delegar el proceso de pago a diferentes métodos de pago, como tarjeta de crédito, PayPal y transferencia bancaria. La tienda de zapatos no sabe cómo se realiza el pago, solo invoca el método `pay()` proporcionado por la pasarela de pago. Cada clase de pago tiene su propia implementación del método `pay()`, y el control se devuelve a la tienda después de que se haya completado el proceso de pago.

**Clases principales**:
- `ShoeStore`: Representa la tienda de zapatos donde se agregan productos y se realiza el pago.
- `PaymentMethodCallback`: Interfaz que define el método `pay()` que debe ser implementado por cada clase de pago.
- `PaymentGateway`: Clase que procesa el pago utilizando el método proporcionado por el `PaymentMethodCallback`.
- `CreditCardPayment`, `PaypalPayment`, `BankAccountPayment`: Clases que implementan el método `pay()` para diferentes métodos de pago.

## Ejecución del Proyecto

### Requisitos
- **Java 8** o superior.
- Un IDE o la terminal para compilar y ejecutar el código.

### Instrucciones de Ejecución

1. **Clonar el repositorio**:
  git clone [https://github.com/sserranom/S302-PATTERNS.git]



