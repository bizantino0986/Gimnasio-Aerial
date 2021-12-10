import { Colonia } from "./Colonia";

export class Direccion {
  id: number = 0;
  calle:String = '';
  num_interior = "";
  num_exterior = "";
  codigo_postal:String = '';

  colonia: Colonia = new Colonia();

}
