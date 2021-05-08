import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `    
  <div [ngSwitch]="color">
    <div *ngSwitchCase="'red'">You picked: red</div>
    <div *ngSwitchCase="'blue'">You picked: blue</div>
    <div *ngSwitchCase="'green'">You picked: green</div>
  </div> 
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public color = "blue";

  constructor() { }

  ngOnInit(): void {
  }
}
