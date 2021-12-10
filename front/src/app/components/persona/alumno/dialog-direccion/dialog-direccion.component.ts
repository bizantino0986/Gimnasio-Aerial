import { Direccion } from 'src/app/model/persona/direccion/Direccion';
import { Component, Inject, Input, OnInit, Optional } from '@angular/core';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Observable } from 'rxjs';
import { Alumno } from 'src/app/model/persona/Alumno';

@Component({
  selector: 'app-dialog-direccion',
  templateUrl: './dialog-direccion.component.html',
  styleUrls: ['./dialog-direccion.component.css']
})
export class DialogDireccionComponent implements OnInit {

  alumno: Alumno = new Alumno();

  constructor(dialogRef: MatDialogRef<DialogDireccionComponent>, @Optional() @Inject(MAT_DIALOG_DATA) data: Alumno) {
    this.alumno = {...data}
    console.log(this.alumno);
  }

  ngOnInit(): void {
  }



}
