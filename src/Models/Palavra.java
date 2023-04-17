/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;

/**
 *
 * @author pauli
 */
public class Palavra {
    Random rand = new Random();
    String[] arrayPalavras = {"Universidade","Apartamento","Cadeira","Corredor"
            ,"Umidificador","Vaidade","Habilidade","Desastre","Felicidade"};
    
    String [] arrayDicas = {"Local de ensino superior.",
        "Tipo de moradia que possui várias divisões.",
        "Móvel utilizado para sentar.",
        "Área de circulação entre cômodos em uma casa." , 
        "Equipamento que aumenta a umidade do ar.",
        "Excesso de amor próprio ou admiração por si mesmo.",
        "Capacidade de realizar algo com destreza e maestria.",
        "Evento ou situação catastrófica ou destrutiva.",
        "Estado de contentamento."};
    
    int randomIndex = rand.nextInt(arrayPalavras.length);
    public String palavraAtual = arrayPalavras[randomIndex];
    
    public String GerarPalavra(){
        return palavraAtual;
    }
    
    public String QuantAspas(){
        String aspas = "";
        
        for (int i = 0; i < palavraAtual.length(); i++) {
            aspas += "*";
        }
        return aspas;
    }
    
    public String GerarDica(){
        return arrayDicas[randomIndex];
    }
}
