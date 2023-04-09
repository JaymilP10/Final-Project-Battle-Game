module com.example.finalprojectbattlegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectbattlegame to javafx.fxml;
    exports com.example.finalprojectbattlegame;
}