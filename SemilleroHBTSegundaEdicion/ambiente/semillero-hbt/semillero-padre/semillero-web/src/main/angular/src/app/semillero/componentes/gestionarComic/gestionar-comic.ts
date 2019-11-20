

import { ComicDTO } from '../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { GestionarComicService } from '../../services/gestionar.comic.service';
/**
 * @description Componenete gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
    selector: 'gestionar-comic',
    templateUrl: './gestionar-comic.html',
    styleUrls: ['./gestionar-comic.css']
})
export class GestionarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarComicForm : FormGroup;

    /**
     * Atributo que contendra la informacion del comic
     */
    public comic: ComicDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */
    public listaComics : Array<ComicDTO>;

    public idComic : number = 0;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted : boolean;

    /**
     *  atributo que indica si se envio a editar un comic
     */
    public editar : boolean;
    /**
     *  atributo que almacena el comic que se va a edita
     */
    public ComicEditar : number;
    /**
     * atributo que almacena el comic que se va a eliminar
     */
    public comicEliminar : ComicDTO;

    /**
     * 
     * atributo que verifica si un comic fue eliminado 
     * */    
    public comicEliminado : boolean;
    
    /**
     * @description Este es el constructor del componente GestionarComicComponent
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    constructor(private fb : FormBuilder,
        private router : Router,
        private gestionarComicService : GestionarComicService) {
        this.gestionarComicForm = this.fb.group({
            nombre : [null, Validators.required],
            editorial : [null],
            tematica : [null],
            coleccion : [null],
            numeroPaginas : [null],
            precio : [null],
            autores : [null],
            color : [null]
        });
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    ngOnInit(): void {
        console.log("Ingreso al al evento oninit");
        this.comic = new ComicDTO();
        this.listaComics = new Array<ComicDTO>();
        this.consultarComics2();
    }

     /**
     * @description Metodo encargado de consultar los comics existentes
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    public consultarComics2() : void {
        this.gestionarComicService.consultarComics().subscribe(listaComics => {
            this.listaComics = listaComics;
        }, error => {
            console.log(error);
        });
    }

    /**
     * @description Metodo que permite validar el formulario y crear o actulizar un comic
     */
    public crearActualizarComic() : void {
        this.submitted = true;
        if(this.gestionarComicForm.invalid) {
            return;
        }
        if(this.editar==true){
            this.listaComics[this.ComicEditar].nombre=this.gestionarComicForm.controls.nombre.value;
            this.listaComics[this.ComicEditar].editorial=this.gestionarComicForm.controls.editorial.value;
            this.listaComics[this.ComicEditar].tematica=this.gestionarComicForm.controls.tematica.value;
            this.listaComics[this.ComicEditar].coleccion=this.gestionarComicForm.controls.coleccion.value;
            this.listaComics[this.ComicEditar].numeroPaginas=this.gestionarComicForm.controls.numeroPaginas.value;
            this.listaComics[this.ComicEditar].precio=this.gestionarComicForm.controls.precio.value;
            this.listaComics[this.ComicEditar].autores=this.gestionarComicForm.controls.autores.value;
            this.listaComics[this.ComicEditar].color=this.gestionarComicForm.controls.color.value;
            this.limpiarFormulario();
        }else{
            this.idComic++;
            this.comic = new ComicDTO();
            this.comic.id = this.idComic + "";
            this.comic.nombre = this.gestionarComicForm.controls.nombre.value;
            this.comic.editorial = this.gestionarComicForm.controls.editorial.value;
            this.comic.tematica = this.gestionarComicForm.controls.tematica.value;
            this.comic.coleccion = this.gestionarComicForm.controls.coleccion.value;
            this.comic.numeroPaginas = this.gestionarComicForm.controls.numeroPaginas.value;
            this.comic.precio = this.gestionarComicForm.controls.precio.value;
            this.comic.autores = this.gestionarComicForm.controls.autores.value;
            this.comic.color = this.gestionarComicForm.controls.color.value;
        
            this.listaComics.push(this.comic);
            this.limpiarFormulario();

        }
        
        
        
    }

    /**
     * Metodo que permite consultar un comic de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    public consultarComic(posicion : number) : void {
        let comic = this.listaComics[posicion];
        this.router.navigate(['consultar-comic',comic]);

    }

    /**
     * metodo encargado de poner los valores limpios en el formulario
     */

    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarComicForm.controls.nombre.setValue(null);
        this.gestionarComicForm.controls.editorial.setValue(null);
        this.gestionarComicForm.controls.tematica.setValue(null);
        this.gestionarComicForm.controls.coleccion.setValue(null);
        this.gestionarComicForm.controls.numeroPaginas.setValue(null);
        this.gestionarComicForm.controls.precio.setValue(null);
        this.gestionarComicForm.controls.autores.setValue(null);
        this.gestionarComicForm.controls.color.setValue(null);
    }

    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Diego Fernando Alvarez Silva
     */
    get f() { 
        return this.gestionarComicForm.controls;
    }

    /**
     * metodo encargado de editar un comic 
     * @param posicion nos entrega la posicion de la lista en donde se encuentra el comic
     */
    public editarComic(posicion : number):void{
        let comic = this.listaComics[posicion];
        this.editar=true;
        this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
        this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
        this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
        this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
        this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
        this.gestionarComicForm.controls.precio.setValue(comic.precio);
        this.gestionarComicForm.controls.autores.setValue(comic.autores);
        this.gestionarComicForm.controls.color.setValue(comic.color);
        this.ComicEditar=posicion;

    }

    /**
     * metodo encargado de eliminar un comic de la lista de comics
     * @param posicion nos entrega la posicion de donde se encuentra el comic a eliminar
     */
    public eliminarComic(posicion : number):void{
        this.comicEliminar=this.listaComics[posicion];
        //this.listaComics.splice(posicion,1);
        this.comicEliminado=true;
        //alert("el comic "+ this.comicEliminar.nombre+" fue eliminado con exito");
        this.eliminarComic2();
    }

    public eliminarComic2() : void {
        this.gestionarComicService.eliminarComic(this.comicEliminar).subscribe(listaComics => {
            console.log("no paso nada");
        }, error => {
            console.log(error);
        });
    }


}