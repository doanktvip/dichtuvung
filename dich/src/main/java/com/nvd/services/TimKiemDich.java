/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.services;

import com.nvd.pojo.DichTuVung;
import com.nvd.pojo.TiengAnh;
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
public class TimKiemDich extends TimKiem<DichTuVung>{

    @Override
    public PreparedStatement getPreparedStatement(Connection conn) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getStm(PreparedStatement stm, String key) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DichTuVung> getResultSet(ResultSet rs) throws SQLException {
        List<DichTuVung> l=new ArrayList<>();
        while(rs.next()){
            int id=rs.getInt("iddichtuvung");
            TiengAnh tiengAnh=new TiengAnh(rs.getInt("idtienganh"));
            TiengViet tiengViet=new TiengViet(rs.getInt("idtiengviet"));
            DichTuVung d=new DichTuVung(id, tiengAnh, tiengViet);
            l.add(d);
        }
        return l;
    }

    @Override
    public PreparedStatement getPreparedStatementIdTiengAnh(Connection conn) throws SQLException {
        return conn.prepareCall("SELECT * FROM dichtuvung WHERE idtienganh = ?");
    }

    @Override
    public void getStm1(PreparedStatement stm, int key) throws SQLException {
        stm.setInt(1, key);
    }

    @Override
    public PreparedStatement getPreparedStatementIdTiengViet(Connection conn) throws SQLException {
        return conn.prepareCall("SELECT * FROM dichtuvung WHERE idtiengviet = ?");
    }

}
