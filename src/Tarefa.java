public class Tarefa {
        private String nome;
        private String descricao;
        private boolean situacao;

        public void exibirStatus(){
            String status = situacao ? "Concluída" : "Pendente";
            System.out.println("Nome da Tarefa: " + this.nome);
            System.out.println("Descrição da Tarefa: " + this.descricao);
            System.out.println("Status: " + status);
            System.out.println();
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public void setDescricao(String descricao){
            this.descricao = descricao;
        }

        public void setSituacao(boolean situacao){
            this.situacao = situacao;
        }
}