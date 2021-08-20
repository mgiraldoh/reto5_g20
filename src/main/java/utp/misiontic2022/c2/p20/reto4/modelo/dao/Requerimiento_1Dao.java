package utp.misiontic2022.c2.p20.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p20.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Mi código
        /*
         * select Nombre, Primer_Apellido ,Segundo_Apellido ,Salario from Lider where
         * Segundo_Apellido ="Ortiz”;
         */
        ArrayList<Requerimiento_1> salida = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String comando = "select Nombre, Primer_Apellido, Segundo_Apellido, "
                    + "Salario from Lider where Segundo_Apellido ='Ortiz'";
            Statement stm = conexion.createStatement();
            ResultSet resultado = stm.executeQuery(comando);
            
            while (resultado.next()) {
                Requerimiento_1 req_1 = new Requerimiento_1();
                req_1.setNombre(resultado.getString("Nombre"));
                req_1.setPrimer_Apellido(resultado.getString("Primer_Apellido"));
                req_1.setSegundo_Apellido(resultado.getString("Segundo_Apellido"));
                req_1.setSalario(resultado.getInt("Salario"));

                salida.add(req_1);
            }
            resultado.close();
            stm.close();

        } catch (SQLException e) {
            // si falla algo:
            System.err.println("Error en la Consulta 1" + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return salida;
    }
}