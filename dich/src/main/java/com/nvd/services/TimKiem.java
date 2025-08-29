/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.services;

import com.nvd.units.JdbcConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DOAN
 */
public abstract class TimKiem<T> {

    public abstract PreparedStatement getPreparedStatement(Connection conn) throws SQLException;

    public abstract PreparedStatement getPreparedStatementIdTiengAnh(Connection conn) throws SQLException;

    public abstract PreparedStatement getPreparedStatementIdTiengViet(Connection conn) throws SQLException;

    public abstract void getStm(PreparedStatement stm, String key) throws SQLException;

    public abstract void getStm1(PreparedStatement stm, int key) throws SQLException;

    public abstract List<T> getResultSet(ResultSet rs) throws SQLException;

    public List<T> DanhSachTuVung(String key) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        PreparedStatement stm = this.getPreparedStatement(conn);
        getStm(stm, key);
        return this.getResultSet(stm.executeQuery());
    }

    public List<T> DanhSachIdTiengAnh(int num) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        PreparedStatement stm = this.getPreparedStatementIdTiengAnh(conn);
        getStm1(stm, num);
        return this.getResultSet(stm.executeQuery());
    }

    public List<T> DanhSachIdTiengViet(int num) throws SQLException {
        Connection conn = JdbcConnector.getInstance().connect();
        PreparedStatement stm = this.getPreparedStatementIdTiengViet(conn);
        getStm1(stm, num);
        return this.getResultSet(stm.executeQuery());
    }
}
