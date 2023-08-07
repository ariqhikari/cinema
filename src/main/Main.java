package main;

import exception.MovieException;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

import view.MainWindow;

public class Main {

    public static void main(String[] args) throws SQLException, MovieException {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow view = new MainWindow();
                view.setVisible(true);
            }
        });
    }
}
