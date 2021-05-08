import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2 [style.color]="'orange'">
      Welcome {{name}}
    </h2>            
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Walther";

  constructor() { }

  ngOnInit(): void {
  }
}
