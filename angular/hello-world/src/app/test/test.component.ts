import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  xxx  
    <h2>{{ "This is Input from somewhere above: " + parentData }}</h2>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  @Input() public parentData;

  constructor() { }

  ngOnInit(): void {
  }
}
