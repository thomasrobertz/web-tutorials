import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `
  <h2>Department List</h2>
  <ul *ngFor="let department of departments">
    <li (click)="onDepartmentDetail(department)">{{department.id}}, {{department.name}}</li>
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

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onDepartmentDetail(department) {
    this.router.navigate([
      "/departments", 
      department.id
    ]);
  }

}
