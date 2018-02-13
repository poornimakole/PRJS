import { Component, OnInit } from '@angular/core';
import {User1} from './User1';
@Component({
    selector:'userform',
    templateUrl: 'signupform.component.html',
    styles:[
    `
      input.ng-valid{
          border:solid 2px blue;
      }

      input.ng-invalid{
        border:solid 2px red;
    }
        `
    ]
    
})
export class SignUpFormComponent  {
    user:User1 = {
            name : 'James',             
            phone:"1234",
            address:'India'
        
    }

    postForm():void{
        alert("form is post!!!");
    }
 
}