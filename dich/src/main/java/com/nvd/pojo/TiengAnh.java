/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.pojo;

/**
 *
 * @author DOAN
 */
public class TiengAnh {
    private int id;
    private String tuVung;

    public TiengAnh(int id, String tuVung) {
        this.id = id;
        this.tuVung = tuVung;
    }

    public TiengAnh(int id) {
        this.id = id;
    }
    
    public TiengAnh(String tuVung) {
        this.tuVung = tuVung;
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
     * @return the tuVung
     */
    public String getTuVung() {
        return tuVung;
    }

    /**
     * @param tuVung the tuVung to set
     */
    public void setTuVung(String tuVung) {
        this.tuVung = tuVung;
    }
    
}
