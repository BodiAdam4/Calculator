/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamologep;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 *
 * @author Hanry
 */
public class FXMLDocumentController implements Initializable {
    public String number="";
    public double res=0;
    public int muvelet;         
    @FXML
    TextArea result;
    
    @FXML
    private void plus(ActionEvent event) {
    muvelet=0;
    res = Double.valueOf(number);
    number="";
    result.setText(number+"+");
    }
    
    @FXML
    private void minus(ActionEvent event) {
    muvelet=1;
    res = Double.valueOf(number);
    number="";
    result.setText(number+"-");
    }
    
    @FXML
    private void times(ActionEvent event) {
    muvelet=2;
    res = Double.valueOf(number);
    number="";
    result.setText(number+"*");
    }
    
    @FXML
    private void divide(ActionEvent event) {
    muvelet=3;
    res = Double.valueOf(number);
    number="";
    result.setText(number+"/");
    }
    
    @FXML
    private void C(ActionEvent event) {
    number="";
    result.setText("0");
    }
    
    @FXML
    private void point(ActionEvent event) {
    number = number+".";
    result.setText(number);
    }
    
    @FXML
    private void equal(ActionEvent event) {
    switch(muvelet){
        case 0 : res = res + Double.valueOf(number);
            break;
        case 1 : res = res - Double.valueOf(number);
            break;
        case 2 : res = res * Double.valueOf(number);
            break;
        case 3 : res = res / Double.valueOf(number); 
            break;
    }
    number="";
    result.setText("="+res);
    }
    
    @FXML
    private void zero(ActionEvent event) {
    number = number+"0";
    result.setText(number);
    }
    
    @FXML
    private void one(ActionEvent event) {
    number = number+"1";
    result.setText(number);
    }
    
    @FXML
    private void two(ActionEvent event) {
    number = number+"2";
    result.setText(number);
    }
    
    @FXML
    private void three(ActionEvent event) {
    number = number+"3";
    result.setText(number);
    }
    
    @FXML
    private void four(ActionEvent event) {
    number = number+"4";
    result.setText(number);
    }
    
    @FXML
    private void five(ActionEvent event) {
    number = number+"5";
    result.setText(number);
    }
    
    @FXML
    private void six(ActionEvent event) {
    number = number+"6";
    result.setText(number);
    }
    
    @FXML
    private void seven(ActionEvent event) {
    number = number+"7";
    result.setText(number);
    }
    
    @FXML
    private void eight(ActionEvent event) {
    number = number+"8";
    result.setText(number);
    }
    
    @FXML
    private void nine(ActionEvent event) {
    number = number+"9";
    result.setText(number);
    }
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
