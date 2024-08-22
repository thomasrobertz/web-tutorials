import { Injectable } from '@angular/core';

// Createdwith "ng g s services/MyFirst" (services/ filder was created alongside)

@Injectable({         // Means "can be injected as singleton
  providedIn: 'root'  //   at any level at below root"
})
export class MyFirstService {

  svc_messages: Array<any> = [];

  constructor() { }

  insertMessage(name: string, email: string, message: any): void {
    this.svc_messages.push(message);
  }

  getAllMessages(): Array<any> {
    return this.svc_messages;
  } 

  deleteMessage(index: number): void {
    this.svc_messages.splice(index, 1);
  }

}
