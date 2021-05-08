import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      Welcome, {{name}}
    </h2> 
    <button (click)="onClick($event);">Greet</button>      
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Carl";

  constructor() { }

  ngOnInit(): void {
  }

  onClick(event) {
    console.log(event);
    this.name = "you clicked"
  }
}
