/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.units.themes;

import com.nvd.dich.App;

/**
 *
 * @author DOAN
 */
public class AnhFactory implements ThemeFactory{

    @Override
    public String getStylesheet() {
        return App.class.getResource("anhstyles.css").toExternalForm();
    }
    
}
