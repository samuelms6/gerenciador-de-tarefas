import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao = 0;
        while(opcao != 5) {

            System.out.println();
            System.out.println("===== CONTROLE DE TAREFAS =====");
            System.out.println("1 - Adicionar Tarefa.");
            System.out.println("2 - Listar Tarefas.");
            System.out.println("3 - Remover Tarefa.");
            System.out.println("4 - Concluir Tarefa.");
            System.out.println("5 - Sair.");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            while (opcao > 5 || opcao < 1) {
                System.out.print("Selecione um número válido: ");
                opcao = sc.nextInt();
            }

            switch (opcao) {
                case 1:

                    Tarefa tarefa = new Tarefa();

                    System.out.print("Adicione um nome a Tarefa: ");
                    tarefa.setNome(sc.nextLine());

                    System.out.print("Qual será a tarefa: ");
                    tarefa.setDescricao(sc.nextLine());
                    tarefas.add(tarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:

                    System.out.println("Listando Tarefas:");
                    System.out.println();

                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("===============");
                        System.out.println("Índice: " + i);
                        tarefas.get(i).exibirStatus();
                    }
                    break;

                case 3:

                    System.out.print("Digite o índice da tarefa: ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Índice inválido.");
                    }

                    break;

                case 4:
                    System.out.print("Digite o índice da tarefa para concluir: ");
                    int indiceConclusao = sc.nextInt();

                    if (indiceConclusao >= 0 && indiceConclusao < tarefas.size()) {
                        tarefas.get(indiceConclusao).setSituacao(true);
                        System.out.println("Tarefa concluida com sucesso!");
                    }  else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Finalizando o programa.");
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }
        }
        sc.close();
    }
}