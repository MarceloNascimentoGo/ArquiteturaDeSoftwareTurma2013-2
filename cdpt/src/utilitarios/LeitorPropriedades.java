package utilitarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author MarceloSantos
 */
public class LeitorPropriedades {
    public static Properties getPropriedades() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("configuracoes.sistemaaula.properties");
        props.load(file);
        return props;
    }
}
