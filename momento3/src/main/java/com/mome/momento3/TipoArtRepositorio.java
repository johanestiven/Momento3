package com.mome.momento3;

import java.util.List;
import org.springframework.data.repository.Repository;


public interface TipoArtRepositorio extends Repository<Tipoarticles, Integer> {
    //Declarar los metodos como los recomienda Spring
   Tipoarticles save(Tipoarticles articles_services);
    List<Tipoarticles>findAll();
    Tipoarticles findOne(int id);
    void delete(Tipoarticles articles_services );
}
