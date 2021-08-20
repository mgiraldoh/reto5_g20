package utp.misiontic2022.c2.p20.reto4.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p20.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p20.reto4.vista.VistaRequerimientosReto4;

public class ArmarMatrices extends VistaRequerimientosReto4{

    // se pasan de ArrayList a Matrices para la JTable:

    public static ControladorRequerimientos controlador = new ControladorRequerimientos();

    public String[][] listar_1() throws SQLException {
        String[][] matriz1 = { { "nombre", "Ap1", "ape2", "98" } };
        try {
            // Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido
            // sea ‘Ortiz’
            ArrayList<Requerimiento_1> punto_1 = controlador.consultarRequerimiento1();

            // System.out.println("Nombre Primer_Apellido Segundo_Apellido Salario");
            matriz1 = new String[punto_1.size()][4];
            int i = 0;
            for (Requerimiento_1 q1 : punto_1) {
             /*    System.out.printf("%s %s %s %6.1f %n", q1.getNombre(),
                 q1.getPrimer_Apellido(), q1.getSegundo_Apellido(),
                 (double)q1.getSalario());
                 */
                matriz1[i][0] = q1.getNombre();
                matriz1[i][1] = q1.getPrimer_Apellido();
                matriz1[i][2] = q1.getSegundo_Apellido();
                matriz1[i++][3] = Integer.toString(q1.getSalario());
             //   System.out.println(matriz1[i-1][0]+" "+ matriz1[i-1][1]+" "+matriz1[i-1][2]);
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return matriz1;
    }

    public String[][] listar_2() throws SQLException {
        String[][] matriz2 = { { "nombre" } };
        try {
            // Conocer el nombre en Minusculas
            ArrayList<Requerimiento_2> punto_2 = controlador.consultarRequerimiento2();

            matriz2 = new String[punto_2.size()][1];
            int i = 0;
            for (Requerimiento_2 q2 : punto_2) {
                matriz2[i++][0] = q2.getName();
            }

            return matriz2;

        } catch (Exception e) {
            System.err.println(e);
        }
        return matriz2;
    }

    public String[][] listar_3() throws SQLException {
        String[][] matriz3 = { { "jefe", "98.5" } };
        try {
            ArrayList<Requerimiento_3> punto_3 = controlador.consultarRequerimiento3();
            matriz3 = new String[punto_3.size()][2];
            int i = 0;
            for (Requerimiento_3 q3 : punto_3) {
                matriz3[i][0] = q3.getCargo();
                matriz3[i++][1] = Double.toString(q3.getSalario());
            }

            return matriz3;

        } catch (Exception e) {
            System.err.println(e);
        }
        return matriz3;
    }

}
