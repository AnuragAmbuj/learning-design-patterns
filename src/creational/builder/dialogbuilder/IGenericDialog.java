package creational.builder.dialogbuilder;

/**
 * Created by anurag on 12/6/16.
 * This interface declares method to create generic Interface for a Dialog Box
 */
public interface IGenericDialog {
    public void setTitle(String title);
    public void setText(String text);
    public void setButtonsCombination(DialogButtonsCombination dialogButtonsCombination);
    public void setBoxSize(int width,int height);
}
