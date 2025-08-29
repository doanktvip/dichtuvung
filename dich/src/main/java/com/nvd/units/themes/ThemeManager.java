/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.units.themes;

import javafx.scene.Scene;

/**
 *
 * @author DOAN
 */
public class ThemeManager {
    private static ThemeFactory themeFactory=new AnhFactory();
    public static void setThemeFactory(ThemeFactory ThemeFactory) {
        themeFactory = ThemeFactory;
    }
    public static void applyTheme(Scene scene){
         scene.getRoot().getStylesheets().clear();
         scene.getRoot().getStylesheets().add(themeFactory.getStylesheet());
    }
}
