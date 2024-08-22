package sell;

public interface DescontoVenda {
    double aplicarDesconto(Venda venda);
    static DescontoVenda newInstance(int opcaoDescontoSelecionado){
        return switch(opcaoDescontoSelecionado) {
            case 1 -> new DescontoProgressivoVenda();
            case 2 -> new DescontoAniversarioVenda();
            default -> new DescontoBDVenda();
        };
    }
}
