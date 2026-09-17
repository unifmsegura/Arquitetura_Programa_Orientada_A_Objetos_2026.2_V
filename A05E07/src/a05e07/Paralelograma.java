/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e07;

/**
 *
 * @author unifmsegura
 */
class Paralelogramo extends Trapezio {

    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
}

// Subclasse Retangulo (herda de Paralelogramo)
class Retangulo extends Paralelogramo {

    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
}

// Subclasse Quadrado (herda de Retangulo)
class Quadrado extends Retangulo {

    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
}
