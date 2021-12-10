import { EditCargoComponent } from './components/cargos/edit-cargo/edit-cargo.component';
import { EditPagoComponent } from './components/pagos/edit-pago/edit-pago.component';
import { AddPagoComponent } from './components/pagos/add-pago/add-pago.component';
import { AddCargoComponent } from './components/cargos/add-cargo/add-cargo.component';
import { ListCargoComponent } from './components/cargos/list-cargo/list-cargo.component';
import { ListPagoComponent } from './components/pagos/list-pago/list-pago.component';
import { EditClaseComponent } from './components/clase/edit-clase/edit-clase.component';
import { AddClaseComponent } from './components/clase/add-clase/add-clase.component';
import { EditMaestroComponent } from './components/persona/maestro/edit-maestro/edit-maestro.component';
import { AddMaestroComponent } from './components/persona/maestro/add-maestro/add-maestro.component';
import { EditAlumnoComponent } from './components/persona/alumno/edit-alumno/edit-alumno.component';
import { AddAlumnoComponent } from './components/persona/alumno/add-alumno/add-alumno.component';
import { ListClaseComponent } from './components/clase/list-clase/list-clase.component';
import { ListMaestroComponent } from './components/persona/maestro/list-maestro/list-maestro.component';
import { ListAlumnoComponent } from './components/persona/alumno/list-alumno/list-alumno.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [

  {path:'listAlumno', component:ListAlumnoComponent},
  {path:'addAlumno', component:AddAlumnoComponent},
  {path:'editAlumno',component:EditAlumnoComponent},

  {path:'listMaestro', component:ListMaestroComponent},
  {path:'addMaestro', component:AddMaestroComponent},
  {path:'editMaestro', component:EditMaestroComponent},

  {path:'listClase', component:ListClaseComponent},
  {path:'addClase', component:AddClaseComponent},
  {path:'editClase', component:EditClaseComponent},

  {path:'listPagos', component:ListPagoComponent},
  {path:'addPagos', component:AddPagoComponent},
  {path:'editPagos', component:EditPagoComponent},


  {path:'listCargos', component:ListCargoComponent},
  {path:'addCargo', component:AddCargoComponent},
  {path:'editCargos', component:EditCargoComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
