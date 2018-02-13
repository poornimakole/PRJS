import { Component} from '@angular/core';
import {LoginService} from './login.service'

@Component({
    selector: 'menu',
    template:`
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" routerLink="#">Welcome</a>
    <div class="collapse navbar-collapse" id="navbarNav">
     
                  <ul class="navbar-nav" [ngSwitch]="true">
                    <li class="nav-item " *ngSwitchCase="checker===1 ||checker===2||checker===3">
                      <a class="nav-link" routerLink="/login">Login</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2">
                      <a class="nav-link"routerLink="/products">Products</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2">
                      <a class="nav-link"routerLink="photos">Photos</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2">
                      <a class="nav-link"routerLink="#">Profiles</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2||checker===3">
                      <a class="nav-link" routerLink="#">SignUp</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1">
                      <a class="nav-link"routerLink="#">Inventory</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1">
                      <a class="nav-link" routerLink="#">Reports</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2||checker===3">
                      <a class="nav-link" routerLink="#">Contacts</a>
                    </li>
                    <li class="nav-item" *ngSwitchCase="checker===1||checker===2||checker===3">
                      <a class="nav-link" routerLink="#">Help</a>
                    </li>
               </ul>
              
        
    </div>
  </nav>
  
    `
})

export class menuComponent{
  checker:number=2;
  username:string;
  password:string;
  isAdmin:boolean;
  constructor(private loginservice:LoginService) {

      this.loginservice.getName().subscribe(user=>{
          //whenever newname is received
          this.username=user.name;
          this.password=user.password;
          this.isAdmin=user.role;    
          console.log(this.isAdmin);
          if(this.isAdmin)
          {
            console.log("agfg");
              this.checker=1;
          }
          else if(this.username==="veda" && this.password==="abc"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )
          {
            console.log("jukgg");
             this.checker=2;
          }
          else{
            console.log("adgfgww");
            this.checker=3;
          }
      });
     
      
   }


}