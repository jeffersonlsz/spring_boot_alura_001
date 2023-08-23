package med.voll.api.medico;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
                                @NotNull
                                @NotBlank
                                String nome, 
                                @Email
                                String email, 
                                @NotBlank
                                String crm, 
                                String telefone,
                                Especialidade especialidade, 
                                @NotNull
                                DadosEndereco endereco) {

}
