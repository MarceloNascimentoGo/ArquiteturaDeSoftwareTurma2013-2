package fachadas;

import dominioproblema.Produto;
import interfaces.fachadas.IFachadaProduto;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author MarceloSantos
 */
public class FachadaProduto 
extends UnicastRemoteObject
implements IFachadaProduto,Serializable {
    
    public FachadaProduto() throws RemoteException{
    
    }
    public Produto ObtenhaPorCodigo(long codigo) throws RemoteException{
       Produto produto = new Produto();
       return produto;
    }
    
}
