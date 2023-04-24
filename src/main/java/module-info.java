module com.zd5_lekunovich {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zd5_lekunovich to javafx.fxml;
    exports com.zd5_lekunovich;
}