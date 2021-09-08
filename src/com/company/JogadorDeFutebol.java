package com.company;

public class JogadorDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    //construtor
    public JogadorDeFutebol(String nome, int alegria, int gols, int experiencia){
        this.nome = nome;
        energia = 100;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getAlegria() {
        return alegria;
    }
    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    public int getGols() {
        return gols;
    }
    public void setGols(int gols) {
        this.gols = gols;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //métodos
    public void fazerGols(){
        this.setEnergia(getEnergia() - 5);
        this.setAlegria(getAlegria() + 10);
        this.setGols(getGols() + 1);
        System.out.println("GOOOOL");
    }

    public void correr(){
        this.setEnergia(getEnergia() - 10);
        System.out.println("Cansei!");
    }
}
