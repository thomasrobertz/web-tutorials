import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `
  <h2>Department List</h2>
  <ul *ngFor="let department of departments">
    <li (click)="onDepartmentDetail(department)" [class.selected]="isSelected(department)">{{department.id}}, {{department.name}}</li>
  </ul>
  `,
  styles: [
    '.selected { color: blue; }'
  ]
})
export class DepartmentListComponent implements OnInit {

  departments = [
    {"id": 1, "name": "Angular" },
    {"id": 2, "name": "Node" },
    {"id": 3, "name": "MongoDB" },
    {"id": 4, "name": "Bootstrap" }
  ];

  public selectedId;

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.selectedId = parseInt(params.get("id"));
    })
  }

  onDepartmentDetail(department) {
    this.router.navigate([
      "/departments", 
      department.id
    ]);
  }

  isSelected(department) {
    return department.id === this.selectedId;
  }
}
