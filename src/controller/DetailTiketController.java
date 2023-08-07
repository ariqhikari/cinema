package controller;

import entity.Movie;
import entity.Showtime;
import entity.Transaction;
import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import view.DetailTiketPage;

/**
 *
 * @author ariqhikari
 */
public class DetailTiketController {
    private Movie movie;
    private Showtime showtime;
    private Transaction transaction;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    
    public void setDetail(DetailTiketPage detailTiketPage) throws IOException {
        detailTiketPage.getjLabelTitleMovie().setText(movie.getTitle());
        
        String dateTime = getDate(new Date()) + ", " + showtime.getTime().toString();
        detailTiketPage.getjLabelDateTime().setText(dateTime);
           
        // poster
        detailTiketPage.getPanelPoster().setLayout(new CardLayout(10, 10));
        detailTiketPage.getPanelPoster().setPreferredSize(new Dimension(250, 300));
        detailTiketPage.getPanelPoster().setBackground(new java.awt.Color(0,0,0,1));

        BufferedImage icon = ImageIO.read(getClass().getResource(movie.getPoster()));              
        BufferedImage roundedPosterImage = makeRoundedCorner(icon, 20);
        Image scaledPoster = roundedPosterImage.getScaledInstance(250, 350, Image.SCALE_SMOOTH);
        ImageIcon iconPoster = new ImageIcon(scaledPoster);
        detailTiketPage.getjLabelPoster().setPreferredSize(new Dimension(250, 300));
        detailTiketPage.getjLabelPoster().setIcon(iconPoster);
        
        detailTiketPage.getjLabelKodeBooking().setText(transaction.getTransactionCode());
        detailTiketPage.getjLabelJumlahTiket().setText(transaction.getBookingSeat().size() + " Tiket");
        detailTiketPage.getjLabelKursi().setText(String.join(", ", transaction.getBookingSeat()));
    }
    
    public BufferedImage makeRoundedCorner(BufferedImage image, int cornerRadius) {
        int w = image.getWidth();
        int h = image.getHeight();
        BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = output.createGraphics();

        // This is what we want, but it only does hard-clipping, i.e. aliasing
        // g2.setClip(new RoundRectangle2D ...)
        // so instead fake soft-clipping by first drawing the desired clip shape
        // in fully opaque white with antialiasing enabled...
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius, cornerRadius));

        // ... then compositing the image on top,
        // using the white shape from above as alpha source
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(image, 0, 0, null);

        g2.dispose();

        return output;
    }
    
    public String getDate(Date date) {        
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateFormat = simpleDateFormat.format(date);
        
        return dateFormat;
    }
}
