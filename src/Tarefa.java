public class Task {
        String nome;
        String descricao;
        boolean status;

        void Tarefa(){
            System.out.println("Nome da Tarefa: " + this.nome);
            System.out.println("Descrição da Tarefa: " + this.descricao);
            System.out.println("Situação da Tarefa: " + this.status);
        }
}