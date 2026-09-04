package br.com.fatec.processoseletivo.service;

import br.com.fatec.processoseletivo.model.Tarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final List<Tarefa> listaTarefas = new ArrayList<>();

    public List<Tarefa> listarTodas() {
        return listaTarefas;
    }

    public Optional<Tarefa> buscarPorIndice(int indice) {
        if (indice >= 0 && indice < listaTarefas.size()) {
            return Optional.of(listaTarefas.get(indice));
        }
        return Optional.empty();
    }

    public Tarefa cadastrar(Tarefa novaTarefa) {
        listaTarefas.add(novaTarefa);
        return novaTarefa;
    }

    public boolean deletar(int indice) {
        if (indice >= 0 && indice < listaTarefas.size()) {
            listaTarefas.remove(indice);
            return true;
        }
        return false;
    }

    public Tarefa atualizar(int indice, Tarefa tarefaAtualizada) {
        if (indice >= 0 && indice < listaTarefas.size()) {
            listaTarefas.set(indice, tarefaAtualizada);
            return tarefaAtualizada;
        }
        return null;
    }
}
