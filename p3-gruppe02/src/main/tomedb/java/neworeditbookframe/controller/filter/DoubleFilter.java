package main.tomedb.java.neworeditbookframe.controller.filter;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class DoubleFilter extends DocumentFilter {

    @Override
    public void insertString(FilterBypass filterBypass, int offset, String string,
            AttributeSet attr) throws BadLocationException {

        Document doc = filterBypass.getDocument();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(doc.getText(0, doc.getLength()));
        stringBuilder.insert(offset, string);

        if (inputTextTesting(stringBuilder.toString())) {
            super.insertString(filterBypass, offset, string, attr);
        } else {
            
        }
    }

    private boolean inputTextTesting(String text) {
        try {
            Double.parseDouble(text);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {

        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.replace(offset, offset + length, text);

        if (inputTextTesting(sb.toString())) {
            super.replace(fb, offset, length, text, attrs);
        } else {

            
        }

    }

    @Override
    public void remove(FilterBypass fb, int offset, int length)
            throws BadLocationException {
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.delete(offset, offset + length);
        if (sb.toString().length() == 0) {
            super.replace(fb, offset, length, "", null);
        } else {
            if (inputTextTesting(sb.toString())) {
                super.remove(fb, offset, length);
            } else {
               
            }
        }

    }
}
