package tarefas;

import fabricas.fachadas.FabricaFachadas;
import interfaces.fachadas.IFachadaProduto;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarceloSantos
 */
public class ControladorCadastroProduto {
    public void CarregueProduto(){
        IFachadaProduto fachada = FabricaFachadas.FabriqueFachadaProduto();
        try {
            fachada.ObtenhaPorCodigo(1);
        } catch (RemoteException ex) {
            Logger.getLogger(ControladorCadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
