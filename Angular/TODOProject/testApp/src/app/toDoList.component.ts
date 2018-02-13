import { Component ,OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {ToDoListService} from './toDoList.service';
import {ToDo} from './ToDo';
import {ChangeService} from './change.service';

@Component({
    selector: 'list',
    template: `
    <h3>Welcome {{name}} </h3>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
     
                  <ul class="navbar-nav">
                    <li class="nav-item">
                    <a class="nav-link" routerLink="completelist">Complete List</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" routerLink="completed">Completed</a>
                    </li>
                    <li class="nav-item">
                    <a class="nav-link" routerLink="pending">Pending</a>
                  </li>
                  <li class="nav-item ">
                  <a class="nav-link" routerLink="todosummary">ToDo Summary</a>
                </li>
                <li class="nav-item ">
                <a class="nav-link" routerLink="profile">Profile</a>
              </li>
               </ul> 
    </div>
  </nav>
  <router-outlet></router-outlet>     
    `,
    providers:[ChangeService]
})

export class ToDoListComponent implements OnInit {
    name:string;
    constructor(private activeRoute:ActivatedRoute,private changeservice:ChangeService) {
      
        this.changeservice.getName().subscribe(name=>{
          this.name=name;
      })      
      
     }
    
        ngOnInit() {
            this.activeRoute.params.subscribe(routeParams=>{
              this.name=routeParams['userName'];
              console.log(this.name);
          }) 
          
        }

}