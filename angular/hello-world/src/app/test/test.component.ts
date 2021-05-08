import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    
  <h2 *ngIf="displayWelcomeMessage; then affirmative; else negative"></h2> 

  <ng-template #affirmative>
    <h2>
      Welcome, {{name}}
    </h2>
  </ng-template>

  <ng-template #negative>
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
