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
import view.MainWindow;

public class Main {

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
                MainWindow view = new MainWindow();
                view.setVisible(true);
            }
        });
    }
}
