import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {MatDialog} from "@angular/material/dialog";
import {AlumnoServiceService} from "../../../../services/persona/alumno/alumno-service.service";
import {NgForm} from "@angular/forms";
import {DialogDireccionComponent} from "../../alumno/dialog-direccion/dialog-direccion.component";
import {Maestro} from "../../../../model/persona/Maestro";

@Component({
  selector: 'app-list-maestro',
  templateUrl: './list-maestro.component.html',
  styleUrls: ['./list-maestro.component.css']
})
export class ListMaestroComponent implements OnInit {

  dataSource : Maestro[] = [];
  inputBusqueda: string = '';
  displayedColumns: string[] = ['ID', 'nombre', 'estatus', 'categoria', 'direccion', 'actualizar', 'eliminar'];

  constructor(private router:Router, private dialog:MatDialog, private service: AlumnoServiceService) {

  }

  ngOnInit(): void {

  }

  nuevo(){
    this.router.navigate(["addAlumno"]);
  }

  actualizar (maestro : Maestro) {
    localStorage.setItem("alumno", JSON.stringify(maestro));
    this.router.navigate(["editAlumno"]);
  }

  eliminar (maestro : Maestro) {

  }

  openDialog(maestro: Maestro) {
    const dialogRef = this.dialog.open(DialogDireccionComponent, {
      data: maestro
    });
  }

  enterBuscar(event: any){

  }

  pulsaBuscar() {

  }

  onSubmit(form: NgForm) {

  }

}
