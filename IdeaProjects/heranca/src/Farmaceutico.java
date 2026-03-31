public class Farmaceutico extends Funcionario{

    private int crf;

    public Farmaceutico() {

    }

    public Farmaceutico(int crf) {
        this.crf = crf;
    }

    public Farmaceutico(String nome, double salario, String cpf, int crf) {
        super(nome, salario, cpf);
        this.crf = crf;
    }

    public int getCrf() {
        return crf;
    }

    public void setCrf(int crf) {
        this.crf = crf;
    }
}
