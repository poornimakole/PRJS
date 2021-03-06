import { Component } from '@angular/core';
import {LoginService} from './login.service'

@Component({
    selector: 'app-header',
    template: `
        <h2>Welcome {{username}}</h2>
    `
})

export class AppHeaderComponent{
    username:string;
    constructor(private loginservice:LoginService) {

        this.loginservice.getName().subscribe(user=>{
            //whenever newname is received
            this.username=user.name;
        })
     }
}