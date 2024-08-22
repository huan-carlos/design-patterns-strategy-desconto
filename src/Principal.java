import sell.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Huan Carlos", LocalDate.parse("2024-06-26"));
        Venda venda = new Venda(cliente, LocalDate.now(), 700.00);

        System.out.println(venda + "\n");

        venda.setDescontoVenda(DescontoVenda.newInstance(selecionarOpcao()));

        System.out.println("Valor da Venda após Desconto: R$" + venda.processarDesconto());
    }

    private static int selecionarOpcao() {
        System.out.println("Informa qual desconto deseja aplicar:\n" +
                "1 - Desconto Progressivo\n" +
                "2 - Desconto Aniversário\n" +
                "3 - Desconto Fixo\n");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
