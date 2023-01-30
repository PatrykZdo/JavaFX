package com.example.zaczynamyfx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements  Initializable{
    @FXML
    private Slider glosnosc;
    @FXML
    private Button cancleButton;
    @FXML
    private Button saveButton;

    @FXML
    private Button godzinaUp;
    @FXML
    private Button minutaUp;
    @FXML
    private Button godzinaDown;
    @FXML
    private Button minutaDown;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private Label czas;
    @FXML
    private CheckBox pon;
    @FXML
    private CheckBox wt;
    @FXML
    private CheckBox sr;
    @FXML
    private CheckBox czw;
    @FXML
    private CheckBox pt;
    @FXML
    private CheckBox sb;
    @FXML
    private CheckBox nd;

    @FXML
    private RadioButton powtarzaj;
    @FXML
    private TextField nazwa;

    int poziomGlosnosci;
    int godzina=0;
    int minuta=0;

    Stage stage;

    public void logout(ActionEvent event){
        stage=(Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    public void save(ActionEvent event){
        stage=(Stage) scenePane.getScene().getWindow();

        if(pon.isSelected() || wt.isSelected() || sr.isSelected() || czw.isSelected() || pt.isSelected() || sb.isSelected() || nd.isSelected()) {

            System.out.println(nazwa.getText());

            if (godzina > 9 && minuta > 9) {
                System.out.println("Godzina " + godzina + ":" + minuta);
            } else if (godzina < 10 && minuta > 9) {
                System.out.println("Godzina 0" + godzina + ":" + minuta);
            } else if (godzina > 9 && minuta < 10) {
                System.out.println("Godzina " + godzina + ":0" + minuta);
            } else if (godzina < 10 && minuta < 10) {
                System.out.println("Godzina 0" + godzina + ":0" + minuta);
            }


            if (pon.isSelected()) {
                System.out.print("Poniedziałek, ");
            }
            if (wt.isSelected()) {
                System.out.print("Wtorek, ");
            }
            if (sr.isSelected()) {
                System.out.print("Sroda, ");
            }
            if (czw.isSelected()) {
                System.out.print("Czwartek, ");
            }
            if (pt.isSelected()) {
                System.out.print("Piatek, ");
            }
            if (sb.isSelected()) {
                System.out.print("Sobota, ");
            }
            if (nd.isSelected()) {
                System.out.print("Niedziela, ");
            }
            System.out.println();


            if (powtarzaj.isSelected()) {
                System.out.println("Powtarzaj budzik co tydzień!");
            } else {
                System.out.println("Budzik jednorazowy!");
            }


            System.out.println("Glosnosc dzwieku ustawiona na " + poziomGlosnosci + "%");
        }
        else{
            System.out.println("Budzik nie został ustawiony ponieważ nie zostały wybradne dni(dzień) w który ma grać.");
        }

        stage.close();
    }
    public void zwiekszGodzine(ActionEvent event){
        godzina++;
        if(godzina>23){
            godzina=0;
        }
        if(godzina>9 && minuta>9 ) {
            czas.setText(Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina<10 && minuta>9) {
            czas.setText("0"+Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina>9 && minuta<10) {
            czas.setText(Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }else if (godzina<10 && minuta<10) {
            czas.setText("0"+Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }
    }

    public void zwiekszMinute(ActionEvent event){
        minuta++;
        if(minuta>59){
            minuta=0;
        }
        if(godzina>9 && minuta>9 ) {
            czas.setText(Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina<10 && minuta>9) {
            czas.setText("0"+Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina>9 && minuta<10) {
            czas.setText(Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }else if (godzina<10 && minuta<10) {
            czas.setText("0"+Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }
    }

    public void zmniejszGodzine(ActionEvent event){
        godzina--;
        if(godzina<0){
            godzina=23;
        }
        if(godzina>9 && minuta>9 ) {
            czas.setText(Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina<10 && minuta>9) {
            czas.setText("0"+Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina>9 && minuta<10) {
            czas.setText(Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }else if (godzina<10 && minuta<10) {
            czas.setText("0"+Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }
    }

    public void zmniejszMinute(ActionEvent event){
        minuta--;
        if(minuta<0){
            minuta=59;
        }
        if(godzina>9 && minuta>9 ) {
            czas.setText(Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina<10 && minuta>9) {
            czas.setText("0"+Integer.toString(godzina) + ":" + Integer.toString(minuta));
        } else if (godzina>9 && minuta<10) {
            czas.setText(Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }else if (godzina<10 && minuta<10) {
            czas.setText("0"+Integer.toString(godzina) + ":0" + Integer.toString(minuta));
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        czas.setText("0"+Integer.toString(godzina)+":0"+Integer.toString(minuta));
        poziomGlosnosci=75;
        glosnosc.setValue(poziomGlosnosci);
        glosnosc.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                poziomGlosnosci=(int) glosnosc.getValue();
            }
        });
    }
}