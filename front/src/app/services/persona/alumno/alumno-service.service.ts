import { Alumno } from './../../../model/persona/Alumno';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { parseI18nMeta } from '@angular/compiler/src/render3/view/i18n/meta';

@Injectable({
  providedIn: 'root'
})
export class AlumnoServiceService {

  url : string = 'http://localhost:8080/alumnos';

  constructor(private http:HttpClient) { }

  getAlumnos() {
    return this.http.get<Alumno[]>(this.url).pipe();
  }

  createAlumno(alumno : Alumno) {
    return this.http.post(this.url, alumno)
    .pipe(map(res => res.toString())).subscribe(
      result => {
        console.log(result);
    }, error =>{

    });
  }

  updateAlumno(alumno : Alumno) {
    return this.http.put(this.url, alumno)
      .pipe(map(res => res.toString())).subscribe(
        result => {
          console.log(result);
        }, error =>{

        });
  }

  deleteAlumno(alumno : Alumno) {
    return this.http.delete(this.url+'/'+alumno.persona.id)
      .pipe(map(res => res.toString())).subscribe(
        result => {
          console.log(result);
        }, error =>{

        });
  }

  procesarFecha(fecha : string | undefined) : string{
    var año : string = "";
    var dia : string = "";
    var mes : string = "";
    var fechaNam : string = "";
    if (fecha != null) {
      let param : string[] =  fecha.split(" ");
      //2000-07-30T05:00:00.000+00:00 Formato que debe de tener la fecha
      //console.log("inicia el for");
    param.forEach(function(valor, indice, array) {
      //console.log(indice + ": " + valor);
      if (indice == 3) {
        año = valor;
      }
      if (indice == 1) {
        switch (valor) {
          case "Jan":
            mes = "01"
          break;
          case "Feb":
            mes = "02"
          break;
          case "Mar":
            mes = "03"
          break;
          case "Apr":
            mes = "04"
          break;
          case "May":
            mes = "05"
          break;
          case "Jun":
            mes = "06"
          break;
          case "Jul":
            mes = "07"
          break;
          case "Aug":
            mes = "08"
          break;
          case "Sep":
            mes = "09"
          break;
          case "Oct":
            mes = "10"
          break;
          case "Nov":
            mes = "11"
          break;
          case "Dec":
            mes = "12";
            break;
        }
      }
      if (indice == 2) {
        dia = valor;
      }

    });
    fechaNam = año+'-'+mes+'-'+dia+'T05:00:00.000+00:00';
    //console.log("termina el for");
    return fechaNam;
    } else {
      return "";
    }

  }

  procesarFecha2(fecha : string | undefined) : string{
    var año : string = "";
    var dia : string = "";
    var mes : string = "";
    var fechaNam : string = "";
    if (fecha != null) {
      let param : string[] =  fecha.split(" ");
      //2000-07-30T05:00:00.000+00:00 Formato que debe de tener la fecha
      //console.log("inicia el for");
    param.forEach(function(valor, indice, array) {
      //console.log(indice + ": " + valor);
      if (indice == 3) {
        año = valor;
      }
      if (indice == 1) {
        switch (valor) {
          case "Jan":
            mes = "01"
          break;
          case "Feb":
            mes = "02"
          break;
          case "Mar":
            mes = "03"
          break;
          case "Apr":
            mes = "04"
          break;
          case "May":
            mes = "05"
          break;
          case "Jun":
            mes = "06"
          break;
          case "Jul":
            mes = "07"
          break;
          case "Aug":
            mes = "08"
          break;
          case "Sep":
            mes = "09"
          break;
          case "Oct":
            mes = "10"
          break;
          case "Nov":
            mes = "11"
          break;
          case "Dec":
            mes = "12";
            break;
        }
      }
      if (indice == 2) {
        dia = valor;
      }

    });
    fechaNam = año+'-'+mes+'-'+dia+'T05:00:00.000+00:00';
    //console.log("termina el for");
    return fechaNam;
    } else {
      return "";
    }

  }
}
