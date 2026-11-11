
package nutricionalappfx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
}
