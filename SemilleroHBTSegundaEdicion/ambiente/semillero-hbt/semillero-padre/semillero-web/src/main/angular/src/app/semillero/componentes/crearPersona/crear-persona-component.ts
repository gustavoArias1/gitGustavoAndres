import { Component, OnInit } from '@angular/core';
/**
 * @description Componenete 
 * 
 * @author 
 */
@Component({
    selector: 'crear-persona',
    templateUrl: './crear-persona-component.html',
})




export class CrearPersonaComponent implements OnInit{

    private nombreIntructorGlobalPrivado : string;
    public  nombreInstructorGlobalPublico : string;

    public listaApellidos = Array<string>();
    public listaNombres = [];

    ngOnInit():void{
        this.inicializarComponente();
        let nombre="gustavo";
        let miVariable : any ={
            id : 1,
            nombre : "gustavo",
            apellido : "Arias"
        }

        let miMapa : Map<string,string>;
        miMapa = new Map<string,string>();

        miMapa.set("1","semillero");
        miMapa.get("1");


    }

    public inicializarComponente() : Array<string> {
        let retorno : any;
        let objeto = undefined;
        if(objeto !== null){
            console.log("No es nulo")
        } else {
            console.log("Si es nulo");
        }
 
        console.log(1 == 1);
        console.log(1 === 1);
        return retorno;
    }



}