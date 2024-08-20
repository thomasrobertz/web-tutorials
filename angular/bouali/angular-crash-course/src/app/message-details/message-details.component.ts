import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-message-details',
  templateUrl: './message-details.component.html',
  styleUrl: './message-details.component.scss'
})
export class MessageDetailsComponent {

  @Input() // Receive from parent component
  md_message: any = {}

  @Input()
  md_index: number = -1

  @Output() // Send to parent component
  md_delete: EventEmitter<number> = new EventEmitter<number>();

  onDelete() {
    this.md_delete.emit(this.md_index); // Notify parent
  }
}
