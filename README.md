# AREP-parcial-2tercio

prototipo de sistema de microservicios con la conjetura de Collatz

## correrlo en ec2

- abrir aws
- iniciar las 3 máquinas (proxy, dos servicios)
- sudo yum install java-17-amazon-corretto-headless
- sudo yum install maven
- sudo yum install git
- clonar este repo (git clone https://github.com/hakki17/AREP-parcial-2tercio)
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

## pruebas despliegue

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/despliegue.png)

## pruebas locales

![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalproxy.png)
![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalservice.png)
![](https://github.com/hakki17/AREP-parcial-2tercio/blob/main/img/pruebaLocalIndex.png)

![]()












































