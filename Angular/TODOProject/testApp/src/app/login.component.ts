import { Component } from '@angular/core';
import {Router} from '@angular/router'

@Component({
    selector: 'login',
    template: `
       user Name:<input type="text"  [(ngModel)]="name"><br>
            password:<input type="password" [(ngModel)]="password"><br>
            <button (click)="logIn()">Login</button><br>
    `
})

export class LoginComponent {
    name:string;
    password:string;
    constructor(private router:Router) { }

   logIn():void{
       if(this.name==="veda" && this.password==="admin")
         { 
            this.router.navigate(['todolist',this.name]);
         }
         else if(this.name==="vansh" && this.password==="admin")
         {
            this.router.navigate(['todolist',this.name]);
         }
    }


}