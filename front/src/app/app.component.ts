import { Router } from '@angular/router';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Aerial-Arts';

  constructor(private router:Router){}

  listarAlumnos(){
    this.router.navigate(["listAlumno"]);
  }

  listarMaestros(){
    this.router.navigate(["listMaestro"]);
  }

  listarClases(){
    this.router.navigate(["listClase"]);
  }

  listarCargos(){
    this.router.navigate(["listCargos"]);
  }

  listarPagos(){
    this.router.navigate(["listPagos"]);
  }

}
