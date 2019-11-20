import { Injectable } from '@angular/core';
import { Injector } from "@angular/core";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AbstractService } from '../services/template.service';
import { ProveedorDTO } from '../dto/ProveedorDTO';

/**
 * @description Servicio encargado de llamar a los servicios REST de gestionar proveedores
 * @author Gustavo Andres Arias Loiza
 */
@Injectable({
  providedIn: 'root'
})
export class GestionarProveedoresService extends AbstractService {

  /**
   * Constructor de la clase
   */
  constructor(injector: Injector, private httpClient : HttpClient) {
    super(injector);
  }
  
  /**
   * @description Metodo encargado de invocar el servicio REST consultar comics
   * @author Gustavo Andres Arias Loaiza
   */
  public consultarProveedores(): Observable<any> {
    return this.httpClient.get('http://localhost:8085/semillero-servicios/rest/GestionarProvedores/consultarProveedores');
  }

  public crearProveedor(proveedorDTO: ProveedorDTO  ): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/GestionarProveedores/crear',proveedorDTO);
  }

  public modificarProveedor(proveedorDTO: ProveedorDTO  ): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/GestionarProveedores/modificar',proveedorDTO);
  }

  public eliminarProveedor(proveedorDTO: ProveedorDTO  ): Observable<any> {
    return this.httpClient.post('http://localhost:8085/semillero-servicios/rest/GestionarProveedores/eliminar',proveedorDTO);
  }

}