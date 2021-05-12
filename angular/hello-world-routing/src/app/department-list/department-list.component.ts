import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department-list',
  template: `
  <h2>Department List</h2>
  <ul *ngFor="let department of departments">
    <li>{{department.id}}, {{department.name}}</li>
  </ul>
  `,
  styles: [
  ]
})
export class DepartmentListComponent implements OnInit {

  departments = [
    {"id": 1, "name": "Angular" },
    {"id": 2, "name": "Node" },
    {"id": 3, "name": "MongoDB" },
    {"id": 4, "name": "Bootstrap" }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
