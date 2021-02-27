package beans;

public class MyBean {

    String text;

    public MyBean() {
        System.out.println("Created a MyBean instance.");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
