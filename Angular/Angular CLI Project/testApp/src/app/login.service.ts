import { Injectable } from '@angular/core';
import {Subject} from 'rxjs/Subject'
import {Observable} from 'rxjs/Observable'
@Injectable()
export class LoginService {

   nameSubj:Subject<any>=new Subject<any>();

    setName(user:any):void{
         this.nameSubj.next(user);//add the newname to the subject
    }

    getName():Observable<any>{
       //Invoked by the header component

        return this.nameSubj.asObservable();
    }
}