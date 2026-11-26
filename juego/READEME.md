
# Juego del Ahorcado (Hangman) en Java

Proyecto de programación en Java desarrollado para la asignatura de Programación (1.º FP Grado Superior). Consiste en una versión de consola del clásico juego del Ahorcado para dos jugadores.

## Descripción del juego
1. **Jugador 1** introduce la palabra secreta por teclado (si pulsa Enter sin escribir nada, se asigna la palabra por defecto `_ _ _ _ _ _`).
2. La pantalla se limpia mediante saltos de línea para ocultar la palabra al segundo jugador.
3. **Jugador 2** dispone de **6 vidas** para adivinar la palabra letra por letra.
4. El programa valida que cada entrada sea una única letra y avisa si la letra ya ha sido utilizada anteriormente.

## Requisitos y ejecución
- **Requisitos:** Java Development Kit (JDK 17 o superior).
- **Compilación:**
  ```bash
  javac Hangman.java

- **Ejecución:**
  ```bash
  java Hangman