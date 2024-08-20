import { Component } from '@angular/core';

@Component({
  selector: 'app-my-first-comp',
  templateUrl: './my-first-comp.component.html',
  styleUrl: './my-first-comp.component.scss'
})
export class MyFirstCompComponent {
  ts_name: string = "John";
  ts_email: string = "john@doe.com";
  ts_message: string = "Hello World";
  ts_messages: Array<any> = [];

  isSubmitted: boolean = false;

  onSubmit() {
    this.isSubmitted = true;
    console.log('Form submitted ' + this.ts_name 
      + " " + this.ts_email 
      + " " + this.ts_message);
    this.ts_messages.push({
      name: this.ts_name,
      email: this.ts_email,
      message: this.ts_message
    });
  }

  deleteMessage(index: number) {
    this.ts_messages.splice(index, 1);
  }
}