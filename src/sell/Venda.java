package sell;

import java.time.LocalDate;

/**
 * sell.Venda realizada para um {@link Cliente}.
 * @author Manoel Campos da Silva Filho
 */
public class Venda {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private DescontoVenda descontoVenda;

    public Venda() {/**/}

    public Venda(Cliente cliente, LocalDate data, double valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public double processarDesconto(){
        return descontoVenda.aplicarDesconto(this);
    }

    public void setDescontoVenda(DescontoVenda descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "sell.Venda { " +
                "cliente = " + cliente.getNome() +
                ", data = " + data +
                ", valorTotal = R$" + valorTotal +
                " }";
    }
}
