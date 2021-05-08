import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2 *ngIf="displayWelcomeMessage; else myElseBlock">
      Welcome, {{name}}
    </h2> 

    <ng-template #myElseBlock>
      <h2>
        Welcome message is hidden.
      </h2>
    </ng-template>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  public name = "Frank";
  public displayWelcomeMessage = false;

  constructor() { }

  ngOnInit(): void {
  }
}
