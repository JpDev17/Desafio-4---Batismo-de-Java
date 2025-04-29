package Desafios3;

public class NinjaBasico implements Ninja {

    String nome;
    Enum TipoHabilidade;
    int idade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, Enum TipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.TipoHabilidade = TipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + TipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade ninja se baseia no " + TipoHabilidade + "!");
    }
}

