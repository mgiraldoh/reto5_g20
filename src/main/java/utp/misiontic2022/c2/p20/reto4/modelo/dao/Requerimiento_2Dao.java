package utp.misiontic2022.c2.p20.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p20.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p20.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Mi código

        ArrayList<Requerimiento_2> salida = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String comando = "SELECT LOWER(SUBSTR(Nombre,1,1)) || " + 
            "UPPER(SUBSTR(Nombre,2,LENGTH(Nombre)) ) as Name "
                    + " from Lider";
            Statement stm = conexion.createStatement();
            ResultSet resultado = stm.executeQuery(comando);
            while (resultado.next()) {
                Requerimiento_2 req_2 = new Requerimiento_2();
                req_2.setName(resultado.getString("Name"));
                salida.add(req_2);
            }
            resultado.close();
            stm.close();

        } catch (SQLException e) {
            // si falla algo:
            System.err.println("Error en la Consulta 2" + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return salida;
    }
}