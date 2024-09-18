public class ContaUniversitaria extends Conta {
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public double calcularTaxas() {
        return 0f;
    }

    @Override
    public void setLimite(double limite) {
        if (limite > 500 || limite < 0) {
            throw new IllegalArgumentException("Erro: Limite fora da faixa permitida para Conta Universitaria.");
        }
        super.limite = limite;

    }
}
