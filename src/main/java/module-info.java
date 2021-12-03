module me.loule.decimaltobinary {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.decimaltobinary to javafx.fxml;
    exports me.loule.decimaltobinary;

    exports me.loule.decimaltobinary.controller;
    opens me.loule.decimaltobinary.controller to javafx.fxml;

    exports me.loule.decimaltobinary.model;
    opens me.loule.decimaltobinary.model to javafx.fxml;
}