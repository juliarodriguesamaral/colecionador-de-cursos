package br.com.trilhadev.colecionadordecursos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("data_inicio")
    private String dataInicio;

    @JsonProperty("data_conclusao")
    private String dataConclusao;

    @JsonProperty("carga_horaria_total")
    private Integer cargaHorariaTotal;

    @JsonProperty("url_certificado")
    private String urlCertificado;

    @JsonProperty("fornecedor")
    private String fornecedor;

}
