#!/bin/bash

# Compilar todos los archivos .java
javac *.java -encoding UTF-8
if [ $? -ne 0 ]; then
  echo "Error: Fallo en la compilación."
  exit 1
fi

# Ejecutar Test1
java ColaPrioridadArrayTest
if [ $? -ne 0 ]; then
  echo "Error: Fallo al ejecutar los tests sobre Cola"
  exit 1
fi

# Ejecutar Test2
java SalaDeEmergenciaTest
if [ $? -ne 0 ]; then
  echo "Error: Fallo al ejecutar los tests sobre SalaDeEmergencia"
  exit 1
fi

echo "Script ejecutado correctamente."
exit 0
