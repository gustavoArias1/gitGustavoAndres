/**
 * @description Clase Comic que contiene la informacion de un comic
 * 
 * @author Gustavo Andres Arias Loaiza
 */
export class EjercicioComic {

    /**
    * Indicador de resultado.
    */
    public id: string;

    /**
    * Indicador de resultado.
    */
    public nombre: string;

    /**
    * Indicador de resultado.
    */
    public editorial: string;

    /**
    * Indicador de resultado.
    */
    public tematica: string;

    /**
    * Indicador de resultado.
    */
    public numeroPaginas: number;

    /**
    * Indicador de resultado.
    */
    public precio: number;

    /**
    * Indicador de resultado.
    */
    public autores: string;

    /**
    * Indicador de resultado.
    */
    public color: boolean;

    /**
    * Indicador de resultado.
    */
    public fechaVenta: Date;

    /**
    * Indicador de resultado.
    */
    public estado: string;


    public  constructor(id: string,nombre: string,editorial: string,tematica: string,
        numeroPaginas: number,precio: number,autores: string,color: boolean,fechaVenta: Date,
        estado: string){
            this.id = id;
            this.nombre = nombre;
            this.editorial = editorial;
            this.tematica = tematica;
            this.numeroPaginas = numeroPaginas;
            this.precio = precio;
            this.autores = autores;
            this.color = color;
            this.fechaVenta = fechaVenta;
            this.estado = estado;

            

    }

  
}