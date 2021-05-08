import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      test.component.ts
    </h2>
    <h2 [class]="successClass">
      Success
    </h2>    
    <h2 [class]="errorClass">
      Error
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
  public successClass = "text-success";
  public errorClass = "text-error";

  constructor() { }

  ngOnInit(): void {
  }

  greetAndShowMessage() {
    return "Greetings, here is your message: " + this.message;
  }

}
