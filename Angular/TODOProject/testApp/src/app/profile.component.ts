import { Component, OnInit,Input,Output,EventEmitter } from '@angular/core';
import {ChangeService} from './change.service';

@Component({
    selector: 'profile',
    template: `

    userName is {{uname}}<br>
    <input type="text" [(ngModel)]="uname" (keyup.enter)="update()">
    <button (click)="update()">UPDATE</button>
    `
})

export class ProfileComponent implements OnInit {
    uname:string;
    constructor(private changeservice:ChangeService) { }

    update():void{
     this.changeservice.setName(this.uname);
    }
    ngOnInit() { }
}