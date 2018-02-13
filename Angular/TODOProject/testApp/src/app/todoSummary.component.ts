import { Component, OnInit } from '@angular/core';
import {ToDoListService} from './toDoList.service';
import {ToDo} from './ToDo';


@Component({
    selector: 'summary',
    template: `
       <h4>Total task:{{count}}</h4>
       <h5>Completed task:{{completedcount}}</h5>
       <h5>Pending task:{{pendingcount}}</h5>
    `,
    providers:[{provide:ToDoListService,useClass:ToDoListService}]
})

export class ToDoSummaryComponent implements OnInit {
    itemlist:ToDo[]=[];
    count:number;
    completedcount:number=0;
    pendingcount:number=0;
    constructor(private todoservice:ToDoListService) {
        this.todoservice.getItem().subscribe(data=>{
            this.itemlist=data;
            this.count=this.itemlist.length;
            this.itemlist.forEach(element => {
                if(element.completed===true)
                  this.completedcount++;
            });
            this.pendingcount=this.count-this.completedcount;
        })
     }
    
    ngOnInit() {
        
     }
}