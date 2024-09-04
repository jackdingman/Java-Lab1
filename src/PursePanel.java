import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;


public class PursePanel extends JPanel {

    private Purse purse; // purse contains cash

    public PursePanel(){
        purse = new Purse();    //purse initialization
    }
    public void updatePurse(Purse purse){
        this.purse = purse;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (purse != null){
            int yPosition = 10;
            String text = " ";
            Iterator<Map.Entry<Denomination, Integer>> iterator = purse.getCash().entrySet().iterator(); // iterator which will be used to navigate through the Map. Uses getCash method to retrieve hashmap from purse.

            while (iterator.hasNext()) {
                Map.Entry<Denomination,Integer> entry = iterator.next(); // retrieves next entry
                Denomination denomination = entry.getKey();
                try{
                    for (int i = 0; i < entry.getValue(); i++) {//entry.getValue() fetches the quantity of bills of each denomination from the amount input.
                        InputStream imageStream = getClass().getClassLoader().getResourceAsStream(denomination.img()); //
                        Image image = ImageIO.read(imageStream);//reads image
                        g.drawImage(image, 300, yPosition, 200, 75, this); // draws bill or coin
                        yPosition = yPosition + 30;
                    }
                    yPosition = yPosition + 30;

                } catch (Exception e){
                    e.printStackTrace();//handles exception for missing image
                }
                //yPosition = yPosition + 80;
            }

        }

    }
}