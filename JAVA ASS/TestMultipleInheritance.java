interface Writer {
    void write(String text);
}
interface Reader {
    String read();
}
class Document implements Writer, Reader {
    private String content;

    @Override
    public void write(String text) {
        this.content = text;
    }

    @Override
    public String read() {
        return content;
    }
}

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.write("Hello, World!");
        System.out.println("Document content: " + doc.read());
    }
}