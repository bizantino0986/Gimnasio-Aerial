import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMaestroComponent } from './list-maestro.component';

describe('ListMaestroComponent', () => {
  let component: ListMaestroComponent;
  let fixture: ComponentFixture<ListMaestroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListMaestroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListMaestroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
