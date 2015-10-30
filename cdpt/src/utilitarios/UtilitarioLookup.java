package utilitarios;

import fabricas.servicoremoto.ServicoRemotoFactory;
import interfaces.servicoremoto.ServicoRemoto;
import java.rmi.RemoteException;

/**
 *
 * @author MarceloSantos
 */
public class UtilitarioLookup {
    public static ServicoRemoto ObtenhaServicoRemoto(){
        return ServicoRemotoFactory.getInstanciaSolitaria().FabriqueServico();
    }
}
