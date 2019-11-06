import { Component, OnInit } from '@angular/core';
import {EjercicioComic} from './Comic' 
import { JsonPipe } from '@angular/common';

@Component({
    selector: 'trabajo-comic',
    templateUrl: './trabajo-comic-component.html',
})

/**
 * @description Clase que muestra  informacion acerca de los comits
 * 
 * @author Gustavo Andres Arias
 */

export class TrabajoComicComponent implements OnInit{

    public listaComic = Array<EjercicioComic>();
    public  comicEliminado = "";
    
    ngOnInit():void{
        this.listaComic = new Array<EjercicioComic>();

        this.listaComic.push(new EjercicioComic("1","batman","panamericana","aventura",50,2000,
        "henry -jones",true,new Date("1990-12-01"),"ACTIVO"));

        this.listaComic.push(new EjercicioComic("2","ironman","toys","aventura",100,3000,
        "miguel -jones",false,new Date("1990-11-01"),"ACTIVO"));

        this.listaComic.push(new EjercicioComic("3","superman","panamericana","aventura",70,5000,
        "andres -jones",true,new Date("1990-10-01"),"INACTIVO"));

        this.listaComic.push(new EjercicioComic("4","acuaman","dc comic","aventura",98,2700,
        "henry -jose",false,new Date("1990-09-01"),"ACTIVO"));

        this.listaComic.push(new EjercicioComic("5","flash","panamericana","aventura",120,2900,
        "henry -jones",true,new Date("1990-08-01"),"INACTIVO"));
    }

    /**
     *  metodo que muestra la lista de comics 
     */
    public mostrarLista(): string{
        return JSON.stringify(this.listaComic);
    }


    /**
     * metodo encagado de eliminar un comic de la lista de comics 
     * @param idComic es un string que me dice que comic debo eliminar
     */
    public eliminarComic(idComic : string): void {
        this.comicEliminado=' ';
        for (let index = 0; index < this.listaComic.length; index++) {
            const element = this.listaComic[index];
            if(element.id=== idComic){
                this.comicEliminado = element.nombre;
                this.listaComic.slice(1,1);
            }
            
        }
      
    }

    /**
     * metodo para covertir de a cadena un json par ser mostrado en viñetas
     * @param item contiene el elemento de la lista
     */

    public convertirString(item: EjercicioComic) : string {
        return JSON.stringify(this.listaComic);
    }
    
}


