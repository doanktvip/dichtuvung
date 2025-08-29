/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.services;

import com.nvd.pojo.TiengAnh;
import com.nvd.units.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DOAN
 */
public class UpdateTiengAnh {
    public int add(TiengAnh ta) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        conn.setAutoCommit(false);
        int idTiengAnh = -1;
        try {
            String sql = "INSERT INTO tienganh(tuvungtienganh) VALUES(?)";
            PreparedStatement stm = conn.prepareCall(sql);
            stm.setString(1, ta.getTuVung());
            stm.executeUpdate();
            ResultSet r = stm.getGeneratedKeys();
            if (r.next()) {
                idTiengAnh = r.getInt(1);
            }
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        }
        return idTiengAnh;
    }
}
