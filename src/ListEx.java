import javax.swing.*;

public class ListEx {
    import java.awt.*;
    import javax.swing.*;

    public class ListEx extends JFrame{
        private String [] fruits= {...};
        private ImageIcon [] images = {...};

        public ListEx() {
            JList<String> strList = new JList<String>(fruits);
            c.add(strList);

            JList<ImageIcon> imageList = new JList<ImageIcon>();
            imageList.setListDate(images);
            c.add(imageList);

            JList<String> scrollList = new JList<String>(fruits);
            c.add(new JScrollpane(scrollList));
        }
        public static void main(string[] args);
        new ListEx();
        }
}
