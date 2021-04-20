package br.com.trilhadev.colecionadordecursos.controller;

import br.com.trilhadev.colecionadordecursos.dto.CursoDTO;
import br.com.trilhadev.colecionadordecursos.model.Curso;
import br.com.trilhadev.colecionadordecursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/dev/colecionador")
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @PostMapping("/curso")
    public void incluirNovoCurso(@RequestBody @Valid CursoDTO novoCurso) {
        cursoService.salvarCurso(novoCurso);
    }

}
