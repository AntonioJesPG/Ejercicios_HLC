package Modelo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class AlmacenaList {
    
    public AlmacenaList(String df, ArrayList<Usuario> listaObjetos)
    {
        
            try (ObjectOutputStream oos = new ObjectOutputStream( 
                    new FileOutputStream(df))) {
                oos.writeObject(listaObjetos);
                oos.close();
            }   catch (IOException e ){System.out.println( e.getMessage());}
        
    
    }

   
}
