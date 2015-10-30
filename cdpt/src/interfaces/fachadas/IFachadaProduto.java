package interfaces.fachadas;

import dominioproblema.Produto;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author MarceloSantos
 */
public interface IFachadaProduto extends Remote {
    public Produto ObtenhaPorCodigo(long codigo) throws RemoteException;
}
