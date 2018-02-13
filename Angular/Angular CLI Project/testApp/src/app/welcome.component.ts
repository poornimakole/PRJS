import {Component} from '@angular/core';
@Component({
    selector:'welcome',
    template:`
              <h1>{{welcomeMsg}}</h1>
              lower case:{{welcomeMsg|lowercase}}<br>
              upper case:{{welcomeMsg|uppercase}}<br>
              Currency:{{price|currency:"INR"}}<br>
               dateformat:{{today | date}}<br>
             date:{{today|date:"medium"}}<br>
           date:{{today|date:"longDate"}}<br>
              date:{{today|date:"short"}}<br>
              camelCase:{{welcomeMsg|camelcase}}<br>
              phone number:{{phoneNo|phoneno}}

               `,
    styles:[
        `
        h1{
            color:red;
        }
        `
    ]
})
export class welcomeComponent{
    welcomeMsg:string;
    price:number=222;
    today:Date=new Date();
    phoneNo=3534534344;
    constructor(){
        this.welcomeMsg="welcome to application"
    }
}