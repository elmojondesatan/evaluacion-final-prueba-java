package view;

import model.Tarea;
import services.DataTareas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TareasView extends JFrame {

    private DataTareas dataTareas;
    private JPanel panelTareas;

    public TareasView() {
        dataTareas = new DataTareas();
        setTitle("Tareas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelControles = new JPanel();
        JButton btnNuevaTarea = new JButton("Tarea Nueva");
        JButton btnEliminarTarea = new JButton("Eliminar Tareas");
        panelControles.add(btnNuevaTarea);
        panelControles.add(btnEliminarTarea);
        add(panelControles, BorderLayout.NORTH);

        // Panel de tareas
        panelTareas = new JPanel();
        panelTareas.setLayout(new BoxLayout(panelTareas, BoxLayout.Y_AXIS));
        cargarTareasEnVista();
        add(panelTareas, BorderLayout.CENTER);

        btnNuevaTarea.addActionListener(e -> abrirFormularioNuevaTarea());
        btnEliminarTarea.addActionListener(e -> abrirFormularioEliminarTarea());

        setVisible(true);
    }

    private void cargarTareasEnVista() {
        panelTareas.removeAll();
        ArrayList<Tarea> tareas = dataTareas.getListaTareas();
        for (Tarea tarea : tareas) {
            JPanel tareaPanel = crearPanelTarea(tarea);
            panelTareas.add(tareaPanel);
        }
        panelTareas.revalidate();
        panelTareas.repaint();
    }

    private JPanel crearPanelTarea(Tarea tarea) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));
        panel.add(new JLabel(tarea.getTitulo()));
        panel.add(new JLabel(tarea.getDescripcion()));
        panel.add(new JLabel(tarea.getFechaLimite()));
        panel.add(new JLabel(tarea.getEstado()));
        return panel;
    }

    private void abrirFormularioNuevaTarea() {
        NuevaTareaView nuevaTareaView = new NuevaTareaView(this);
        nuevaTareaView.setVisible(true);
    }

    private void abrirFormularioEliminarTarea() {
        EliminarTareaView eliminarTareaView = new EliminarTareaView(this);
        eliminarTareaView.setVisible(true);
    }

    public void actualizarVista() {
        cargarTareasEnVista();
    }

    public DataTareas getDataTareas() {
        return dataTareas;
    }
}