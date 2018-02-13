import { Injectable } from '@angular/core';
import {Subject} from 'rxjs/Subject'
import {Observable} from 'rxjs/Observable'

@Injectable()
export class CartService {

    prodSubj:Subject<any>=new Subject<any>();
    
        setProduct(product:any):void{
             this.prodSubj.next(product);//add the newname to the subject
        }
    
        getProduct():Observable<any>{
           //Invoked by the header component
    
            return this.prodSubj.asObservable();
        }
}