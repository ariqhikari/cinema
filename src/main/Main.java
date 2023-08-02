/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import database.CinemaDB;
import entity.Movie;
import exception.MovieException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import service.MovieDao;
import view.MovieView;

/**
 *
 * @author ariqhikari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, MovieException {
//        CinemaDB.getConnection();
//        MovieDao dao = CinemaDB.getMovie();
//        
//        // testing select list movie
//        List<Movie> list = dao.selectAllMovie();
//        
//        for(Movie movie : list) {
//            System.out.println("ID Movie       : " + movie.getId());
//            System.out.println("Judul Movie    : " + movie.getTitle());
//            System.out.println("");
//        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MovieView view = new MovieView();
                    view.loadDatabase();
                    view.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MovieException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
