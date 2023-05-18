package javax;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;
    public Text txtOut;
    public ArrayList<String> emailList = new ArrayList<>();
    public ArrayList<String> phoneList = new ArrayList<>();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        try {
            if (emailList.contains(email))
                throw new Exception("Email da ton tai");
            if (phoneList.contains(phone))
                throw new Exception("Phone da ton tai");
            emailList.add(email);
            phoneList.add(phone);
            String sv = name + "\n" + email + "\n" + phone;
            txtOut.setText(txtOut.getText() + sv);
            txtName.clear();
            txtEmail.clear();
            txtPhone.clear();
        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }


    }
}
