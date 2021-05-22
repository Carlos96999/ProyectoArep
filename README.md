# Tácticas y estrategias para ataques comunes en la nube 
Con este proyecto queremos mostras algunas estrategias y posibles soluciones a los ataques más comunes dirigidos a servicios alojados en la nube.
Se realizaron dos pruebas (Una sobre un ambiente de una plataforma ajena y la otra montando un servicio en EC2) donde se evidencian los ataques más comunes a dichos servicios, como lo son la denegación de servicio y el exceso de privilegios al momento de hacer uso de un servicio en la nube (En este caso la ausencia del mínimo privilegio).

## Prerequisitos
* Maven
* Git
* Java
* AWS
* CircleCi

## CircleCi  
 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Carlos96999/AREP-LAB-5)  

## AWS  
http://ec2-18-207-197-103.compute-1.amazonaws.com:8087/

## Instalación
Para usar este programa debe abrir la consola (CMD) ir a la ubicación donde desee guardar el programa y ejecutar este comando:
```
git clone https://github.com/Carlos96999/ProyectoArep.git
```

## Ejecución
Entramos a la carpeta creada por el comando anterior y entramos a "ProyectoArep" desde la consola de comandos (CMD), ejecutamos estos comandos:
```
* mvn package
* mvn clean compile
```
<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/ejecucion.PNG?raw=true">  

## Iniciar programa de forma local
Entramos a la carpeta creada del laboratorio "ProyectoArep" y ejecutamos el siguiente comando:  
```  
java -cp target/classes edu.escuelaing.arep.RoundRobin.SparkWebServer
```  

## Pruebas
Si desea conocer la ejecución de las pruebas, puede ejecutar en consola el comando mvn test (en la misma ubicación donde ejecuto los comandos de la parte de Ejecución).

<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/pruebas.PNG?raw=true">


## Documentación
Encontrara la documentación sobre el programa en la siguiente ubicación
```
javaDocs
```

<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/documentacion.PNG?raw=true">
  
## Presentación  
<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/vistaInicial.PNG?raw=true">  



## Desarrollo
Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)
* [AWS](https://aws.amazon.com/es/education/awseducate/)

## Licencia
[Licencia **GNU General Public License v3.0**](https://github.com/Carlos96999/ProyectoArep/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[Carlos Andrés Amorocho](https://github.com/Carlos96999)
