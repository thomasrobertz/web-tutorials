import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      Welcome, {{name}}
    </h2> 
    <input [(ngModel)]="name" type="text" /> 
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "";

  constructor() { }

  ngOnInit(): void {
  }
}
