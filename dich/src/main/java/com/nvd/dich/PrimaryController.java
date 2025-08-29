package com.nvd.dich;

import com.nvd.pojo.DichTuVung;
import com.nvd.pojo.TiengAnh;
import com.nvd.pojo.TiengViet;
import com.nvd.units.Configs;
import com.nvd.units.MyStage;
import com.nvd.units.themes.Themes;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class PrimaryController implements Initializable {

    @FXML
    private TextArea txtDich;
    @FXML
    private TextArea txtDuocDich;
    @FXML
    private Text txtTA;
    @FXML
    private Text txtTV;
    @FXML
    private ComboBox<Themes> cbThemes;
    
    public void handleDoiNgonNgu(ActionEvent event) {
        String a = this.txtTA.getText();
        this.txtTA.setText(this.txtTV.getText());
        this.txtTV.setText(a);
        if(this.cbThemes.getValue()==Themes.ANH){
            this.cbThemes.setValue(Themes.VIET);
        }else{
            this.cbThemes.setValue(Themes.ANH);
        }
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }

    public void handleDich(ActionEvent event) throws SQLException {
        if (this.txtTA.getText().equals("Tiếng anh")) {
            int i = -1;
            for (TiengAnh ta : Configs.timKiemTiengAnh.DanhSachTuVung(this.txtDuocDich.getText())) {
                i = ta.getId();
            }
            String s = "";
            for (DichTuVung d : Configs.timKiemDich.DanhSachIdTiengAnh(i)) {
                int j = d.getTiengViet().getId();
                for (TiengViet tv : Configs.timKiemTiengViet.DanhSachIdTiengViet(j)) {
                    s += tv.getTuVung() + "\n";
                }
            }
            this.txtDich.setText(s);
        } else {
            int i = -1;
            for (TiengViet tv : Configs.timKiemTiengViet.DanhSachTuVung(this.txtDuocDich.getText())) {
                i = tv.getId();
            }
            String s = "";
            for (DichTuVung d : Configs.timKiemDich.DanhSachIdTiengViet(i)) {
                int j = d.getTiengAnh().getId();
                for (TiengAnh ta : Configs.timKiemTiengAnh.DanhSachIdTiengAnh(j)) {
                    s += ta.getTuVung() + "\n";
                }
            }
            this.txtDich.setText(s);
        }
    }

    public void handleThemTuVung(ActionEvent event) throws IOException {
        MyStage.getInstance().ShowScene("secondary.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Themes.values()));
        this.cbThemes.setValue(Themes.ANH);
    }
}
