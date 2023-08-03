/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exception.MovieException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.BerandaPage;
import view.MainWindow;
import view.SeatPage;

/**
 *
 * @author ariqhikari
 */
public class MainWindowController {
    private BerandaPage berandaPage;
    private SeatPage seatPage;

    public void setBerandaPage(BerandaPage berandaPage) {
        this.berandaPage = berandaPage;
    }

    public void setSeatPage(SeatPage seatPage) {
        this.seatPage = seatPage;
    }
    
    
    
    public void tampilHalamanLogin(MainWindow window) {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(window.getPanelLogin());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
    }
    
     public void tampilHalamanBeranda(MainWindow window)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(berandaPage.getPanelBeranda());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        try {
            berandaPage.loadDatabase();
        } catch (SQLException ex) {
         
        } catch (MovieException ex) {
        
        } catch (IOException ex) {
            
        }
    }
     
     public void tampilHalamanKursi(MainWindow window)  {
        // membersihkan main panel
        window.getPanelMain().removeAll();
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
        
        // tambah panel baru
        window.getPanelMain().add(seatPage.getPanelSeat());
        window.getPanelMain().repaint();
        window.getPanelMain().revalidate();
    }
}
