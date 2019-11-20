import { Component, OnInit } from '@angular/core';
import {ProveedorDTO} from '../../dto/ProveedorDTO';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import {GestionarProveedoresService} from '../../services/gestionar-proveedores-service';
        

@Component({
    selector: 'gestionar-proveedor',
    templateUrl: './gestionar-proveedor-component.html',
  })

export class GestionarProveedorComponent implements OnInit {

    public submitted : boolean;
    
    public gestionarProveedorForm : FormGroup;

    /**
     * Atributo que contendra la informacion del proveeoor
     */
    public proveedor: ProveedorDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */
    public listaProveedores : Array<ProveedorDTO>;

    /**
     *  atributo que indica si se envio a editar un proveedor
     */
    public editar : boolean;

     /**
     *  atributo que almacena el proveedor que se va a edita
     */
    public proveedorEditar : number;

    public idProveedor : number = 0;

    constructor(private fb : FormBuilder,
        private router : Router,
        private gestionarProveedoresService : GestionarProveedoresService) {
        this.gestionarProveedorForm = this.fb.group({
            nombre : [null,],
            direccion : [null],
            fechaContratacion : [null],
            valorCredito : [null],
            estadoProveedor : [null]   
        });
    }
    ngOnInit(): void {
        this.consultarProveedores();
    }


    /**
     * metodo utilizado para vaciar los inputs del formulario
     */
    private limpiarFormulario() : void {
        this.submitted = false;
        this.gestionarProveedorForm.controls.nombre.setValue(null);
        this.gestionarProveedorForm.controls.direccion.setValue(null);
        this.gestionarProveedorForm.controls.fechaContratacion.setValue(null);
        this.gestionarProveedorForm.controls.valorCredito.setValue(null);
        this.gestionarProveedorForm.controls.estadoProveedor.setValue(null);
    }


    /**
     * metodo para consultar los proveedores con el servicio rest
     */
    public consultarProveedores() : void {
        this.gestionarProveedoresService.consultarProveedores().subscribe(listaProveedores => {
            this.listaProveedores = listaProveedores;
        }, error => {
            console.log(error);
        });
    }

    /**
     * metodo para crear un proveedor
     */

    public crearProveedor():void{
        
        if(this.gestionarProveedorForm.invalid) {
            return;
        }

        if (this.editar){
            this.modificarProveedor(this.proveedorEditar);
        }else{
            this.proveedor.nombre=this.gestionarProveedorForm.controls.nombre.value;
            this.proveedor.direccion=this.gestionarProveedorForm.controls.direccion.value;
            this.proveedor.fechaContratacion=this.gestionarProveedorForm.controls.fechaContratacion.value;
            this.proveedor.ValorCredito=this.gestionarProveedorForm.controls.valorCredito.value;
            this.proveedor.estadoProveedor=this.gestionarProveedorForm.controls.estadoProveedor.value;
            this.limpiarFormulario();

            this.gestionarProveedoresService.crearProveedor(this.proveedor).subscribe(Respuesta => {
                this.consultarProveedores();
                this.listaProveedores.push(this.proveedor);
            }, error => {
                console.log(error);
            });
        }
        
        
    
        

    }

    /**
     * metodo encargado de modificar un proveedor
     */

    public modificarProveedor(posicion : number):void{
        this.editar=true;
        let proveedorDTO : ProveedorDTO;
        proveedorDTO = this.editarProveedor(posicion)
        if(this.gestionarProveedorForm.invalid) {
            return;
        }
        
        this.proveedor.nombre=this.gestionarProveedorForm.controls.nombre.value;
        this.proveedor.ValorCredito=this.gestionarProveedorForm.controls.valorCredito.value;
        this.limpiarFormulario();

        this.gestionarProveedoresService.modificarProveedor(this.proveedor).subscribe(Respuesta => {
            this.consultarProveedores();
            this.listaProveedores.push(this.proveedor);
        }, error => {
            console.log(error);
        });
        
    }

    /**
     * metodo encargado de poscionar los datos en el formulario para editarlos
     * @param posicion 
     */

    public editarProveedor(posicion : number):ProveedorDTO{
        this.proveedorEditar=posicion;
        let proveedorDTO: ProveedorDTO;
        proveedorDTO = this.listaProveedores[posicion];
        this.gestionarProveedorForm.controls.nombre.setValue(proveedorDTO.nombre);
        this.gestionarProveedorForm.controls.direccion.setValue(proveedorDTO.direccion);
        this.gestionarProveedorForm.controls.fechaContratacion.setValue(proveedorDTO.fechaContratacion);
        this.gestionarProveedorForm.controls.valorCredito.setValue(proveedorDTO.ValorCredito);
        this.gestionarProveedorForm.controls.estadoProveedor.setValue(proveedorDTO.estadoProveedor);

        return this.listaProveedores[posicion];
    }
    /**
     * metodo encargado de eliminar un proveedor
     */
    public eliminarProveedor(posicion : number) : void {
        let proveedorDTO: ProveedorDTO
        proveedorDTO = this.listaProveedores[posicion]; 
        this.gestionarProveedoresService.eliminarProveedor(proveedorDTO).subscribe(Respuesta=> {
        this.consultarProveedores();
        }, error => {
            console.log(error);
        });
    }

}