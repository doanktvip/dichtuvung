/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.services;

import com.nvd.pojo.TiengViet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DOAN
 */
public class TimKiemTiengViet extends TimKiem<TiengViet>{

    @Override
    public PreparedStatement getPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareCall("SELECT * FROM tiengviet WHERE LOWER(tuvungtiengviet) = LOWER(?)");
    }

    @Override
    public void getStm(PreparedStatement stm, String key) throws SQLException {
        stm.setString(1, key);
    }

    @Override
    public List<TiengViet> getResultSet(ResultSet rs) throws SQLException {
        List<TiengViet> l=new ArrayList<>();
        while(rs.next()){
            int id =rs.getInt("idtiengviet");
            String tuVung=rs.getString("tuvungtiengviet");
            TiengViet tv=new TiengViet(id, tuVung);
            l.add(tv);
        }
        return l;
    }

    @Override
    public PreparedStatement getPreparedStatementIdTiengAnh(Connection conn) throws SQLException {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public void getStm1(PreparedStatement stm, int key) throws SQLException {
        stm.setInt(1, key);
    }

    @Override
    public PreparedStatement getPreparedStatementIdTiengViet(Connection conn) throws SQLException {
        return conn.prepareCall("SELECT * FROM tiengviet WHERE idtiengviet = ?");
    }
    
}
