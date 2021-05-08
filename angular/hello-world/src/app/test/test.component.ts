import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2 [style.color]="hasError? 'red' : 'green'">
      Welcome {{name}}
    </h2>            
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Walther";
  public hasError = true;

  constructor() { }

  ngOnInit(): void {
  }
}
