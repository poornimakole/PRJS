import { Injectable } from '@angular/core';
import {ToDo} from './ToDo';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable'

@Injectable()
export class ToDoListService {
    //todolist:any
    constructor(private Http:HttpClient) { 
       
    }
    
    postItem(item1:any){
        return this.Http.post('https://jsonplaceholder.typicode.com/todos',
        {"userId":item1.userId,"id":item1.id,"title": item1.title,"completed": item1.completed}).subscribe(data=>
            {
            console.log('posted');
        });
    }

    getItem():any{
        return this.Http.get('https://jsonplaceholder.typicode.com/todos');
    }
}