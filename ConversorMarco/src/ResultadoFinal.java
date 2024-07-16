import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoFinal( @JsonAlias("conversion_result") Double resultadoFinal) {

}
