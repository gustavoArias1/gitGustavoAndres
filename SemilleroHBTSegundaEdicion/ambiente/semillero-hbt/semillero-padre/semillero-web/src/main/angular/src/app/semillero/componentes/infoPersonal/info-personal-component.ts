import { Component, OnInit } from '@angular/core';
/**
 * @description componente para mostar la informacion personal de una persona
 * 
 * @author Gustavo Andres Arias
 */
@Component({
    selector: 'infopersonal',
    templateUrl: './info-personal-component.html',
})
export class infoPersonalComponent {
    nombre: String = "";
    repositorio: String = "";
    ciudad: String = "";

    constructor(){
        this.nombre ="Gustavo Andres Arias";
        this.repositorio = "https://github.com/gustavoArias1/gitGustavoAndres";
        this.ciudad = "Manizales";
    }

}