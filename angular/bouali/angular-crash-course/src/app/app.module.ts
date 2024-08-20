import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// As we can see using "ng generate component my-first-comp" appended the type description "Component" to the end of the class name.
import { MyFirstCompComponent } from './my-first-comp/my-first-comp.component';

@NgModule({
  declarations: [
    AppComponent,
    MyFirstCompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
