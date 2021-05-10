import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'employee-list-full',
  template: `
    <h2>Employee List</h2>
    <ul *ngFor="let employee of employees">
      <li>{{employee.id}}, {{employee.name}}, {{employee.age}}</li>
    </ul>
  `,
  styleUrls: ['./employee-list-full.component.scss']
})
export class EmployeeListFullComponent implements OnInit {

  public employees = [
    {"id": 1, "name": "John", "age": 34},
    {"id": 2, "name": "Bob", "age": 35},
    {"id": 3, "name": "Carl", "age": 38},
    {"id": 4, "name": "Peter", "age": 27},
  ];
  
  constructor() { }

  ngOnInit(): void {
  }

}
