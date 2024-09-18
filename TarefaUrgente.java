public class TarefaUrgente extends Tarefa { // herança de classe
    private String razaoPrioridade;
    
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoPrioridade) {
        super(titulo, descricao, prazo, 5); // usando o construtor da classe Tarefa
        this.razaoPrioridade = razaoPrioridade;

    }

}
