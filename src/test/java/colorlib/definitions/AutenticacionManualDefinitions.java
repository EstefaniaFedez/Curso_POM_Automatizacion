package colorlib.definitions;

import colorlib.steps.Diligenciar;
import colorlib.steps.PasoInicial;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.UsuariosModels;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class AutenticacionManualDefinitions {

    @Steps
    public PasoInicial pasoInicial;

    @Steps
    Diligenciar diligenciar;

        @Given("^Yo ingreso el usuario$")
    public void yo_ingreso_el_usuario() {  }

    @Given("^Yo ingreso la clave invalida$")
    public void yo_ingreso_la_clave_invalida() { }

    @When("^Yo presiono el boton de ingresar$")
    public void yo_presiono_el_boton_de_ingresar() { }

    @Then("^Yo debería ver un mensaje de error$")
    public void yo_debería_ver_un_mensaje_de_error() { }


    @Given("^Yo ingreso la clave valida$")
    public void yo_ingreso_la_clave_valida() { }
    @Then("^Yo debería ver mensaje en el home$")
    public void yo_debería_ver_mensaje_en_el_home() { }

}
