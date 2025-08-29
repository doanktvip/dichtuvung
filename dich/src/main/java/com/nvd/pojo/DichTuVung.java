/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.pojo;


/**
 *
 * @author DOAN
 */
public class DichTuVung {
    private int id;
    private TiengAnh tiengAnh;
    private TiengViet tiengViet;

    public DichTuVung(int id, TiengAnh tiengAnh, TiengViet tiengViet) {
        this.id = id;
        this.tiengAnh = tiengAnh;
        this.tiengViet = tiengViet;
    }

    public DichTuVung(TiengAnh tiengAnh, TiengViet tiengViet) {
        this.tiengAnh = tiengAnh;
        this.tiengViet = tiengViet;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tiengAnh
     */
    public TiengAnh getTiengAnh() {
        return tiengAnh;
    }

    /**
     * @param tiengAnh the tiengAnh to set
     */
    public void setTiengAnh(TiengAnh tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    /**
     * @return the tiengViet
     */
    public TiengViet getTiengViet() {
        return tiengViet;
    }

    /**
     * @param tiengViet the tiengViet to set
     */
    public void setTiengViet(TiengViet tiengViet) {
        this.tiengViet = tiengViet;
    }

    
}
