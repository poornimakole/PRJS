import {Component} from '@angular/core';
import {LoginService} from './login.service'
import { Router } from '@angular/router';
@Component({
    selector:'login',
    template:`
            user Name:<input type="text" #newName [(ngModel)]="name"><br>
            password:<input type="password" [(ngModel)]="password"><br>
            Admin/not:<input type="checkbox" (change)="changeStatus()">
            <button (click)="logIn()">Login</button><br>
            value of name in the class:{{name}}
            <br>value of name in the view:{{newName.value}}
           `
})
export class loginComponent{
    
    name:string="admin";
    password:string="admin";
    isAdmin:boolean=false;
    constructor(private loginservice:LoginService,private router:Router) { }

   logIn():void{
      this.loginservice.setName({'name':this.name,'password':this.password,'role':this.isAdmin});
      this.router.navigate(['/products']);
    }

    changeStatus():void{
        if(this.isAdmin===false)
        {
            this.isAdmin=true;
        }
        else{
            this.isAdmin=false
        }
    }
}