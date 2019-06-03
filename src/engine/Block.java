package engine;

import javafx.scene.image.Image;

/**
 * Enumeration Block represents all the different Block appearances a Tetromino
 * object can take on. Each discrete Block is represented by a different Image.
 */
public enum Block {

    DARK_RED("32darkredblock.png"),
    GREEN("32greenblock.png"),
    ORANGE("32orangeblock.png"),
    PURPLE("32purpleblock.png"),
    RED("32redblock.png"),
    TURQUOISE("32turquoiseblock.png"),
    YELLOW("32yellowblock.png") ;

    String filename;
    Image image;

    Block(String filename) {
        this.filename = filename;
        this.image = new Image("file:assets/blocks/" + filename);
    }

    public String getFilename() {
        return filename;
    }

    public Image getImage() {
        return image;
    }
}
