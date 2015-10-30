package configuracoes;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitarios.LeitorPropriedades;

/**
 *
 * @author MarceloSantos
 */
public class ConfiguracoesGerais {
    public static boolean UtilizaServidorAplicacao(){
        //try {
            //Properties props = LeitorPropriedades.getPropriedades();
            //String result = props.getProperty("servidorestahremoto");
            return true;//Boolean.valueOf(result);
        //} catch (IOException ex) {
        //    Logger.getLogger(ConfiguracoesGerais.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //return false; 
    }
    
}
