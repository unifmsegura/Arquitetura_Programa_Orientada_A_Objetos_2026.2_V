/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e07;

/**
 *
 * @author unifmsegura
 */
class Quadrilatero {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    private Ponto p4;

    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Ponto getP1() { return p1; }
    public Ponto getP2() { return p2; }
    public Ponto getP3() { return p3; }
    public Ponto getP4() { return p4; }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", p1, p2, p3, p4);
    }
}
