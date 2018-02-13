import { Component } from '@angular/core';
import {ToDo}  from './ToDo';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']

})

export class AppComponent {
item=new ToDo(12,202,"project work",false);
  

}
