package edu.EjercicioClase;
import java.lang.*;
import java.util.Scanner;

public class EjercicioClase {

    // Función para calcular el área del círculo
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        return area;
    }

    // Función para calcular la circunferencia del círculo
    public static double calcularCircunferencia(double radio) {
        double circunferencia = 2 * Math.PI * radio;
        return circunferencia;
    }

    // Función para calcular el volumen del cubo
    public static double calcularVolumenCubo(double lado) {
        double volumen = lado * lado * lado;
        return volumen;
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(int base, int altura) {
        double area = (base * altura) / 2.0;
        return area;
    }

    // Función para calcular el volumen de un prisma
    public static double calcularVolumenPrisma(double base, double height) {
        Prism prisma = new Prism(base, height);
        return prisma.getVolume();
    }

    // Clase Prism para calcular el volumen del prisma
    static class Prism {
        private double base; // Área de la base del prisma
        private double height; // Altura del prisma

        public Prism(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double getVolume() {
            return base * height;
        }
    }

    // Función para calcular el área de un paralelogramo
    public static double calcularAreaParalelogramo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static void main(String[] args) {
        double r; // Radio del círculo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        r = scanner.nextDouble();

        double areaCirculo = calcularAreaCirculo(r); // Calcular área del círculo
        double circunferencia = calcularCircunferencia(r); // Calcular circunferencia del círculo

        System.out.println("El área del círculo es: " + areaCirculo);
        System.out.println("La circunferencia del círculo es: " + circunferencia);

        System.out.println("Introduce la longitud de cada lado del cubo: ");
        double lado = scanner.nextDouble();

        double volumenCubo = calcularVolumenCubo(lado);

        System.out.println("El volumen del cubo es " + volumenCubo + " unidades cúbicas.");

        System.out.println("Ingrese la base del triángulo (pirámide): ");
        int baseTriangulo = scanner.nextInt();
        System.out.println("Ingrese la altura del triángulo (pirámide): ");
        int alturaTriangulo = scanner.nextInt();

        double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
        System.out.println("El área del triángulo (pirámide) es: " + areaTriangulo);

        System.out.println("Ingrese la base del prisma: ");
        double basePrisma = scanner.nextDouble();
        System.out.println("Ingrese la altura del prisma: ");
        double alturaPrisma = scanner.nextDouble();

        double volumenPrisma = calcularVolumenPrisma(basePrisma, alturaPrisma);
        System.out.println("El volumen del prisma es: " + volumenPrisma + " unidades cúbicas.");

        System.out.println("Ingrese la base del paralelogramo: ");
        double baseParalelogramo = scanner.nextDouble();
        System.out.println("Ingrese la altura del paralelogramo: ");
        double alturaParalelogramo = scanner.nextDouble();

        double areaParalelogramo = calcularAreaParalelogramo(baseParalelogramo, alturaParalelogramo);
        System.out.println("El área del paralelogramo es: " + areaParalelogramo);
    }
}
