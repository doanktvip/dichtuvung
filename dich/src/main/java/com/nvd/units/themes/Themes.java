/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.nvd.units.themes;

import javafx.scene.Scene;

/**
 *
 * @author DOAN
 */
public enum Themes {
    ANH {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new AnhFactory());
            ThemeManager.applyTheme(scene);
        }
    }, VIET {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setThemeFactory(new VietFactory());
            ThemeManager.applyTheme(scene);
        }
    };

    public abstract void updateTheme(Scene scene);
}
