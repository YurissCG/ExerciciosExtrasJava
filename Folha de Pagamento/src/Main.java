public class Main {
    public static void main(String[] args) {


        Funcionario alex = new Funcionario("alex", 0);
        ContratoTrabalho contratoAlex = new ContratoTrabalho(2, 1, alex);
        FolhaPagamento pagamentoAlex = new FolhaPagamento(10, 2, contratoAlex, alex);
        Holerite holerite = pagamentoAlex.calcularSalario();
        pagamentoAlex.ImprimirHolerite(holerite);
    }
}