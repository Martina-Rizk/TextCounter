package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCount;

    @FXML
    private TextArea txtArea;

    @FXML
    private Label lblLines;

    @FXML
    private Label lblWords;

    @FXML
    private Label lblChars;

    @FXML
    private TextField txtLines;

    @FXML
    private TextField txtWords;

    @FXML
    private TextField txtChars;

    @FXML
    void btnCountClicked(MouseEvent event) {
        txtLines.setText(String.valueOf(txtArea.getText().split("\n").length));
        txtWords.setText(String.valueOf(txtArea.getText().split("\\s").length));
        txtChars.setText(String.valueOf(txtArea.getLength()));
    }

    @FXML
    void initialize() {
        assert btnCount != null : "fx:id=\"btnCount\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblLines != null : "fx:id=\"lblLines\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblWords != null : "fx:id=\"lblWords\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblChars != null : "fx:id=\"lblChars\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtLines != null : "fx:id=\"txtLines\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtWords != null : "fx:id=\"txtWords\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtChars != null : "fx:id=\"txtChars\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
