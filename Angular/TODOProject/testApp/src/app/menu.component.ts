import { Component} from '@angular/core';


@Component({
    selector: 'menu',
    template:`
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
     
                  <ul class="navbar-nav">
                   <li class="nav-item ">
                    <a class="nav-link" routerLink="login">Login</a>
                   </li>  
               </ul>
              
        
    </div>
  </nav>
  
    `
})

export class MenuComponent{
  constructor() {}


}