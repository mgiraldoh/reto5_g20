package utp.misiontic2022.c2.p20.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p20.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        // System.out.println("Conocer el nombre, apellidos y salarios de los lideres
        // cuyo segundo apellido sea ‘Ortiz’");
        try {
            // Mi código
            // Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido
            // sea ‘Ortiz’
            ArrayList<Requerimiento_1> punto_1 = controlador.consultarRequerimiento1();
           // System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea 'Ortiz'");
           // System.out.println("Nombre Primer_Apellido Segundo_Apellido Salario");
            for (Requerimiento_1 q1 : punto_1) {
                System.out.printf("%s %s %s %6.1f %n", q1.getNombre(), q1.getPrimer_Apellido(), q1.getSegundo_Apellido(),
                        (double)q1.getSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            // Mi código
            // Transformaryobtenerelnombredeloslideres dondela
            // primeraletraseaenminúsculaylasdemás
            // en mayúscula
            ArrayList<Requerimiento_2> punto_2 = controlador.consultarRequerimiento2();
          //  System.out.println("Transformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");
           // System.out.println("Nombre");
            for (Requerimiento_2 q2 : punto_2) {
                System.out.printf("%s %n", q2.getName());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            // Mi código
            // Saber la suma de los salarios de todos los lideres por su ciudad de
            // residencia

            ArrayList<Requerimiento_3> punto_3 = controlador.consultarRequerimiento3();
          //  System.out.println("Saber la suma de los salarios de todos los lideres por su ciudad de residencia");
           // System.out.println("Cargo Salario");
            for (Requerimiento_3 q3 : punto_3) {
                System.out.printf("%s %f %n", q3.getCargo(), q3.getSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
