import { TestBed } from '@angular/core/testing';

import { MaestroServiceService } from './maestro-service.service';

describe('MaestroServiceService', () => {
  let service: MaestroServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MaestroServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
