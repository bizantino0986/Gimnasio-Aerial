import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import { MatButtonModule } from '@angular/material/button';
import { MatDividerModule } from '@angular/material/divider';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatTabsModule } from '@angular/material/tabs';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material/table';
import { MatDialogModule} from '@angular/material/dialog';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatMomentDateModule } from '@angular/material-moment-adapter';
import {MatSelectModule} from '@angular/material/select';

import { AddClaseComponent } from './components/clase/add-clase/add-clase.component';
import { ListClaseComponent } from './components/clase/list-clase/list-clase.component';
import { EditClaseComponent } from './components/clase/edit-clase/edit-clase.component';
import { EditAlumnoComponent } from './components/persona/alumno/edit-alumno/edit-alumno.component';
import { ListAlumnoComponent } from './components/persona/alumno/list-alumno/list-alumno.component';
import { AddAlumnoComponent } from './components/persona/alumno/add-alumno/add-alumno.component';
import { AddMaestroComponent } from './components/persona/maestro/add-maestro/add-maestro.component';
import { EditMaestroComponent } from './components/persona/maestro/edit-maestro/edit-maestro.component';
import { ListMaestroComponent } from './components/persona/maestro/list-maestro/list-maestro.component';
import { AddCargoComponent } from './components/cargos/add-cargo/add-cargo.component';
import { ListCargoComponent } from './components/cargos/list-cargo/list-cargo.component';
import { EditCargoComponent } from './components/cargos/edit-cargo/edit-cargo.component';
import { EditPagoComponent } from './components/pagos/edit-pago/edit-pago.component';
import { ListPagoComponent } from './components/pagos/list-pago/list-pago.component';
import { AddPagoComponent } from './components/pagos/add-pago/add-pago.component';
import { DialogDireccionComponent } from './components/persona/alumno/dialog-direccion/dialog-direccion.component';


import { HttpClientModule } from '@angular/common/http'

import { AlumnoServiceService } from './services/persona/alumno/alumno-service.service';
import { registerLocaleData } from '@angular/common';
import { MAT_DATE_LOCALE } from '@angular/material/core';

@NgModule({
  declarations: [
    AppComponent,
    AddClaseComponent,
    ListClaseComponent,
    EditClaseComponent,
    EditAlumnoComponent,
    ListAlumnoComponent,
    AddAlumnoComponent,
    AddMaestroComponent,
    EditMaestroComponent,
    ListMaestroComponent,
    AddCargoComponent,
    ListCargoComponent,
    EditCargoComponent,
    EditPagoComponent,
    ListPagoComponent,
    AddPagoComponent,
    DialogDireccionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatButtonModule,
    MatDividerModule,
    MatToolbarModule,
    MatTabsModule,
    MatFormFieldModule,
    MatInputModule,
    MatIconModule,
    FormsModule,
    MatTableModule,
    MatDialogModule,
    HttpClientModule,
    MatGridListModule,
    MatDatepickerModule,
    MatMomentDateModule,
    MatSelectModule,

  ],
  providers: [AlumnoServiceService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
