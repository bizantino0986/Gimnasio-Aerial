import { Component, OnInit } from '@angular/core';
import { Alumno } from 'src/app/model/persona/Alumno';
import {
  MAT_MOMENT_DATE_FORMATS,
  MomentDateAdapter,
  MAT_MOMENT_DATE_ADAPTER_OPTIONS,
} from '@angular/material-moment-adapter';
import { AlumnoServiceService } from 'src/app/services/persona/alumno/alumno-service.service';
import { NgForm } from '@angular/forms';
import {MatDatepickerInputEvent} from '@angular/material/datepicker';
import {DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE} from '@angular/material/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit-alumno',
  templateUrl: './edit-alumno.component.html',
  styleUrls: ['./edit-alumno.component.css'],
  providers: [
    {provide: MAT_DATE_LOCALE, useValue: 'es-mx'},
    {
      provide: DateAdapter,
      useClass: MomentDateAdapter,
      deps: [MAT_DATE_LOCALE, MAT_MOMENT_DATE_ADAPTER_OPTIONS]
    },
    {provide: MAT_DATE_FORMATS, useValue: MAT_MOMENT_DATE_FORMATS},
  ],
})
export class EditAlumnoComponent implements OnInit {

  alumno : Alumno = JSON.parse(<string>localStorage.getItem("alumno"));

  constructor(private alumnoService: AlumnoServiceService, private _adapter: DateAdapter<any>, private router:Router) { }

  ngOnInit(): void {
  }

  onSubmit(form: NgForm) {
    //this.alumno.persona.estatusPersona.estatus = "Activo";
    //console.log(this.alumno);
    //console.log(this.alumnoService.createAlumno(this.alumno));
  }

  guardar(){
    console.log(this.alumno);
    this.alumnoService.updateAlumno(this.alumno);
    this.router.navigate(["listAlumno"])
  }

  addDate(type: string, event: MatDatepickerInputEvent<Date>) {
    const date = Date.now();
    const hoy = new Date(date);
    //console.log("Fecha que buscas: ");
    //console.log(hoy.toDateString());
    this.alumno.fecha_inscripcion = this.alumnoService.procesarFecha2(hoy.toDateString());

    this.alumno.persona.fecha_nacimiento = this.alumnoService.procesarFecha(event.value?.toString());

  }

}
