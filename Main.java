package Desafios3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //baseado no Naruto Clássico (o melhor Naruto)

        System.out.println("=-=-=-=-= DADOS NINJA BÁSICO =-=-=-=-=");
        NinjaBasico ninjaJunior = new NinjaBasico("Figurante do Anime", 16, TipoHabilidade.TAIJUTSU);
        ninjaJunior.mostrarInformacoes();
        ninjaJunior.executarHabilidade();

        System.out.println("\n=-=-=-=-= DADOS NINJA AVANÇADO =-=-=-=-=");
        NinjaAvancado ninjaSenior = new NinjaAvancado("Kakashi Hatake", 26, TipoHabilidade.NINJUTSU, "Raikiri e Sharingan");
        ninjaSenior.mostrarInformacoes();
        ninjaSenior.executarHabilidade();
    }
}
