package sell;

public class DescontoBDVenda implements DescontoVenda {
    @Override
    public double aplicarDesconto(Venda venda) {
        return venda.getValorTotal() * (1-0.05);
    }
}
