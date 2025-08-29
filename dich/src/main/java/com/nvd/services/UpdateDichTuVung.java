/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.services;

import com.nvd.pojo.DichTuVung;
import com.nvd.units.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DOAN
 */
public class UpdateDichTuVung {

    public void add(DichTuVung dtv) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        conn.setAutoCommit(false);
        try {
//            String sql = "INSERT INTO tienganh(tuvungtienganh) VALUES(?)";
//            PreparedStatement stm = conn.prepareCall(sql);
//            stm.setString(1, dtv.getTiengAnh().getTuVung());
//            stm.executeUpdate();
//            ResultSet r = stm.getGeneratedKeys();
//            if (r.next()) {
//                dtv.getTiengAnh().setId(r.getInt(1));
//            }
//
//            sql = "INSERT INTO tiengviet(tuvungtiengviet) VALUES(?)";
//            stm = conn.prepareCall(sql);
//            stm.setString(1, dtv.getTiengViet().getTuVung());
//            stm.executeUpdate();
//            ResultSet r1 = stm.getGeneratedKeys();
//            if (r1.next()) {
//                dtv.getTiengViet().setId(r1.getInt(1));
//
//            }
            String sql = "INSERT INTO dichtuvung(idtienganh, idtiengviet) VALUES(?, ?)";

            PreparedStatement stm = conn.prepareCall(sql);
            stm.setInt(1, dtv.getTiengAnh().getId());
            stm.setInt(2, dtv.getTiengViet().getId());
            stm.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        }
    }
}
