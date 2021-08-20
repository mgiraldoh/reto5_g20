package utp.misiontic2022.c2.p20.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p20.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código

        ArrayList<Requerimiento_3> salida = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String comando = "select  Cargo, avg(Salario) as Salario"        
               + " from Lider  group by Cargo having avg(salario)>500000 order by Cargo";

            Statement stm = conexion.createStatement();
            ResultSet resultado = stm.executeQuery(comando);
            while (resultado.next()) {
                Requerimiento_3 req_3 = new Requerimiento_3();
                req_3.setCargo(resultado.getString("Cargo"));
                req_3.setSalario(resultado.getDouble("Salario"));

                salida.add(req_3);
            }
            resultado.close();
            stm.close();

        } catch (SQLException e) {
            // si falla algo:
            System.err.println("Error en la Consulta 3" + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return salida;

    }
}