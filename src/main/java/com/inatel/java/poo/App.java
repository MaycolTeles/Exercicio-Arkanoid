package com.inatel.java.poo;

import com.inatel.java.poo.Jogador.Jogador;
import com.inatel.java.poo.Bloco.Bloco;
import com.inatel.java.poo.Conversor.Conversor;

public class App 
{
    public static void main( String[] args ){
        
        // INSTANCIANDO OS OBJETOS
        Jogador jogador = new Jogador();    // Instanciando o jogador

        Bloco bloco1 = new Bloco();         // Instanciando o bloco 1
        Bloco bloco2 = new Bloco();         // Instanciando o bloco 2
        Bloco bloco3 = new Bloco();         // Instanciando o bloco 3
        Bloco bloco4 = new Bloco();         // Instanciando o bloco 4
        
        // EXIBINDO A QUANTIDADE DE BLOCOS EM JOGO
        System.out.println("Quantidade de blocos em jogo: " + Bloco.getQtdBlocos());
        System.out.println("");

        // DESTRUINDO ALGUNS BLOCOS
        jogador.destruirBloco(bloco1);
        jogador.destruirBloco(bloco2);

        // EXIBINDO A NOVA QUANTIDADE DE BLOCOS EM JOGO E A PONTUAÇÃO DO JOGADOR
        System.out.println("Quantidade de blocos em jogo: " + Bloco.getQtdBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPontuacao());
        System.out.println("");
        
        // DESTRUINDO ALGUNS BLOCOS
        jogador.destruirBloco(bloco3);
        jogador.destruirBloco(bloco4);

        // EXIBINDO A NOVA QUANTIDADE DE BLOCOS EM JOGO E A PONTUAÇÃO DO JOGADOR
        System.out.println("Quantidade de blocos em jogo: " + Bloco.getQtdBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPontuacao());
        System.out.println("");

        // EXIBINDO A PONTUAÇÃO FINAL DO JOGADOR E O TOTAL DE MOEDAS
        System.out.println("Pontuação final do jogador: " + jogador.getPontuacao()); 
        System.out.println("Total de moedas: " + Conversor.converte_pontuacao_para_moedas(jogador.getPontuacao()));


    }
}
