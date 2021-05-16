package hellocucumber;

import io.cucumber.java8.Pt;
import org.junit.Assert;

import java.util.Objects;

// Execução com lambda
public class WithLambdaSteps implements Pt {

    private String hoje;
    private String resposta;

    public WithLambdaSteps() {
        Dado("que hoje é {string}", (String hoje) -> this.hoje = hoje);
        Quando("alguem questionar se é Sexta", () -> resposta = hojeEhSexta(hoje));
        Então("^vou falar que é \"([^\"]*)\"$", (String resposta) -> Assert.assertEquals(resposta, this.resposta));
    }

    private String hojeEhSexta(String dia) {
        return Objects.equals(dia, "Sexta") ? "Breja!" : "Não...";
    }

}
