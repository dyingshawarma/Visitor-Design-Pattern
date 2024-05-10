public interface ShippingCostVisitor {
    int visit(Chair chair);
    int visit(Sofa sofa);
    int visit(Table table);
}
