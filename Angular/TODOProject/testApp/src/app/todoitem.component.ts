import { Component,Input} from '@angular/core';
import {ToDo} from './ToDo';

@Component({
    selector: 'todo-item',
    template: `
        <h3>ToDo Component</h3>
        UserID:{{item1.userId}}<br>
        Id:{{item1.id}}<br>
        task  :{{item1.title}}<br>
        status : {{item1.completed}}<br>
       
    `
})

export class ToDoItemComponent {
    @Input()
    item1:ToDo;
    constructor() { }
}