package Sections.SubSections;

public abstract class Paragraph {
    String data;

    public Paragraph(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}
