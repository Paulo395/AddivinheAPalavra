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
    String[] arrayPalavras = {
        "Estados","Alfabeto","Transiçoes","Determinismo","Minimizaçao",
        "Equivalência","Fechamento","Complementaçao"};
    
    String [] arrayDicas = {
        "Cada autômato tem uma quantidade finita deles",
        "É um conjunto de símbolos que o autômato reconhece",
        "São as mudanças de estado que acontecem com as entradas.",
        "Como a AFD lida com múltiplas possibilidades de transição." , 
        "É um processo de simplificação do autômato.",
        "Verifica se duas AFDs descrevem a mesma linguagem secreta.",
        "A habilidade da AFD de reconhecer várias palavras secretas.",
        "A transformação que torna possível \"inverter\" a AFD"};
    
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
