import { ProveedorDTO } from '../../dto/ProveedorDTO';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'consultar-proveedor',
    templateUrl: './consultar-proveedor-component.html',
   
})

export class ConsultarProveedorComponent implements OnInit{
     /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarProveedorForm : FormGroup;

    /**
     * Atributo que contendra la informacion del comic
     */
    public proveedorDTO: ProveedorDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */

    constructor(private fb : FormBuilder,
        private router : Router,private activatedRoute: ActivatedRoute) {
        this.gestionarProveedorForm = this.fb.group({
            nombre : [null,],
            editorial : [null],
            tematica : [null],
            coleccion : [null],
            numeroPaginas : [null],
            precio : [null],
            autores : [null],
            color : [null]
        });
    }
    public listaProveedores : Array<ProveedorDTO>;
    ngOnInit(): void {
        this.proveedorDTO = new ProveedorDTO;
        this.proveedorDTO.nombre = this.activatedRoute.snapshot.params.nombre;
        this.proveedorDTO.ValorCredito = this.activatedRoute.snapshot.params.ValorCredito;
        this.proveedorDTO.direccion = this.activatedRoute.snapshot.params.direccion;
        this.proveedorDTO.estadoProveedor= this.activatedRoute.snapshot.params.estadoProveedor;
        this.proveedorDTO.fechaContratacion = this.activatedRoute.snapshot.params.fechaContratacion;
        this.consultarComic();
    }


    /**
     * metodo encargado de consultar un determinado comic
     */

    public consultarComic() : void {
        this.gestionarProveedorForm.controls.nombre.setValue(this.proveedorDTO.nombre);
        this.gestionarProveedorForm.controls.ValorCredito.setValue(this.proveedorDTO.ValorCredito);
        this.gestionarProveedorForm.controls.direccion.setValue(this.proveedorDTO.direccion);
        this.gestionarProveedorForm.controls.estadoProveedor.setValue(this.proveedorDTO.estadoProveedor);
        this.gestionarProveedorForm.controls.fechaContratacion.setValue(this.proveedorDTO.fechaContratacion);
        
       



    }

    /**
     * metodo encargado de hacer la navegacio desde el consultar hacia el gestionarcomic
     */
    public regresar(): void {
        this.router.navigate(['gestionar-proveedor']);
    }
    
}
