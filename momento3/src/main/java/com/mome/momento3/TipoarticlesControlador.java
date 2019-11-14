package com.mome.momento3;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/"})
public class TipoarticlesControlador {
    
    //Se hara referencia al proyecto front-ent, brindandole los servicios
    
    @Autowired
    TipoarticlesServiceCRUD service;
    
    @GetMapping
    public List<Tipoarticles>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Tipoarticles agregar(@RequestBody Tipoarticles articles_services){
        //la anotacion @RequestBody, deserializa el JSON
        return service.add(articles_services);
    }
    
    @GetMapping(path = {"/{id}"})
    public Tipoarticles listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Tipoarticles editar(@RequestBody Tipoarticles tv, @PathVariable("id")int id){
        tv.setId(id);
        return service.edit(tv);
    }
    @DeleteMapping(path = {"/{id}"})
    public Tipoarticles delete(@PathVariable("id")int id){
        return service.delete(id);
    }
}
