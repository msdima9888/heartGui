import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
/*Месяц валялось на диске, но на 14 февраля не пригодилось :С */
public class Heart {
    static class Window extends JFrame{
        public Window(int width, int heigth ) throws IOException {
            setTitle("I love you");
            setSize(width,heigth);
            setResizable(false);
            setLocationRelativeTo(null);
            URL url = new URL("http://iconshow.me/media/images/Mixed/small-n-flat-icon/png/512/heart.png");
            BufferedImage c = ImageIO.read(url);
            ImageIcon image = new ImageIcon(c);
            setIconImage(image.getImage());


        }

        public void doVisible(){
            setVisible(true);
        }

        @Override public void doLayout() {
            super.doLayout();
            SwingUtilities.invokeLater(()->
            {
                repaint();
            });
        }}

    static   class RedHeart extends Canvas{
        int x;
        int y;
        int a;

        public RedHeart(int x, int y , int a){
            this.x = x;
            this.y = y;
            this.a = a;

        }
        @Override
        public void paint(Graphics g){
            g.setColor(Color.RED);
            int c = (int) Math.sqrt(2*a*a);

            int x1 = (x / 2) - c;

            int y1 = y / 2;
                    g.setFont(new Font("Arial", Font.BOLD, 125));
                    g.drawString(/*I*/"Я", (x/2) - 45, (y/2)-c-105);

            int x2 = x / 2;
            int y2 = (y / 2) - c;

            int x1Final = (x / 2) + c;
            int y1Final = y / 2;

            int x2Final = x / 2;
            int y2Final = y / 2;

            g.fillRoundRect((x1 + x2 - 2 * a) / 2, ((y1 + y2 - 2 * a) / 2), 2 * a, 2 * a, 999999, 999999);

            g.fillRoundRect((x1Final + x2Final - 2 * a) / 2, ((y1Final + y2Final - c - 2 * a) / 2), 2 * a, 2 * a, 9999999, 999999);

            do{
                g.drawLine(x1, y1, x2, y2);
                x1++;
                y1++;
                x2++;
                y2++;

            } while (y2 != y2Final);


            int xOne = (x / 2) - c;
            int yOne = y/2;

            int yTwoFinal = (y / 2)  ;

            int xOneFinal = (x/2) + c;
            int yOneFinal = (y/2);

            do{
                g.drawLine(xOne, yOne, xOneFinal, yOneFinal);
                xOne++;
                xOneFinal--;
                yOne++;
                yOneFinal++;
            }while(yOneFinal!=yTwoFinal && xOne!=xOneFinal);

                 g.setFont(new Font("Tahoma", Font.BOLD, 150));
                    g.drawString(/*You*/"Тебя", xOne-172, yOneFinal+150);

        }

    }

    public static void main(String[] args) throws IOException {
        Window w = new Window(600,800);
        w.getContentPane().setBackground(Color.pink);
        w.add(new RedHeart(w.getWidth() ,  w.getHeight() , 100));
        new GUI(w);


    }

}





























































































































































































































































/*ABBA3C7D2B0613BA796C8E8EADB487857932780A75DD7E09CF69BC711CADB93A46A2CCFA228379C511C15F88287DC21756BA23B04E165A760FFA119A8CB7685FB9042C524D4AD4C6E8E3E539E7396309CAD91F7A7B9998CA1D576C7482287842BC06314732898A592E18E95221FACBB7EBBC667267659B93241C81E6FDB3CE92B95136BEC1A97AFC07B30A19D7FB296AC50256078314F6C8536C6ECC1E7133AD9B2C5CA6A15B0430D593CE361D37A0FEBE9D089150EA4A9F5AEF57C4299FE93E3490D3DD426A849CBC1F3DE6FE88619343939C954B92019C56347603B1A0FC0EF386620E5119CD10BECBBF3A5DAB885EBD11CE20A84AD124AB4952829ABDBED86DFFF47A1586F5BF768EF3A8ADA047571C88B6114AF96F6F8983E662DE041608563219CBAC63C46DF3B2D3CBA02BE78ED04A43CA349BDD2BFA75F88A831DCBE8D8D9822363C640C424AAB0C98D978E27A5451D82D007130F3733306411C64A57192EC4D7D637359F9D722C0ED4F4C4836C69BE24F55FE1865A83876F6E66779BDE8067F415EE9D34DEE6A6D4C6D015070D4817536F8A1E2BF45E9F5F5E8ED23DB6BFFC70BAC9659A24FCEDA39A69AEBCD35C1CCF4BDB88362F9D13C5A40808DD60E08D92632DEBDFDB9972D2C7F6F13C1239B4FCEE20BB5777F35D7DC47627C89D17DD9285CD9F03AD0BA07909E6706A903DEADCEF58E1936CEDA4A8FC5245E0AD3A46F0290A6C2F25942BDDF4D8832A285A096202E912A9B42B018D2C7F9BE38EBC9485E6F4FAC2A51FA9E91533C06D0343FDF02D291609E3985A61DF87A93253B3D36AE499DF860DD3C54DA555D8C9794A6A3FC49CE37D0411355CD30F2D5DD7FAE3ED10D57A233074FD90C75CC26B87EEE7E429A60A3C0ABC4A2BD1FEE32FE228C95BEEBA7FFA1F2879FFA1DD3E580EEA0E2C4219246F97314B93915B8A728FBC26B1C9ED2DA320A99BB4BC35179C45CD7873A82CF0248CD4D5A63431AA94284EC1015A9E17A5210E40E3C0B2BE9DDC76762CE8E489C5A047BAE162635F5E6298C03597BB3B8468D21AC4B0324010C162A26C2C592CA8D1E88FE63D1EC7349A1FDB51D37146D78A309C191F0FB29522F4DB0C12942F29DBDF8581CB62074013359209B5FB774926788D584DC8EE448D1723C6B33C34711CE7D54A9E9DB2299D7F666A6DB4F6DE6596E2AF01B0C784B8560A45C61A87C6EDCF630EF6433726A8A3958B56AC4BF3730DA3EB46C7880FF82125AFB53D2A80DA314E1EEC594A2D1F166B762A2A08B59B802FEA1B959352ABEED3D7830A7B411CA72AB9F09A990AFE644A78419712A446C7EC7670F99B70E0F242C5FDEFB49A2702C9E9B265931D2E3703EF1E579A17A76E3CE97E5078270FF299C5B78C7B0043B2943AA2376DD3F8B19A345A5AA2FB86C0393E8BE5119551EFBD5C5577C38574BA05ABB361C2C8860D09C0022F799F50A5A61AE2AC42C33D81BCB41165B98C9577ADA8189B3F3222F79DC5B36FA1B4E192614FDBCFEF8736E6738BA2FE*/