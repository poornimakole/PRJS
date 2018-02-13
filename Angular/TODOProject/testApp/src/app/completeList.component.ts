import { Component, OnInit } from '@angular/core';
import {ToDoListService} from './toDoList.service';
import {ToDo} from './ToDo';


@Component({
    selector: 'complete-list',
    template: `
    <div class="form-group">
    <h1>To-Do <small>List</small></h1>
    <input type="text" class="form-control" placeholder="Your Task" #Itemtitle="ngModel" [(ngModel)]="title" required>
    <p *ngIf="Itemtitle.errors?.required">Title is mandatory</p>
    <button type="button" [disabled]="Itemtitle.invalid" class="btn btn btn-primary" (click)="add(title)">Add</button>
    </div>
    <table border="1">
    <tr *ngFor='let item of itemlist;let i=index;'>
        <td>{{item.userId}}</td>
        <td>{{item.id}}</td>
        <td>{{item.title}}</td>
        <td>{{item.completed}}</td>
        <td><input type="checkbox" (change)="changeStatus(i)" [checked]=item.completed></td>
        <td><button [disabled]="!item.completed" (click)="deleteItem(i)">delete</button></td>
        
    </tr>
    </table>
    `,
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

export class CompleteListComponent implements OnInit {
    title:string;
    itemlist:any;
    constructor(private todoservice:ToDoListService){
        console.log("list constructor");
    }
    add(title:string):void{
        let item1=new ToDo(11,202,title,false);
        this.itemlist.push(item1);
        this.todoservice.postItem(item1);
        }

    changeStatus(i:number):void{
        if(this.itemlist[i].completed===false)
        {
            this.itemlist[i].completed=true;
        }
        else{
            this.itemlist[i].completed=false
        }
    }

    deleteItem(i:number):void{
        this.itemlist.splice(i,1);
    }

    ngOnInit(){
        
                this.todoservice.getItem().subscribe(data=>{
                    this.itemlist=data;
                })
            }
    
}