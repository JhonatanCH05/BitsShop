package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan C.
 */
public class UserController implements Initializable {

    @FXML
    private PasswordField Contraseña;

    @FXML
    private TextField Usuario;

    @FXML
    private Button btnInicio;

    private boolean validarUsuario(String usuario, String contrasena) {
        return usuario.equals("User1") && contrasena.equals("password1");
    }

    @FXML
    void iniciarSesión(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); // Obtener el Stage actual
        String usuario = Usuario.getText();
        String contrasena = Contraseña.getText();

        // Lógica de validación de usuario y contraseña
        if (validarUsuario(usuario, contrasena)) {
            // Usuario y contraseña válidos, realizar acciones adicionales
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");

            // Cargar la nueva escena
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Index.fxml"));
                Parent root = loader.load();
                IndexController controller = loader.getController();
                Scene nuevaEscena = new Scene(root);

                // Cerrar la escena actual
                stage.close();

                // Mostrar la nueva escena
                Stage nuevoStage = new Stage();
                nuevoStage.setScene(nuevaEscena);
                nuevoStage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Usuario y/o contraseña inválidos, mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña inválidos");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
