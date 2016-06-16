package creational.builder.dialogbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public interface DialogBuilder {
    public void buildTitle(String title);
    public void buildText(String text);
    public void buildDialogButtonCombination(DialogButtonsCombination dialogButtonsCombination);
    public void buildBoxSize(BoxSize boxSize);
    public Dialog getDialog();
}
