module com.nvd.dich {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.nvd.dich to javafx.fxml;
    exports com.nvd.dich;
}
