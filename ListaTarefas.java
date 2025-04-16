import models.*;
import rn.*;
import java.util.List;
import java.util.Scanner;

class listaTarefas {
    public static List<Tarefa> listaTarefas = null;
    public static boolean continuar = true;

    public static void main(String[] args) {

        while (continuar) {
            menu();
        }

    }

    public static void menu() {
        Scanner cmd = new Scanner(System.in);
        int comando = 0;
        TarefasRn gerenciamentoTarefas = new TarefasRn();

        System.out.println("\n====== Gerenciador de tarefas ======\n");
        System.out.println("Digite o código da ação que deseja.");

        System.out.println("1. Criar nova lista de tarefas\n" +
                "2. Adicionar tarefa\n" +
                "3. Listar tarefas\n" +
                "4. Alterar status da tarefa\n" +
                "5. Remover tarefa da lista\n" +
                "6. Alterar a descricão de uma tarefa\n" +
                "7. Sair");

        comando = cmd.nextInt();

        // cmd.close();

        switch (comando) {
            case 1:
                limparTela();
                System.out.println("A criação de uma nova lista de tarefas vai excluir a lista existente.");
                listaTarefas = gerenciamentoTarefas.criarListaTarefas();
                break;

            case 2:
                limparTela();
                if (listaTarefas == null) {
                    System.out.println("Iniciando uma nova lista de tarefas.");
                    listaTarefas = gerenciamentoTarefas.criarListaTarefas();
                }

                Tarefa tarefa = gerenciamentoTarefas.criarTarefa();
                gerenciamentoTarefas.inserirTarefa(listaTarefas, tarefa);

                System.out.println("Lista de tarefas criada com sucesso.");
                System.out.println("Tarefa adicionada com sucesso.");

                gerenciamentoTarefas.listarTarefas(listaTarefas);

                break;

            case 3:
                limparTela();
                gerenciamentoTarefas.listarTarefas(listaTarefas);
                break;

            case 4:
                int idTarefa = 0;
                String status = "";
                System.out.println("Digite o ID da tarefa que você deseja alterar");
                idTarefa = cmd.nextInt();

                System.out.println("Digite o novo status para a tarefa [pendente], [andamento], [concluido]");
                status = cmd.next();

                String[] alteracaoStatus = { String.valueOf(idTarefa), status };

                gerenciamentoTarefas.alterarStatus(listaTarefas, Integer.parseInt(alteracaoStatus[0]),
                        alteracaoStatus[1]);

                limparTela();
                gerenciamentoTarefas.listarTarefas(listaTarefas);
                break;

            case 5:
                limparTela();
                int idTarefaExcluir = 0;
                gerenciamentoTarefas.listarTarefas(listaTarefas);
                System.out.println("Digite qual tarefa você deseja remover da lista");

                idTarefaExcluir = cmd.nextInt();

                gerenciamentoTarefas.removerTarefa(listaTarefas, idTarefaExcluir);
                limparTela();
                System.out.println("Tarefa removida da lista com sucesso.");
                gerenciamentoTarefas.listarTarefas(listaTarefas);
                break;

            case 6:
                limparTela();
                gerenciamentoTarefas.listarTarefas(listaTarefas);

                int idTarefaAlteracao = 0;
                String novaDescricaoTarefa = "";

                System.out.println("Digite o ID da tarefa que deseja alterar");
                idTarefaAlteracao = cmd.nextInt();

                System.out.println("Digite a nova descrição para a tarefa");
                novaDescricaoTarefa = cmd.next();

                String[] alteracaoTarefa = { String.valueOf(idTarefaAlteracao), novaDescricaoTarefa };

                gerenciamentoTarefas.alterarTarefa(listaTarefas, Integer.parseInt(alteracaoTarefa[0]),
                        alteracaoTarefa[1]);

                limparTela();
                System.out.println("Descrição da tarefa alterada com sucesso.");
                gerenciamentoTarefas.listarTarefas(listaTarefas);

                break;

            case 7:
                limparTela();
                continuar = false;
                System.out.println("Finalizando execução da lista de tarefas.");
                break;

            default:
                limparTela();
                System.out.println("Opção inválida, digite uma das opções abaixo para continuar.");
                menu();
                break;
        }

    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}