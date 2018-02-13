import { Component,Input,Output,EventEmitter} from '@angular/core';
import { User } from './user';

@Component({
    selector: 'profile',
    template: `
       <h3>Profile Component</h3>
      
       userId is {{user.id}}<br>
       userName is {{user.name}}<br>
       <input type="text" [(ngModel)]="user.name">
       <button (click)="updateName()">update</button><br>
       user Address is {{user.addr}}<br>
       gender : {{user.gender}}<br>
       age: {{user.age}}

       <!--name:{{username}}<br>
       <input type="text" [(ngModel)]="username">
       <button (click)="updateName()">update</button><br>-->
    `
})

export class ProfileComponent {
   @Input()
   user:User;
//    username:string;
   //custom event
   @Output()
   update:EventEmitter<string>=new EventEmitter<string>();
   constructor()
   {

   }
   updateName():void{
       //trigger a custom event 'update'
    //    this.user.name="abc";
    this.update.emit(this.user.name)
   }
}



