package by.azzibom.utils.gui.swing.stringlistrenderer;

/**
 * @author Ihar Misevich
 * */
public interface CellRendererStringConverter<E> {

    default String convert(E value) {
        return value.toString();
    }

    default String nullConvert() {
        return "";
    }
}
