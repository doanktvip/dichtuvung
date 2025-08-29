package com.nvd.dich;

import com.nvd.pojo.DichTuVung;
import com.nvd.pojo.TiengAnh;
import com.nvd.pojo.TiengViet;
import com.nvd.units.Configs;
import com.nvd.units.MyAlert;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SecondaryController {

    @FXML
    private VBox vboxanh;
    @FXML
    private VBox vboxviet;

    public void handleThem(ActionEvent event) throws SQLException {
        TextField txtTa;
        TextField txtTv;
        List<Integer> lTa=new ArrayList<>();
        List<Integer> lTv=new ArrayList<>();
        for (var ta : this.vboxanh.getChildren()) {
            txtTa = (TextField) ta;
            if(txtTa.getText().equals("")){
                MyAlert.getInstance().showMsg("Vui lòng nhập giá trị");
                return;
            }
        }
        for (var tv : this.vboxviet.getChildren()) {
            txtTv = (TextField) tv;
            if(txtTv.getText().equals("")){
                MyAlert.getInstance().showMsg("Vui lòng nhập giá trị");
                return;
            }
        }
        for (var ta : this.vboxanh.getChildren()) {
            txtTa = (TextField) ta;
            lTa.add(Configs.updateTiengAnh.add(new TiengAnh(txtTa.getText())));
        }
        for (var tv : this.vboxviet.getChildren()) {
            txtTv = (TextField) tv;
            lTv.add(Configs.updateTiengViet.add(new TiengViet(txtTv.getText())));
        }
        for(int ta:lTa){
            for(int tv:lTv){
                DichTuVung dtv = new DichTuVung(new TiengAnh(ta), new TiengViet(tv));
                Configs.updateDichTuVung.add(dtv);
            }
        }
        MyAlert.getInstance().showMsg("Thêm thành công từ vựng");
    }

    public void ThemTiengAnh(ActionEvent event) {
        if (this.vboxanh.getChildren().size() < 3 && this.vboxviet.getChildren().size() == 1) {
            TextField txt = new TextField();
            this.vboxanh.getChildren().add(txt);
        }
    }

    public void ThemTiengViet(ActionEvent event) {
        if (this.vboxviet.getChildren().size() < 3 && this.vboxanh.getChildren().size() == 1) {
            TextField txt = new TextField();
            this.vboxviet.getChildren().add(txt);
        }
    }

    public void handleReset(ActionEvent event) {
        if (this.vboxanh.getChildren().size() > 1) {
            this.vboxanh.getChildren().clear();
            TextField txt = new TextField();
            this.vboxanh.getChildren().add(txt);
        }
        if (this.vboxviet.getChildren().size() > 1) {
            this.vboxviet.getChildren().clear();
            TextField txt = new TextField();
            this.vboxviet.getChildren().add(txt);
        }
        for (var c : this.vboxanh.getChildren()) {
            TextField t = (TextField) c;
            t.clear();
        }
        for (var d : this.vboxviet.getChildren()) {
            TextField t = (TextField) d;
            t.clear();
        }
    }
}
