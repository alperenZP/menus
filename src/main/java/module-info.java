module com.example.menus2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.menus2 to javafx.fxml;
    exports com.example.menus2;
}