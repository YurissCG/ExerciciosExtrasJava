public class FolhaPagamento {

    int quantidadeHorasNormaisTrabalhadas;
    int quantidadeHorasextrasTrabalhadas;

    ContratoTrabalho horasdocontrato;
    Funcionario funcionario;

    public FolhaPagamento(int quantidadeHorasNormaisTrabalhadas, int quantidadeHorasextrasTrabalhadas, ContratoTrabalho horasdocontrato, Funcionario funcionario) {
        this.quantidadeHorasNormaisTrabalhadas = quantidadeHorasNormaisTrabalhadas;
        this.quantidadeHorasextrasTrabalhadas = quantidadeHorasextrasTrabalhadas;
        this.horasdocontrato = horasdocontrato;
        this.funcionario = funcionario;
    }

    Holerite calcularSalario(){

        Holerite holerite = new Holerite();

        double valorTotalHoraNormal = holerite.quantidadeHorasNormaisTrabalhadas * holerite.valorHoraNormal;
        double valorTotalHoraExtra =  holerite.quantidadeHorasextrasTrabalhadas * holerite.valorHoraExtra;
        double adicionalParaFilhos = (valorTotalHoraExtra + valorTotalHoraNormal) * 0.10;
        double salarioTotal = (valorTotalHoraExtra + valorTotalHoraNormal) * 1.10;

        holerite.funcionario = funcionario;
        holerite.valorHoraNormal = horasdocontrato.valorHoraNormal;
        holerite.valorHoraExtra = horasdocontrato.valorHoraExtra;
        holerite.quantidadeHorasNormaisTrabalhadas = quantidadeHorasNormaisTrabalhadas;
        holerite.quantidadeHorasextrasTrabalhadas = quantidadeHorasextrasTrabalhadas;
        holerite.salarioTotal = salarioTotal;

       return holerite;
    }

    void ImprimirHolerite(Holerite holerite){
        double valorTotalHoraNormal = horasdocontrato.valorHoraNormal * quantidadeHorasNormaisTrabalhadas;
        double valorTotalHoraExtra = horasdocontrato.valorHoraExtra * quantidadeHorasextrasTrabalhadas;
        double adicionalParaFilhos = (valorTotalHoraExtra + valorTotalHoraNormal) * 0.10;
        double salarioTotal = (valorTotalHoraExtra + valorTotalHoraNormal) + adicionalParaFilhos;

        System.out.println("Nome do Funcionário: " + funcionario.nome);
        System.out.println("Valor Hora Normal: " + horasdocontrato.valorHoraNormal);
        System.out.println("Valor Hora Extra: " + horasdocontrato.valorHoraExtra);
        System.out.println("Quantidade de Horas Normais Trabalhadas: " + quantidadeHorasNormaisTrabalhadas);
        System.out.println("Quantidade de Horas Extras Trabalhadas: " + quantidadeHorasextrasTrabalhadas);
        System.out.println("Adicional para Filhos: " + adicionalParaFilhos); // Adiciona essa linha para imprimir o adicional para filhos
        System.out.println("Salário Total: " + salarioTotal);
    }
}
