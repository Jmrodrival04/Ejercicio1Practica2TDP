package Ej4;

import java.util.Scanner;

public class CalculoVelocidadMedia {
    public static void main(String[] args) {
        double distanciaRecorrida, tiempoTranscurrido, velocidadMedia;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la distancia recorrida (km): ");
        distanciaRecorrida = scanner.nextDouble();
        System.out.print("Introduzca el tiempo transcurrido (horas): ");
        tiempoTranscurrido = scanner.nextDouble();
        velocidadMedia = distanciaRecorrida / tiempoTranscurrido;
        System.out.println("La velocidad media es: " + velocidadMedia + " km/h");
    }
}
