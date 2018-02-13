import { Component,Input} from '@angular/core';
import {ToDo} from './ToDo';

@Component({
    selector: 'todo-item',
    template: `
        <h3>ToDo Component</h3>
        task  :{{item1.title}}<br>
        status : {{item1.done}}<br>
        creation Date: {{item1.creationDate}}<br>
        Due Date : {{item1.DueDate}}<br>
    `
})

export class ToDoItemComponent {
    @Input()
    item1:ToDo;
    constructor() { }
}