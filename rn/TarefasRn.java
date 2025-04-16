package rn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.*;

public class TarefasRn {

    public List<Tarefa> criarListaTarefas() {
        List<Tarefa> listaTarefas = new ArrayList<>();
        return listaTarefas;
    }

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

    public void inserirTarefa(List<Tarefa> listaTarefas, Tarefa tarefa) {
        tarefa.setIdTarefa(listaTarefas.size() + 1);
        listaTarefas.add(tarefa);
    }

    public void listarTarefas(List<Tarefa> listaTarefas) {
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa);
        }
    }

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

    public void removerTarefa(List<Tarefa> listaTarefa, int idTarefa) {
        listaTarefa.removeIf(tarefa -> tarefa.getIdTarefa() == idTarefa);
    }

    public void alterarTarefa(List<Tarefa> listaTarefa, int idTarefa, String descricaoTarefa) {
        for (Tarefa tarefa : listaTarefa) {
            if (tarefa.getIdTarefa() == idTarefa) {
                tarefa.setDescricaoTarefa(descricaoTarefa);
            }
        }
    }

}
