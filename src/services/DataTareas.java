package services;
import model.Tarea;

import java.util.ArrayList;

public class DataTareas {

    private ArrayList<Tarea> listaTareas;

    public DataTareas() {
        listaTareas = new ArrayList<>();
        cargarTareasEjemplo();
    }

    private void cargarTareasEjemplo() {
        listaTareas.add(new Tarea("Tarea 1", "Descripción 1", "2024-10-10", "Pendiente"));
        listaTareas.add(new Tarea("Tarea 2", "Descripción 2", "2024-10-12", "En progreso"));
        listaTareas.add(new Tarea("Tarea 3", "Descripción 3", "2024-10-15", "Completado"));
        listaTareas.add(new Tarea("Tarea 4", "Descripción 4", "2024-10-20", "Pendiente"));
        listaTareas.add(new Tarea("Tarea 5", "Descripción 5", "2024-10-22", "En progreso"));
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTareaPorTitulo(String titulo) {
        listaTareas.removeIf(tarea -> tarea.getTitulo().equals(titulo));
    }
}