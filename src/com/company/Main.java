package com.company;

public class Main {

    public static void main(String[] args) {
	JogadorDeFutebol ibra = new JogadorDeFutebol("Ibrahimovic",100, 10,100);
	JogadorDeFutebol olivier = new JogadorDeFutebol("Giroud",100, 5,90);

	SessaoDeTreinamento treinamentoIbra = new SessaoDeTreinamento(ibra);
	SessaoDeTreinamento treinamentoGiroud = new SessaoDeTreinamento(olivier);

	treinamentoIbra.treinarA(ibra);
	treinamentoGiroud.treinarA(olivier);
    }
}
