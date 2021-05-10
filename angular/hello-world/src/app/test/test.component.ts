import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  
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
