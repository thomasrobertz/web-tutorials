import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `  
    <h2>{{ "This is Input from somewhere above: " + parentData }}</h2>
    <button (click)="fireEvent()">Send to parent</button>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  @Input() public parentData;

  @Output() public childEvent = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  fireEvent() {
    this.childEvent.emit("Message from child");
  }
}
