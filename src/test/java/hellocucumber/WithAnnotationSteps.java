package hellocucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.time.DayOfWeek;
import java.util.Objects;

// Execução com annotation
public class WithAnnotationSteps {

    private DayOfWeek diaDaSemana;
    private Boolean falo;

    @Dado("que hoje é Quarta")
    public void hojeEhQuarta() {
        diaDaSemana = DayOfWeek.WEDNESDAY;
    }

    @Quando("alguém me perguntar se já é Sexta")
    public void alguemMePerguntarSeJaESexta() {
        falo = Objects.equals(diaDaSemana, DayOfWeek.FRIDAY);
    }

    @Entao("vou falar que não é")
    public void vouFalarQueNao() {
        Assert.assertFalse(falo);
    }
}
