package view;

import model.Tarea;

import javax.swing.*;
import java.awt.*;

public class NuevaTareaView extends JFrame {


        private TareasView tareasView;

        public NuevaTareaView(TareasView tareasView) {
            this.tareasView = tareasView;
            setTitle("Nueva Tarea");
            setSize(400, 300);
            setLayout(new GridLayout(5, 2));

            // Formulario
            JLabel ltitulo = new JLabel("Título:");
            JTextField txtTitulo = new JTextField();
            JLabel lblDescripcion = new JLabel("Descripción:");
            JTextField txtDescripcion = new JTextField();
            JLabel lblFechaLimite = new JLabel("Fecha límite:");
            JTextField txtFechaLimite = new JTextField();
            JLabel lblEstado = new JLabel("Estado:");
            JComboBox<String> cmbEstado = new JComboBox<>(new String[]{"Pendiente", "En progreso", "Completado"});
            JButton btnAgregar = new JButton("Agregar");

            add(ltitulo);
            add(txtTitulo);
            add(lblDescripcion);
            add(txtDescripcion);
            add(lblFechaLimite);
            add(txtFechaLimite);
            add(lblEstado);
            add(cmbEstado);
            add(btnAgregar);

            // Acción del botón
            btnAgregar.addActionListener(e -> {
                String titulo = txtTitulo.getText();
                String descripcion = txtDescripcion.getText();
                String fechaLimite = txtFechaLimite.getText();
                String estado = (String) cmbEstado.getSelectedItem();

                Tarea nuevaTarea = new Tarea(titulo, descripcion, fechaLimite, estado);
                tareasView.getDataTareas().agregarTarea(nuevaTarea);
                tareasView.actualizarVista();
                dispose();
            });
        }
    }

