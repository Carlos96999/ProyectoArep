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
 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Carlos96999/ProyectoArep)  

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

## Ambiente  
Para este proyecto se realizaron dos pruebas donde podemos evidenciar algunos de los ataques más comunes a los servicios montados en la nube, como lo son la denegación de servicio y la vulnerabilidad por la ausencia del mínimo privilegio (esta última por una mal configuración sobre el servicio implementado, con ayuda de una plataforma ajena HTB).
Muchas veces para afectar la disponibilidad e incluso la confianza del sitio web, se realizan denegaciones de servicio y así afectar estos pilares importantes del negocio frente a sus clientes.  
La ausencia del mínimo privilegio es muy común que se presente en servicios de la nube, ya que muchas veces no se tiene información sobre las acciones que un usuario puede ejecutar sobre el servicio o incluso se realiza una mala configuración, logrando así explotar permisos que tengan los usuarios para poder obtener información sobre el bien o incluso afectar la infraestructura desde su interior.  

## Defensa DoS
Para poder protegerse frente a una denegación de servicio, se implemento EC2 Auto Scaling, es una herramienta de AWS que nos permite administrar las máquinas EC2 para poder agregar o eliminar algunas instancias dependiendo de las condiciones establecidas al momento de configurarlo.
Con ayuda de esta herramienta es posible asegurar la disponibilidad del servicio frente a una denegación de servicio, ya sea un ataque dirigido a un objetivo (DoS) o uno distribuido para varios objetivos (DDoS).  
<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/aws-autoscaling.jpg?raw=true">  
  
## Ausencia del mínimo privilegio  
Muchas veces al implementar servicios de la nube como lo pueden ser para almacenamiento (S3 fue probado en este caso), por el simple hecho de implementarlo y dejar la configuración por defecto del servicio, se cree que tendrá la seguridad suficiente, pero esto ahí no termina. Se tiene que realizar una correcta configuración del servicio para evitar que usuarios no deseados puedan tener acceso o incluso manejar el servicio a su antojo.

## Mediciones del Experimento

*[CloudWatch](https://aws.amazon.com/es/cloudwatch/) 
Para la medición de nuestro experimento se utilizó una herramienta ofrecida por AWS llamada Amazon CloudWatch, recopila datos de monitorización y operaciones en formato de registros, métricas y eventos, y permite su visualización mediante paneles automatizados para obtener una vista unificada de los recursos, las aplicaciones y los servicios de AWS que se ejecutan en servidores locales y de AWS.
Estas métricas y registros se pueden correlacionar para comprender mejor el estado y el rendimiento de los recursos. 
También se pueden crear alarmas según los umbrales de valores de métricas especificados o que detecten comportamientos de métricas anómalos en función de algoritmos de aprendizaje automático.

Las métricas obtenidas en nuestro experimento fueron las siguientes:

<img src="https://github.com/Carlos96999/ProyectoArep/blob/main/img/mediciones.jpg?raw=true"> 

Podemos observar que al realizar el ataque la cantidad de datos entrantes fue de gran magnitud comparada a la usada normalmente. Gracias a la herramienta creamos una alarma que nos avisaba cuando la cantidad de paquetes entrantes era anómala o si superaba un umbral máximo.


 
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
