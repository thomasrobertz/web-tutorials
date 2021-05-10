import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  getEmployees() {
    return [
      {"id": 1, "name": "John", "age": 34},
      {"id": 2, "name": "Bob", "age": 35},
      {"id": 3, "name": "Carl", "age": 38},
      {"id": 4, "name": "Peter", "age": 27},
    ];
  }
}
