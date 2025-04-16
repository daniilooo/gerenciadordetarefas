package rn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.*;

/**
 * Classe de regras de negócio para o gerenciamento de tarefas.
 * Contém métodos para criar lista, adicionar, listar, alterar e remover
 * tarefas.
 */
public class TarefasRn {
    /**
     * Cria uma nova lista de tarefas.
     * 
     * @return Lista de tarefas vazia
     */
    public List<Tarefa> criarListaTarefas() {
        List<Tarefa> listaTarefas = new ArrayList<>();
        return listaTarefas;
    }

    /**
     * Cria uma nova tarefa com base na entrada do usuário.
     * 
     * @return Objeto Tarefa criado
     */
    public Tarefa criarTarefa() {
        Tarefa tarefa;
        Scanner sc = new Scanner(System.in);
        String descricaoTarefa = "";

        System.out.println("Digite a descrição da tarefa: ");
        descricaoTarefa = sc.nextLine();
        // sc.close();

        tarefa = new Tarefa(0, descricaoTarefa, 0);
        return tarefa;
    }

    /**
     * Insere uma tarefa na lista.
     * 
     * @param lista  Lista de tarefas
     * @param tarefa Tarefa a ser inserida
     */
    public void inserirTarefa(List<Tarefa> listaTarefas, Tarefa tarefa) {
        tarefa.setIdTarefa(listaTarefas.size() + 1);
        listaTarefas.add(tarefa);
    }

    /**
     * Lista todas as tarefas da lista.
     * 
     * @param lista Lista de tarefas
     */
    public void listarTarefas(List<Tarefa> listaTarefas) {
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

    /**
     * Altera o status de uma tarefa.
     * 
     * @param lista  Lista de tarefas
     * @param id     ID da tarefa
     * @param status Novo status
     */
    public void alterarStatus(List<Tarefa> listaTarefas, int idTarefa, String status) {

        int codStatus;

        switch (status.toLowerCase()) {
            case "pendente":
                codStatus = 0;
                break;
            case "andamento":
                codStatus = 1;
                break;
            case "concluido":
                codStatus = 2;
                break;
            default:
                codStatus = 0;
        }

        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getIdTarefa() == idTarefa) {
                /*
                 * 0 - pendente
                 * 1 - em execução
                 * 2 - concluida
                 */
                tarefa.setStatusTarefa(codStatus);
            }
        }
    }

    /**
     * Remove uma tarefa da lista com base no ID.
     * 
     * @param lista Lista de tarefas
     * @param id    ID da tarefa a ser removida
     */
    public void removerTarefa(List<Tarefa> listaTarefa, int idTarefa) {
        listaTarefa.removeIf(tarefa -> tarefa.getIdTarefa() == idTarefa);
    }

    /**
     * Altera a descrição de uma tarefa.
     * 
     * @param lista         Lista de tarefas
     * @param id            ID da tarefa
     * @param novaDescricao Nova descrição
     */
    public void alterarTarefa(List<Tarefa> listaTarefa, int idTarefa, String descricaoTarefa) {
        for (Tarefa tarefa : listaTarefa) {
            if (tarefa.getIdTarefa() == idTarefa) {
                tarefa.setDescricaoTarefa(descricaoTarefa);
            }
        }
    }

}
