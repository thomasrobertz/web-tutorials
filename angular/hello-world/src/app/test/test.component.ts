import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  
    <h2>{{ name | lowercase }}</h2>
    <h2>{{ name | slice:2:4 }}</h2>
    <h2>{{ person | json }}</h2>
    <h2>{{ 5.6789 | number:'3.1-4' }}</h2>
    <h2>{{ date | date:'short'  }}</h2>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Jimmy";
  public date = new Date();

  public person = {
    "firstName": "John",
    "lastName": "Doe"
  }

  constructor() { }

  ngOnInit(): void {
  }
}
