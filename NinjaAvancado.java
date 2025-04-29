package Desafios3;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, Enum TipoHabilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.TipoHabilidade = TipoHabilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + TipoHabilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade ninja se baseia no " + TipoHabilidade + "!");
    }
}
