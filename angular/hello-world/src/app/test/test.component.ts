import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <h2>
      test.component.ts {{message}}
    </h2>
  `,
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit {

  public message = "Hello!";

  constructor() { }

  ngOnInit(): void {
  }

}
