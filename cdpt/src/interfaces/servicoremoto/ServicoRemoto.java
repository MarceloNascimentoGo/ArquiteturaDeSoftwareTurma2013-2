package interfaces.servicoremoto;

import interfaces.fachadas.IFachadaProduto;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author MarceloSantos
 */
public interface ServicoRemoto extends Remote{
    //Método a ser consumido de maneira remota
    public IFachadaProduto ObtenhaFachadaProduto() throws RemoteException;
    
}
