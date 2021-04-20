package br.com.trilhadev.colecionadordecursos.service;

import br.com.trilhadev.colecionadordecursos.dto.CursoDTO;
import br.com.trilhadev.colecionadordecursos.model.Curso;
import br.com.trilhadev.colecionadordecursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository repository;

    @Override
    public void salvarCurso(CursoDTO novoCurso) {

        Curso cursoEntidade = Curso.builder()
                .nome(novoCurso.getNome())
                .dataInicio(novoCurso.getDataInicio())
                .dataConclusao(novoCurso.getDataConclusao())
                .fornecedor(novoCurso.getFornecedor())
                .cargaHorariaTotal(novoCurso.getCargaHorariaTotal())
                .urlCertificado(novoCurso.getUrlCertificado())
                .build();

       repository.save(cursoEntidade);
    }
}
