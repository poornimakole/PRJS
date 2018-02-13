import { Injectable } from '@angular/core';
import {Subject} from 'rxjs/Subject'
import {Observable} from 'rxjs/Observable'

@Injectable()
export class ChangeService {
    nameSubj:Subject<string>=new Subject<string>();
    constructor() { }

    setName(uname:string){
        this.nameSubj.next(uname);
        console.log(uname);
    }

    getName():Observable<any>{
        console.log("gfhfhgf");
        return this.nameSubj.asObservable()
    }
}