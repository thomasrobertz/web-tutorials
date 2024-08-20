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
}
