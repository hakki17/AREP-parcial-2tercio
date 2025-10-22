# AREP-parcial-2tercio

prototipo de sistema de microservicios con la conjetura de Collatz

## VIDEO FUNCIONALIDAD

Esta en la carpeta img o se puede ingresar a este link
https://www.youtube.com/watch?v=-uG59ogPZq8

## correrlo en ec2

- abrir aws
- iniciar las 3 máquinas (proxy, dos servicios)
- sudo yum install java-17-amazon-corretto-headless
- sudo yum install maven
- sudo yum install git
- clonar este repo en cada máquina (git clone https://github.com/hakki17/AREP-parcial-2tercio)
- AREP-parcial-2tercio

para ejecutar proxy
- cd proxy

para ejecutar service
- cd service

- mvn clean install
- mvn spring-boot:run
- abrir http://ec2-34-224-33-226.compute-1.amazonaws.com:8080/ en navegador

## estructura del parcial

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/tree.png)

## proceso

Se creó un proxy el cual hacía una llamada a la función de la conjetura de Collatz, que se define como: 

si usted crea una secuencia de números, a partir de cualquier entero positivo, siguiendo las reglas descritas abajo, siempre la secuencia terminará en le número 1. Esta conjetura aún no se ha demostrado.

Para lo cual se hizo una clase ServiceController.java donde se encontraba el proceso de calculo de esa conjetura.
El browser llama al proxy, el cual hace las peticiones al service.

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/diagrama.png)

se crearon 3 instancias, una para el proxy y otras dos para el service y se creo una dinámica donde el proxy siempre llama al mismo service (server1) y en caso de que falle se redirige a el otro service (server2)

## pruebas despliegue

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/despliegue.png)

## pruebas locales

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalproxy.png)
![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalservice.png)
![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalIndex.png)

![]()












































