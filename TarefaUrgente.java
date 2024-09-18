public class TarefaUrgente extends Tarefa { // herança de classe
    private String razaoUrgencia;
    
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5); // usando o construtor da classe Tarefa
        this.razaoPrioridade = razaoUrgencia;
    }

    // métodos

    public getRazaoUrgencia(){
        return this.razaoUrgencia;
    }

    public setRazaoUrgencia(String razaoUrgencia){
        this.razaoUrgencia = razaoUrgencia;
    }

    @Override
    public void exibirDetalhes(){
        super exibirDetalhes;
        System.out.pintln("Razão da Urgência: " + this.razaoUrgencia);

    }
}
