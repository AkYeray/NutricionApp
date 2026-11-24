
package nutricionalappfx.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import nutricionalappfx.NutricionalAppFX;
import nutricionalappfx.dominio.pojo.Colaborador;

/**
 * FXML Controller class
 *
 * @author Angel
 */
public class FXMLPrincipalController implements Initializable {
    
    private Colaborador colaborador;    
    @FXML
    private Label lbNombre;
    @FXML
    private Label lbRoll;
/**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void inicializadorInformacion(Colaborador colaborador){
        this.colaborador = colaborador;
        mostrarInfoPantalla();
    }
    
    private void mostrarInfoPantalla(){
        if(colaborador != null) {
            lbNombre.setText("Bienvenido(a)" +colaborador.toString());
            lbRoll.setText("Rol:" + colaborador.getRol());
        }
    }
    
    private void handleAminPacientes(ActionEvent event) {
        try{
            Stage escenario = new Stage();
            FXMLLoader loader = new FXMLLoader(NutricionalAppFX.class.getResource("vista/FXMLAdminPacienteController.fxml"));
            Parent vista = loader.load();
            FXMLAdminPacineteController controlador = loader.getController();
            controlador.inicializarInformacion(colaborador.getIdColaborador());
            Scene escena = new Scene(vista);
            escenario.setScene(escena);
            escenario.setTitle("Administrador de pacientes");
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.showAndWait();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
