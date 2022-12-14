package Game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Text {
    public BufferedImage[] result_images = new BufferedImage[64];
    public void text_parser(String text_in) {
        for (int i = 0; i < this.result_images.length; i++) {
            this.result_images[i] = null;
        }

        char[] result = text_in.toCharArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 'А' || result[i] == 'а') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/а.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd1");}
            } else if (result[i] == 'Б' || result[i] == 'б') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/б.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd2");}
            } else if (result[i] == 'В' || result[i] == 'в') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/в.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd3");}
            } else if (result[i] == 'Г' || result[i] == 'г') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/г.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd4");}
            } else if (result[i] == 'Д' || result[i] == 'д') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/д.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd5");}
            } else if (result[i] == 'Е' || result[i] == 'е') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/е.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd6");}
            } else if (result[i] == 'Ж' || result[i] == 'ж') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ж.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd7");}
            } else if (result[i] == 'З' || result[i] == 'з') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/з.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd8");}
            } else if (result[i] == 'И' || result[i] == 'и') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/и.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd9");}
            } else if (result[i] == 'Й' || result[i] == 'й') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/й.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd10");}
            } else if (result[i] == 'К' || result[i] == 'к') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/к.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd11");}
            } else if (result[i] == 'Л' || result[i] == 'л') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/л.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd12");}
            } else if (result[i] == 'М' || result[i] == 'м') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/м.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd13");}
            } else if (result[i] == 'Н' || result[i] == 'н') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/н.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd14");}
            } else if (result[i] == 'О' || result[i] == 'о') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/о.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd15");}
            } else if (result[i] == 'П' || result[i] == 'п') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/п.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd16");}
            } else if (result[i] == 'Р' || result[i] == 'р') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/р.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd17");}
            } else if (result[i] == 'С' || result[i] == 'с') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/с.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd18");}
            } else if (result[i] == 'Т' || result[i] == 'т') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/т.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd19");}
            } else if (result[i] == 'У' || result[i] == 'у') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/у.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd20");}
            } else if (result[i] == 'Ф' || result[i] == 'ф') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ф.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd21");}
            } else if (result[i] == 'Х' || result[i] == 'х') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/х.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd22");}
            } else if (result[i] == 'Ц' || result[i] == 'ц') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ц.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd23");}
            } else if (result[i] == 'Ч' || result[i] == 'ч') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ч.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd24");}
            } else if (result[i] == 'Ш' || result[i] == 'ш') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ш.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd25");}
            } else if (result[i] == 'Щ' || result[i] == 'щ') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/т.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd26");}
            } else if (result[i] == 'Ъ' || result[i] == 'ъ') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ъ.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd27");}
            } else if (result[i] == 'Ы' || result[i] == 'ы') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ы.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd28");}
            } else if (result[i] == 'Ь' || result[i] == 'ь') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ь.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd29");}
            } else if (result[i] == 'Э' || result[i] == 'э') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/э.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd30");}
            } else if (result[i] == 'Ю' || result[i] == 'ю') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/ю.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd31");}
            } else if (result[i] == 'Я' || result[i] == 'я') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/я.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd32");}
            } else if (result[i] == ' ') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/prbb.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd33");}
            } else if (result[i] == ',') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/т.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd34");}
            } else if (result[i] == '!') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/!.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd35");}
            } else if (result[i] == '?') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/?.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd36");}
            } else if (result[i] == '0') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/0.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd37");}
            } else if (result[i] == '1') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num1.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd38");}
            } else if (result[i] == '2') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num2.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd39");}
            } else if (result[i] == '3') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num3.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd40");}
            } else if (result[i] == '4') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num4.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd41");}
            } else if (result[i] == '5') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num5.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd42");}
            } else if (result[i] == '6') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num6.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd43");}
            } else if (result[i] == '7') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num7.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd44");}
            } else if (result[i] == '8') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num8.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd45");}
            } else if (result[i] == '9') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/num9.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd46");}
            }  else if (result[i] == '.') {
                try {this.result_images[i] = ImageIO.read(new File("src/Images_and_sound/Tekst_tiles/tck.png"));} catch (IOException ignored) {System.out.println("Text.java: tile not dounnd47");}
            }
        }
    }
}
