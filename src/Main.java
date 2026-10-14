import Controller.PessoaController;
import Model.PessoaService;

void main() {
//Padrão mvc

    PessoaService service = new PessoaService();
    PessoaController controller = new PessoaController(service);

    controller.cadastrar();

    IO.println(controller.mostrar());

    //controller.deletar(3);

    controller.atualizar(2,"Eu");

    IO.println(controller.mostrar());
}
