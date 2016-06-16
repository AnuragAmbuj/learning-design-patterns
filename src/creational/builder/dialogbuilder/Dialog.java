package creational.builder.dialogbuilder;

import java.awt.*;

/**
 * Created by anurag on 12/6/16.
 */
public class Dialog implements IGenericDialog {

    private String title;
    private String text;
    private DialogButtonsCombination dialogButtonsCombination;
    private BoxSize boxSize;
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void setButtonsCombination(DialogButtonsCombination dialogButtonsCombination) {
        this.dialogButtonsCombination = dialogButtonsCombination;
    }

    @Override
    public void setBoxSize(int width, int height) {
        this.boxSize = new BoxSize(width,height);
    }
}
