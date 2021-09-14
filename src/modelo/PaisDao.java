/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Envy
 */
public class PaisDao {
    
    Connection con;
    ConexionBD cn = new ConexionBD();
    PreparedStatement ps;
    ResultSet rs;

    
    
    public void consultapaises(JComboBox pais){
        
        String sql = "select nombre from pais";
        try {
            con = cn.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pais.addItem(rs.getString("nombre"));
                
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        
        
        
}
    
    
    
    
}

