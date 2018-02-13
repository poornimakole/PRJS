import { Component } from '@angular/core';
import { User } from './user';
import {ToDo}  from './ToDo';
import {LoginService} from './login.service';
import {ProductsService} from './products.service';
import {ProductsServiceA} from './productA.service';
import {CartService} from './cart.service';
import {Cart2Service} from './cart2.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  ,
  providers:[LoginService,{provide:ProductsService,useClass:ProductsServiceA},CartService,Cart2Service]
})

export class AppComponent {
  // title="veda";
user1=new User(1,"vansh","vghf","male",17);
//  item=new ToDo("project work",false,new Date(),new Date());
  
handleUpdate(newVal:any):void{
  this.user1.name=newVal;
}
}
