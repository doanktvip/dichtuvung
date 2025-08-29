/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.units;

import com.nvd.services.TimKiemDich;
import com.nvd.services.TimKiemTiengAnh;
import com.nvd.services.TimKiemTiengViet;
import com.nvd.services.UpdateDichTuVung;
import com.nvd.services.UpdateTiengAnh;
import com.nvd.services.UpdateTiengViet;

/**
 *
 * @author DOAN
 */
public class Configs {
    public static final TimKiemTiengAnh timKiemTiengAnh=new TimKiemTiengAnh();
    public static final TimKiemDich timKiemDich=new TimKiemDich();
    public static final TimKiemTiengViet timKiemTiengViet=new TimKiemTiengViet();
    public static final UpdateDichTuVung updateDichTuVung =new UpdateDichTuVung();
    public static final UpdateTiengAnh updateTiengAnh=new UpdateTiengAnh();
    public static final UpdateTiengViet updateTiengViet=new UpdateTiengViet();
}
