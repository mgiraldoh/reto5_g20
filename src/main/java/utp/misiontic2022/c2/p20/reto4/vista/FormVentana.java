package utp.misiontic2022.c2.p20.reto4.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import utp.misiontic2022.c2.p20.reto4.modelo.dao.ArmarMatrices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Container;
import java.awt.FlowLayout;

public class FormVentana extends ArmarMatrices {

    JFrame frame;
    JTable tabla_1, tabla_2, tabla_3 = new JTable();
    JButton btn_1, btn_2, btn_3;

    Container contenedor;
    JButton boton;

    public FormVentana() throws Exception {
        initFormVentana();
    }

    private void initFormVentana() throws SQLException {

        frame = new JFrame("Reto 5 - Grupo 20");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // aparece Centrado

        contenedor = frame.getContentPane();
        contenedor.setLayout(new FlowLayout());

        boton = new JButton("Ejecutar consultas");
        boton.addActionListener(new Manejador());
        contenedor.add(boton);
        System.out.println("Adicionado BOTON");
    }

    private class Manejador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object[] options = { "Req -3", "Req-2", "Req-1" };

            JScrollPane panel = new JScrollPane(); // para insertar la Jtabla

            int opcion = JOptionPane.showOptionDialog(contenedor, "Cuál Requerimiento desea Ejecutar?",
                    "SQLite de Proyectos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[2]) + 1;
            System.out.println(opcion); // numeracion invertida

            // int opcion = 3;
            switch (opcion) {
                case 3: // req_1
                    String[] titulos_1 = { "Nombre", "Primer Apellido", "Segundo Apellido", "Salario" };
                    try {
                        tabla_1 = new JTable(listar_1(), titulos_1);
                    } catch (SQLException e3) {
                        // TODO Auto-generated catch block
                        e3.printStackTrace();
                    }

                    panel.add(tabla_1);
                    panel.setViewportView(tabla_1);
                    frame.getContentPane().add(panel, JOptionPane.CENTER_ALIGNMENT);
                    frame.setVisible(true);
                    break;
                case 2: // req_2
                    String[] titulos_2 = { "Nombre" };
                    try {
                        tabla_2 = new JTable(listar_2(), titulos_2);
                    } catch (SQLException e2) {
                        // TODO Auto-generated catch block
                        e2.printStackTrace();
                    }
                    panel.add(tabla_2);
                    panel.setViewportView(tabla_2);
                    frame.getContentPane().add(panel, JOptionPane.CENTER_ALIGNMENT);
                    frame.setVisible(true);
                    break;
                case 1: // req_3
                    String[] titulos_3 = { "Cargo", "Promedio de Salario" };
                    try {
                        tabla_3 = new JTable(listar_3(), titulos_3);
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    panel.add(tabla_3);
                    panel.setViewportView(tabla_3);
                    frame.getContentPane().add(panel, JOptionPane.CENTER_ALIGNMENT);
                    frame.setVisible(true);
                    break;
            }
        }
    }
}
