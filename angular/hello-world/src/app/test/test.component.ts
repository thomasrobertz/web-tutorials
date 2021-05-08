import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      test.component.ts {{ message }}<br />
      {{ message.length + 1 }}<br />
      {{ "UC: " + message.toUpperCase() }}<br />
      {{ greetAndShowMessage() }}<br />
      {{ siteUrl }}
    </h2>
    <input [id]="myId" [disabled]="isDisabled" type="test" value="id property" />
    <hr />
  `,
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit {

  public message = "Hello!";
  public siteUrl = window.location.href;
  public myId = "testId";
  public isDisabled = true;

  constructor() { }

  ngOnInit(): void {
  }

  greetAndShowMessage() {
    return "Greetings, here is your message: " + this.message;
  }

}
