[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/WFQ5YSkh)
# TP 2 - Algoritmos y Estructuras de Datos 1 - Año 2024

## Este TP debe realizarse en forma individual.

La integridad académica es un principio esencial en todos los aspectos de la educación. En el contexto de los exámenes esto es `fundamental`.
El plagio y el pasar el trabajo de otros como propio representan una grave violación de este valor. El plagio implica copiar o parafrasear el trabajo de alguien más sin atribuir adecuadamente la autoría. Pasar el trabajo de otros como propio es aún mas grave, ya que no refleja el conocimiento adquirido.
La integridad académica demanda `originalidad`, `honestidad` y `respeto` hacia el trabajo `propio` y de `otros`. Promover y mantener altos estándares de integridad académica es esencial para preservar la calidad y el valor de la educación.

## **\*\*\*\***\*\***\*\*\*\***\***\*\*\*\***\*\***\*\*\*\***

## FECHA DE ENTREGA: Jueves 07 de Noviembre hasta las 23:59:59 hs

## **\*\*\*\***\*\***\*\*\*\***\***\*\*\*\***\*\***\*\*\*\***

## Colas de Prioridad

Las colas de prioridad son un Tipo Abstracto de Dato en el que cada elemento tiene una prioridad asociada. A diferencia de una cola regular (FIFO), donde los elementos se procesan en el orden en el que llegan, en una cola de prioridad los elementos se extraen según su prioridad. Y en caso que dos elementos tengan la misma prioridad, se atienden en el orden en el que fueron agregados.

En este TAD, cada elemento se compone de dos partes: el valor y su prioridad. Y pueden existir dos versiones del mismo:

- Colas de Prioridad Máxima: Se atiende al elemento con la mayor prioridad.
- Colas de Prioridad Mínima: Se atiende al elemento con la menor prioridad.

## Situación Problemática

En las salas de emergencias de los hospitales, la llegada de pacientes con diferentes niveles de gravedad puede crear situaciones complejas de gestionar. La capacidad de los recursos médicos, como médicos, enfermeras, equipos y salas de intervención, es limitada, por lo que es fundamental priorizar la atención de acuerdo con la severidad de las condiciones de los pacientes. Para esto, se utiliza un sistema llamado triaje.

El triaje es un método de clasificación que asigna una prioridad de atención a los pacientes según la gravedad de su condición. Esta clasificación puede variar según el protocolo utilizado, pero en general sigue una estructura de categorías como la siguiente:

- Rojo (Emergencia): Pacientes en estado crítico que requieren atención inmediata, como aquellos con ataques cardíacos, paros respiratorios o hemorragias graves. Estos casos no pueden esperar sin un riesgo considerable de perder la vida.

- Naranja (Urgencia): Pacientes con condiciones graves pero que pueden tolerar una breve espera antes de recibir atención médica, como fracturas graves o heridas abiertas.

- Amarillo (Urgencia Menor): Pacientes que requieren intervención médica en un tiempo moderado, como aquellos con dolor abdominal fuerte o deshidratación.

- Verde (Consulta Prioritaria): Pacientes con afecciones que no ponen en riesgo su vida de manera inminente, como heridas menores o esguinces. Pueden esperar más tiempo para recibir atención.

- Azul (No Urgente): Pacientes con problemas menores o de carácter crónico que no requieren atención prioritaria, como una consulta de rutina o un resfriado común.

## Actividad

En una sala de emergencias, se utiliza un sistema de triaje para clasificar a los pacientes según la gravedad de su condición. La información de los pacientes se encuentra almacenada en un archivo de texto llamado "pacientes.txt", que contiene en orden de llegada al establecimiento los datos de cada paciente en el siguiente formato:

```csv
NOMBRE, APELLIDO, COLOR Triaje
Juan, Pérez, Rojo
Ana, Gómez, Azul
Carlos, López, Verde
María, Díaz, Verde
Luis, Fernández, Amarillo
```

En este trabajo se pretende desarrollar un algoritmo en Java que procese el archivo de texto y determine cuál es el N-ésimo paciente en ser atendido en la sala de emergencias teniendo en cuenta el orden de atención detallado anteriormente. Por ejemplo, según el listado anterior:

```txt
Los pacientes debería ser atendidos en el siguiente orden:
Juan Pérez, Rojo
Luis Fernández, Amarillo
Carlos López, Verde
María Díaz, Verde
Ana Gómez, Azul

y el 3-ésimo paciente en ser atendido debería ser Carlos López
```

Para dar solución a este problema vamos a empezar resolviendo problemas más simples que nos ayuden a calcular lo que queremos. Se deberán completar las siguientes consignas:

1. Inscribirse en GitHub Classroom y obtener el código base del proyecto.
2. Registrar su nombre de usuario en el siguiente formulario: https://forms.gle/KvCwsjKJoWFjEwtu6
3. Implementar en el archivo `ColaPrioridadArray.java` el TAD Cola de Prioridad usando arreglos ordenados. Los elementos con prioridad más chica (0, 1, 2, ...) deben ser atendidos primeros.
4. Implementar el método `clasificacionEmergencia()` de la clase `Paciente`.
5. Implementar el método `calcularAtencionN()` de la clase `SalaDeEmergencia`.
6. Entregar la solución completa del proyecto en tiempo y forma a través de GitHub Classroom.

**IMPORTANTE:** Se pueden agregar métodos y clases auxiliares en caso de ser necesario. Pero, se deberá respetar el perfil de los métodos ya definidos. Y no está permitido cambiar el nombre o estructura de las clases de Java provistas.

## Compilación y Ejecución

El proyecto se creó utilizando solamente Java, por lo que no debería ser necesario instalar otra herramienta. Además, se incluyeron test para que puedas validar tu implementación.

Algunos comandos útiles:

- Compilación: `javac *.java` permite compilar todas las clases Java utilizadas en el proyecto.

- Test Cola de Prioridad: `java ColaPrioridadArrayTest` permite ejecutar una serie de test sobre tu implementación de Colas de Prioridad, en caso que esté todo ok no muestra nada.

- Test Sala de Emergencia: `java SalaDeEmergenciaTest` permite ejecutar una serie de test sobre tu implementación de la clase Sala de Emergencia, en caso que esté todo ok no muestra nada.

- Ejecución: `java SalaDeEmergencia <número>` ejecuta el método main() de la clase SalaDeEmergencia y debería mostrar el N-ésimo paciente en ser atendido.

## Envío del proyecto: GitHub Classroom

Utilizaremos GitHub Classroom. Accede al link del trabajo práctico que te enviamos por Classroom y/ó Slack. Unite para tener acceso a la actividad. (Si es la primera vez que utilizas GitHub Classroom te pedirá que otorgues permisos para acceder a tu repositorio de GitHub.)

Para trabajar en los archivos del proyecto, es necesario crear una copia local en tu computadora, agregar tu solución en los archivos locales, y luego subir los cambios a GitHub.

- Abre tu terminal o línea de comandos. Elige un directorio de trabajo donde agregarás tu carpeta con el proyecto a editar y ejecuta el siguiente comando, tendrás una copia local del repositorio:

```
git clone <link de tu repositorio>
```

![git clone](/img/clone.png)

- Una vez clonado, utiliza el siguiente comando para entrar al directorio del proyecto:

```
cd <directorio del repositorio clonado (tu copia local)>
```

- Utiliza tu editor de código favorito (Visual Studio Code, Sublime Text, Atom, etc.) para abrir los archivos del proyecto y realizar los cambios necesarios.

- Git realiza un seguimiento de los cambios que realizas en los archivos. Para registrar estos cambios localmente, utiliza el comando “git add”.

```
git add <nombre-del-archivo>
```

- Cuando esté listo para subir, primero deberás “asegurar tus cambios” con el comando `commit`. Ete comando toma una “foto instantánea” de tu código y permite que tus cambios queden registrados en tu máquina. Deberás agregarle un mensaje descriptivo que identifique los cambios realizados, por ejemplo:

```
git commit -m “Agrego fn factorizar”
```

Es importante destacar que la operación commit no realiza los cambios en el repositorio remoto (el que está subido en gitHub). La operación commit solamente permite guardar los cambios en tu copia local.

- Para enviar todos tus cambios al repositorio remoto de gitHub, utiliza el comando “git push”

```
git push
```

NOTA: Si hiciste 5 commits en tu repositorio local, al hacer "git push" se enviaran todos los cambios hechos en esos 5 commits al repositorio remoto. Es decir el push envía TODOS los cambios realizados al repositorio remoto.

![git push](/img/push.png)

- Otros comandos útiles son

`git status`: permite visualizar el estado actual de tu repositorio (archivos modificados, listos para commit, etc).

`git log`: permite ver el historial de commits
