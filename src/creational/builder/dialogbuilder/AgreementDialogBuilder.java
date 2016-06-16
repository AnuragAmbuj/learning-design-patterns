package creational.builder.dialogbuilder;

/**
 * Created by anurag on 13/6/16.
 */
public class AgreementDialogBuilder implements DialogBuilder{
    private Dialog dialog;
    public AgreementDialogBuilder(){
        dialog = new Dialog();
    }

    @Override
    public void buildTitle(String title) {
        dialog.setTitle(title);
    }

    @Override
    public void buildText(String text) {
        dialog.setText(text);
    }

    @Override
    public void buildDialogButtonCombination(DialogButtonsCombination dialogButtonsCombination) {
        dialog.setButtonsCombination(DialogButtonsCombination.ACCEPT_REJECT_COMBO);
    }

    @Override
    public void buildBoxSize(BoxSize boxSize) {
        dialog.setBoxSize(boxSize.getWidth(),boxSize.getHeight());
    }

    @Override
    public Dialog getDialog() {
        return dialog;
    }
}
