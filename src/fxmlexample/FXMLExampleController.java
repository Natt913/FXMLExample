//Nathalie Crespo
//Code taken from Oracle to complete this tutorial.

package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {
  @FXML private Text actiontarget;

  @FXML protected void handleSubmitButtonAction(ActionEvent event) {
    actiontarget.setText("Database not setup, sorry~");
  }

}