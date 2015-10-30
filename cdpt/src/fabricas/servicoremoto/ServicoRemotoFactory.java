package fabricas.servicoremoto;

import interfaces.servicoremoto.ServicoRemoto;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author MarceloSantos
 */
public class ServicoRemotoFactory {
    
    //Implementação de singleton (instancia unica da classe)
    private static ServicoRemotoFactory instanciaSolitaria = new ServicoRemotoFactory();

    //Acessor do Singleton
    public static ServicoRemotoFactory getInstanciaSolitaria() {
        return instanciaSolitaria;
    }
    //Evita que uma outra instancia seja cirada.
    private ServicoRemotoFactory(){}
    
    public ServicoRemoto FabriqueServico() {
        try {
            return (ServicoRemoto) Naming.lookup("rmi://localhost/ServidorAnhanguera");
        } catch (NotBoundException | MalformedURLException | RemoteException e){
            return null;
        }
    }
}
