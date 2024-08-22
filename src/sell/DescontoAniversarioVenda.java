package sell;

import java.time.LocalDate;

public class DescontoAniversarioVenda implements DescontoVenda {
    @Override
    public double aplicarDesconto(Venda venda) {
        LocalDate cliente_nascimento = venda.getCliente().getDataNascimento();
        LocalDate venda_data = venda.getData();
        double valor_venda = venda.getValorTotal();

        if(cliente_nascimento.getDayOfMonth() == venda_data.getDayOfMonth()
                && cliente_nascimento.getMonthValue() == venda_data.getMonthValue()){
            venda.setValorTotal(valor_venda * (1-0.15));
        }

        return venda.getValorTotal();
    }
}
