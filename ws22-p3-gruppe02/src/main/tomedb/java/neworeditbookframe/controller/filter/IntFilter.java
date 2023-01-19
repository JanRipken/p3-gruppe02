package main.tomedb.java.neworeditbookframe.controller.filter;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class IntFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass filterBypass, int offset, String string,
            AttributeSet attr) throws BadLocationException {

        Document document = filterBypass.getDocument();
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append(document.getText(0, document.getLength()));
        stringBuild.insert(offset, string);

        if (TestInputText(stringBuild.toString())) {
            super.insertString(filterBypass, offset, string, attr);
        } else {
            
        }
    }

    private boolean TestInputText(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void replace(FilterBypass filterBypass, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {

        Document document = filterBypass.getDocument();
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append(document.getText(0, document.getLength()));
        stringBuild.replace(offset, offset + length, text);

        if (TestInputText(stringBuild.toString())) {
            super.replace(filterBypass, offset, length, text, attrs);
        } else {

            
        }

    }

    @Override
    public void remove(FilterBypass filterBypass, int offset, int length)
            throws BadLocationException {
        Document document = filterBypass.getDocument();
        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append(document.getText(0, document.getLength()));
        stringBuild.delete(offset, offset + length);
        if (stringBuild.toString().length() == 0) {
            super.replace(filterBypass, offset, length, "", null);
        } else {
            if (TestInputText(stringBuild.toString())) {
                super.remove(filterBypass, offset, length);
            } else {
                
            }
        }

    }
}
