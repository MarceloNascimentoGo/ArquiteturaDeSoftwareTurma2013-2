package fabricas.fachadas;

import configuracoes.ConfiguracoesGerais;
import interfaces.fachadas.IFachadaProduto;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitarios.UtilitarioLookup;

/**
 *
 * @author MarceloSantos
 */
public class FabricaFachadas {
   public static IFachadaProduto FabriqueFachadaProduto(){
       return FabriqueFachadaProduto(false);
   }
   
    public static IFachadaProduto FabriqueFachadaProduto(boolean forcarlocal){
        
        if(forcarlocal) return FabriqueFachadaProdutoLocal();
        if(ConfiguracoesGerais.UtilizaServidorAplicacao())
            return FabriqueFachadaProdutoRemoto();
        return FabriqueFachadaProdutoLocal();
    }
    
    private static IFachadaProduto FabriqueFachadaProdutoRemoto(){
        try {
            return UtilitarioLookup.ObtenhaServicoRemoto().ObtenhaFachadaProduto();
        } catch (RemoteException ex) {
            Logger.getLogger(FabricaFachadas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static IFachadaProduto FabriqueFachadaProdutoLocal(){
        try {
            Class classe = Class.forName("fachadas.FachadaProduto");
            return (IFachadaProduto)classe.newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FabricaFachadas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FabricaFachadas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FabricaFachadas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
