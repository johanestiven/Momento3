/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mome.momento3;

import java.util.List;

/**
 *
 * @author 503
 */
public interface TipoarticlesServiceCRUD {
    
    //Los metodos que van a servir para las operaciones CRUD
    List<Tipoarticles>listar();
    Tipoarticles listarId(int id);
    Tipoarticles app(Tipoarticles articles_services);
    Tipoarticles edit(Tipoarticles articles_services);
    Tipoarticles delete(int id);
}
