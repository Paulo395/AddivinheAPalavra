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
    String[] arrayPalavras = {"Universidade","Apartamento","Cadeira","Corredor"
            ,"Umidificador","Vaidade","Habilidade","Desastre","Felicidade"};
    public String palavraAtual;
    
    Random rand = new Random();
    
    int randomIndex = rand.nextInt(arrayPalavras.length);
    
    public String GerarPalavra(){
        palavraAtual = arrayPalavras[randomIndex];
        return palavraAtual;
    }
    
    public String Misterio(){
        String carac = "";
        
        for (int i = 0; i < palavraAtual.length(); i++) {
            carac += "*";
        }
        return carac;
    }
}
