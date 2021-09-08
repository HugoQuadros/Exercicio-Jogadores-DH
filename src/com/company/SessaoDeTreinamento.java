package com.company;

public class SessaoDeTreinamento {

    private int experiencia;

    //construtor
    public SessaoDeTreinamento(JogadorDeFutebol jogador){
        this.experiencia = jogador.getExperiencia();
    }

    //getter and setter
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //método
    public void treinarA(JogadorDeFutebol jogador){
        System.out.println("Começando treinamento do jogador " + jogador.getNome());
        jogador.correr();
        jogador.fazerGols();
        jogador.correr();

        System.out.println("Experiência inicial: " + this.experiencia);
        setExperiencia(getExperiencia() + 1);
        System.out.println("Experiência final: " + this.experiencia);
    }

}
