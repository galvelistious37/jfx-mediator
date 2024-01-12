module com.johnny.pack.age.jfxmediator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.johnny.pack.age.jfxmediator.mediator to javafx.fxml;
    exports com.johnny.pack.age.jfxmediator.mediator;
}