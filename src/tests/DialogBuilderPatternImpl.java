package tests;

import creational.builder.dialogbuilder.AgreementDialogBuilder;
import creational.builder.dialogbuilder.BoxSize;
import creational.builder.dialogbuilder.Dialog;
import creational.builder.dialogbuilder.DialogBuilder;

/**
 * Created by anurag on 13/6/16.
 */
public class DialogBuilderPatternImpl {
    public static void main(String args[])
    {
        DialogBuilder dialogBuilder = new AgreementDialogBuilder();
        dialogBuilder.buildBoxSize(new BoxSize(100,100));
        dialogBuilder.buildTitle("Hello Title");
        dialogBuilder.buildText("Hello Well!");
        Dialog d = dialogBuilder.getDialog();
        System.out.println(d);
    }
}
