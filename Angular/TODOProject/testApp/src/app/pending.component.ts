import { Component, OnInit } from '@angular/core';
import {ToDoListService} from './toDoList.service';
import {ToDo} from './ToDo';

@Component({
    selector: 'pending',
    template: `
    <div class="form-group">
    <h1>Pending <small>List</small></h1>
    </div>
    <table border="1">
    <tr *ngFor='let item of items;let i=index;'>
        <td>{{item.userId}}</td>
        <td>{{item.id}}</td>
        <td>{{item.title}}</td>
        <td>{{item.completed}}</td>
        <td><input type="checkbox" (change)="changeStatus(i)" [checked]=item.completed></td>
        <td><button [disabled]="!item.completed" (click)="deleteItem(i)">delete</button></td>
        
    </tr>
    </table>
    `
    ,
    styles:[`
    form {
        display: inline-block;
    }
    .form-group {
        text-align: center;
        padding-bottom: 25px;
    }
    #todo {
        margin: 0 auto;
        width: 500px;
    }
    
    a.close {
      float: right;
    }

    input.ng-valid{
        border:solid 2px blue;
    }

    input.ng-invalid{
        border:solid 2px red;
    }
    
    `],
    providers:[{provide:ToDoListService,useClass:ToDoListService}]
})

export class PendingComponent implements OnInit {
    itemlist:ToDo[]=[];
    items:ToDo[]=[];
    constructor(private todoservice:ToDoListService){
        console.log("list constructor");
    }
    
    changeStatus(i:number):void{
        if(this.items[i].completed===false)
        {
            this.items[i].completed=true;
        }
        else{
            this.items[i].completed=false
        }
    }

    deleteItem(i:number):void{
        this.items.splice(i,1);
    }

    ngOnInit(){
        
                this.todoservice.getItem().subscribe(data=>{
                    this.itemlist=data;
                    this.itemlist.forEach(element => {
                        if(element.completed==false)
                        {
                            this.items.push(element);
                        }
                    });
                })
                
            }
}