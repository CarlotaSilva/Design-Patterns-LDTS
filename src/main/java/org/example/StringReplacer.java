package org.example;

public class StringReplacer implements StringTransformer {

    private char character;
    private char replace;

    public StringReplacer(char character, char replace) {
        this.character = character;
        this.replace = replace;
    }


    @Override
    public void execute(StringDrink drink) {
        String replaced = drink.getText()
                .replace(character, replace);
        drink.setText(replaced);
    }

    @Override
    public void undo(StringDrink drink) {
        String replaced = drink.getText().replace(replace, character);
        drink.setText(replaced);
    }
}