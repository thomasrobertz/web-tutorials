import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

@Component({
  selector: 'app-department-detail',
  template: `
    <p>
      Selected department id: {{departmentId}}
    </p>
    <a (click)="gotoPrevious()">Previous</a><br />
    <a (click)="gotoNext()">Next</a>
  `,
  styles: [
  ]
})
export class DepartmentDetailComponent implements OnInit {

  public departmentId;

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    // Next and previous won't work with snapshot.
    //this.departmentId = parseInt(this.route.snapshot.paramMap.get('id'));
    // Instead we use an Observable returned from paramMap.
    this.route.paramMap.subscribe((params: ParamMap) => {
      this.departmentId = parseInt(params.get("id"));
    })
  }

  gotoPrevious() {
    this.router.navigate([
      "/departments",
      this.departmentId - 1 
    ])
  }

  gotoNext() {
    this.router.navigate([
      "/departments",
      this.departmentId + 1 
    ])
  }
}
