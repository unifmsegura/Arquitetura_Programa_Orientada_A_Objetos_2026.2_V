/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e07;

/**
 *
 * @author unifmsegura
 */
public class A05E07 {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   HIERARQUIA QUADRILÁTERO (DEITEL 9.8 - EX 7)  ");
        System.out.println("=================================================\n");

        // 1. Trapézio: p1(0,0), p2(10,0), p3(8,5), p4(2,5)
        Trapezio trapezio = new Trapezio(
            new Ponto(0.0, 0.0), new Ponto(10.0, 0.0),
            new Ponto(8.0, 5.0), new Ponto(2.0, 5.0)
        );

        // 2. Paralelogramo: p1(0,0), p2(5,0), p3(7,4), p4(2,4)
        Paralelogramo paralelogramo = new Paralelogramo(
            new Ponto(0.0, 0.0), new Ponto(5.0, 0.0),
            new Ponto(7.0, 4.0), new Ponto(2.0, 4.0)
        );

        // 3. Retângulo: p1(0,0), p2(8,0), p3(8,4), p4(0,4)
        Retangulo retangulo = new Retangulo(
            new Ponto(0.0, 0.0), new Ponto(8.0, 0.0),
            new Ponto(8.0, 4.0), new Ponto(0.0, 4.0)
        );

        // 4. Quadrado: p1(0,0), p2(4,0), p3(4,4), p4(0,4)
        Quadrado quadrado = new Quadrado(
            new Ponto(0.0, 0.0), new Ponto(4.0, 0.0),
            new Ponto(4.0, 4.0), new Ponto(0.0, 4.0)
        );

        System.out.println("1. Trapézio");
        System.out.println("   Vértices : " + trapezio);
        System.out.printf("   Área     : %.2f\n\n", trapezio.calcularArea());

        System.out.println("2. Paralelogramo");
        System.out.println("   Vértices : " + paralelogramo);
        System.out.printf("   Área     : %.2f\n\n", paralelogramo.calcularArea());

        System.out.println("3. Retângulo");
        System.out.println("   Vértices : " + retangulo);
        System.out.printf("   Área     : %.2f\n\n", retangulo.calcularArea());

        System.out.println("4. Quadrado");
        System.out.println("   Vértices : " + quadrado);
        System.out.printf("   Área     : %.2f\n\n", quadrado.calcularArea());

        System.out.println("=================================================");
    }
}

