package com.uv.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<String> tareas = new ArrayList<>();
    private List<Boolean> estadoTareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        estadoTareas.add(false);
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            String estado = estadoTareas.get(i) ? "[X]" : "[ ]";
            System.out.println((i + 1) + ". " + estado + " " + tareas.get(i));
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < estadoTareas.size()) {
            estadoTareas.set(indice, true);
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            estadoTareas.remove(indice);
        }
    }

    public int getCantidadTareas() {
        return tareas.size();
    }
}
