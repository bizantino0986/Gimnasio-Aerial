import { Genero } from './Genero';
import { EstatusPersona } from './EstatusPersona';
import { Categoria } from './Categoria';
import { Direccion } from 'src/app/model/persona/direccion/Direccion';
export class Persona {
  id:number | undefined;
  primer_nombre:string | undefined;
  segundo_nombre:string | undefined;
  apellido_paterno:string | undefined;
  apellido_materno:string | undefined;
  fecha_nacimiento:string | undefined;
  telefono:string | undefined;
  correo_electronico:string | undefined;

  direccion:Direccion = new Direccion();
  categoria:Categoria = new Categoria();
  estatusPersona:EstatusPersona = new EstatusPersona();
  genero:Genero = new Genero();
}
