package com.example.demo.controller;

import com.example.demo.model.CrearCurso;
import com.example.demo.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.LinkedList;

@RestController
public class CursoController {
    // BD de ayuda
    private List<Curso> cursos;
    private Long ultimoId = 102l;

    public CursoController(){
        cursos = new LinkedList<>();
        cursos.add(new Curso(100l, "Full Stack Java"));
        cursos.add(new Curso(101l, "Full Stack JavaScript"));
        cursos.add(new Curso(102l, "Full Stack Python"));
    }

    @GetMapping("/obtenerCursos")
    public List<Curso> obtenerCursos(){
        return cursos;
    }

    // {id} = variable en la URL y se hace obligatorio
    @GetMapping("/obtenerCurso/{id}")
    public Curso obtenerCurso(@PathVariable Long id){
        for (Curso c : cursos){
            if(c.getId()==id){
                return c;
            }
        }
    return null;
    }

    /* Implementado con Stream
    @GetMapping("{id}")
    public Curso obtenerCurso(@PathVariable Long id){
        return cursos.stream().filter(curso -> curso.getId() == id).findFirst().orElse(null);
    }
     */

    // Query string:
    //@GetMapping("obtenerCursos/buscar?llave=valor&llave2=valor2")

    @PostMapping("/crearCurso")
    // @RequestBody = recibe un objeto del POST y lo convierte en clase de java
    // DTO = Objeto de Transferencia de Datos
    public Curso crearCurso(@RequestBody CrearCurso data) {
        Curso nuevo = new Curso(++ultimoId, data.getNombre());
        cursos.add(nuevo);
        return nuevo;
    }
}
