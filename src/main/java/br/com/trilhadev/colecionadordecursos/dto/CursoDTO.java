package br.com.trilhadev.colecionadordecursos.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    @NotBlank
    @JsonProperty("nome")
    private String nome;

    @NotBlank
    @JsonProperty("data_inicio")
    private String dataInicio;

    @NotBlank
    @JsonProperty("data_conclusao")
    private String dataConclusao;

    @NotNull
    @JsonProperty("carga_horaria_total")
    private Integer cargaHorariaTotal;

    @NotBlank
    @URL
    @JsonProperty("url_certificado")
    private String urlCertificado;

    @NotBlank
    @JsonProperty("fornecedor")
    private String fornecedor;

}
