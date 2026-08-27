/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
public class Data {
    private int dia, mes, ano;
    
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 2026;
    }
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void printData(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }
}
