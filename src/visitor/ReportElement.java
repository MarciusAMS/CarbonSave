package visitor;

public interface ReportElement {
    void accept(ReportVisitor visitor);
}
