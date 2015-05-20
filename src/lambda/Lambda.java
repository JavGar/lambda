/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.awt.GridBagLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.Element;
import javax.swing.text.html.ListView;

/**
 *
 * @author HectorJavier
 */
public class Lambda extends JFrame{
    //Para el archivo
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    List<Instruccion> instrucciones = null;
    //Para la interfaz
    ListView lista;
    JScrollPane programa;
    public Lambda(File file){
        super("Lambda");
        setLocation(100, 100);
        setSize(200, 100);
        setLayout(new GridBagLayout());
        
        //inicializa componentes
        instrucciones = new ArrayList<>();
  //      cargarArchivo(file);
//        lista = new ListView((Element) instrucciones);
        show();
    }
    
    private void cargarArchivo(File file){
        try {
            archivo = file;
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                instrucciones.add(new Instruccion(linea.substring(0,1), linea.substring(2,4), linea.length()>4 ? Integer.parseInt(linea.substring(5)) : 0));
            }
        } catch (IOException | NumberFormatException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
            }
        }
    }
}
