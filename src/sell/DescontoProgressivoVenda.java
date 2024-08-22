package sell;

public class DescontoProgressivoVenda implements DescontoVenda {
    @Override
    public double aplicarDesconto(Venda venda) {
        double valor_venda = venda.getValorTotal();

        return valor_venda * (1 - 0.2);
    }
}
