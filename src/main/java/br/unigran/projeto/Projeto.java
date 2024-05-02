package br.unigran.projeto;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author andre
 */
public class Projeto {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        UIManager.setLookAndFeel(new FlatDarculaLaf());
        System.out.println("Hello World!");
    }
}
