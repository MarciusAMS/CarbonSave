package service;

import visitor.ReportVisitor;
import visitor.ReportElement;

import java.util.List;

public class GeradorRelatorio {

    public void gerar(ReportVisitor visitor, List<ReportElement> elementos) {
        for (ReportElement el : elementos) {
            el.accept(visitor);
        }
    }
}
