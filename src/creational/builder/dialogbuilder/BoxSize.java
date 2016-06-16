package creational.builder.dialogbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public class BoxSize {
    private int width;
    private int height;

    public BoxSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
