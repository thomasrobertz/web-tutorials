import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      test.component.ts
    </h2>
    <h2 [ngClass]="messageClasses">
      Status
    </h2>               
    <hr />
  `,
  styles: [`  
    .text-success { color: green; }
    .text-error { color: red; }
  `]
})
export class TestComponent implements OnInit {

  public message = "Hello!";
  public hasErrors = false; // true

  public messageClasses = {
    "text-success": !this.hasErrors,
    "text-error": this.hasErrors
  }

  constructor() { }

  ngOnInit(): void {
  }

  greetAndShowMessage() {
    return "Greetings, here is your message: " + this.message;
  }

}
