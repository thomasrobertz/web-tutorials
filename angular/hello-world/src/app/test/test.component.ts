import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      Welcome, {{name}}
    </h2> 
    <input #myInputReference type="text" />
    <button (click)="logMessage(myInputReference.value);">Log</button>      
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Carl";

  constructor() { }

  ngOnInit(): void {
  }

  logMessage(value) {
    console.log(value);
  }
}
