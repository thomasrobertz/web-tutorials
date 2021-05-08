import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2 [style.color]="hasError? 'red' : 'green'">
      Welcome {{name}}
    </h2> 
    <h2 [ngStyle]="titleStyles">
      ngStyle
    </h2>       
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Walther";
  public hasError = true;

  public titleStyles = {
    color: "blue",
    fontStyle: "italic"
  }

  constructor() { }

  ngOnInit(): void {
  }
}
