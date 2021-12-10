import { DialogDireccionComponent } from './../dialog-direccion/dialog-direccion.component';
import { Router } from '@angular/router';
import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { Direccion } from 'src/app/model/persona/direccion/Direccion';
import { MatDialog } from '@angular/material/dialog';
import { Alumno } from 'src/app/model/persona/Alumno';
import { AlumnoServiceService } from 'src/app/services/persona/alumno/alumno-service.service';


@Component({
  selector: 'app-list-alumno',
  templateUrl: './list-alumno.component.html',
  styleUrls: ['./list-alumno.component.css']
})
export class ListAlumnoComponent implements OnInit {

  inputBusqueda: string = '';
  salida: string = 'Aqui esta';
  displayedColumns: string[] = ['ID', 'nombre', 'estatus', 'categoria', 'direccion', 'actualizar', 'eliminar'];
  dataSource : Alumno[] = [];

  constructor(private router:Router, private dialog:MatDialog, private service: AlumnoServiceService) {

  }

  ngOnInit(): void {
    this.service.getAlumnos().subscribe(data => {
      this.dataSource = data;
      console.log(data);
    })
  }

  nuevo(){
    this.router.navigate(["addAlumno"]);
  }

  actualizar (alumno : Alumno) {
    localStorage.setItem("alumno", JSON.stringify(alumno));
    this.router.navigate(["editAlumno"]);
  }

  eliminar (alumno : Alumno) {
    console.log(alumno);
    this.service.deleteAlumno(alumno);
    location.reload();
  }

  enterBuscar(event: any){
    if (event.keyCode == 13) {
      this.buscarAlumno(event.target.value);
    }
  }

  pulsaBuscar() {
    this.buscarAlumno(this.inputBusqueda);
  }

  onSubmit(form: NgForm) {
    console.log(form.value);

    this.inputBusqueda = form.value.inputBusqueda;

    this.buscarAlumno(form.value.inputBusqueda);

  }

  buscarAlumno(busqueda : string){
    this.salida = busqueda;
    //Aqui poner el proceso para busqueda por nombre
  }

  openDialog(alumno: Alumno) {
    const dialogRef = this.dialog.open(DialogDireccionComponent, {
      data: alumno
    });
  }

}
