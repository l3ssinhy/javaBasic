//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Farmaceutico farmaceutico = new Farmaceutico();

        Funcionario igorFarmaceutico = new Farmaceutico();

        Medico nicolly = new Medico();

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(farmaceutico);
        listaFuncionarios.add(nicolly);

        farmaceutico.setNome("Igor");

    }
}