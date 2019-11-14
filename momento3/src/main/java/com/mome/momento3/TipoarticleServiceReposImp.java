package com.mome.momento3;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoarticleServiceReposImp implements TipoarticlesServiceCRUD {
    

    //Implementar los metodos de ServiceCRUD y Repositorio
    //Con la anotacion @Autowired se crea una variable de tipo Repositorio para poder utilizar metodos de la interface TipoVehiRepositorio
    
    @Autowired
    private TipoArtRepositorio repositorio;
    
    @Override
    public List<Tipoarticles> listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Tipoarticles listarId(int id){
        return repositorio.findOne(id);
    }
    
    @Override
    public Tipoarticles add(Tipoarticles articles_services){
        return repositorio.save(articles_services);
    }
        
    @Override
    public Tipoarticles edit(Tipoarticles articles_services){
        return repositorio.save(articles_services);
    }
    
    @Override
    public Tipoarticles delete(int id){
        Tipoarticles tv = repositorio.findOne(id);
        
        if (tv != null){
            repositorio.delete(tv);
        }
        return tv;
    }


}