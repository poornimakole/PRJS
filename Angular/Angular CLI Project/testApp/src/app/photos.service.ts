import { Injectable } from '@angular/core';
import {Photos} from './photos';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class PhotosService {

    photos:Array<Photos>;
    constructor(private Http:HttpClient){
        
    }
    

    getPhotos():Observable<any>{
        return this.Http.get('https://jsonplaceholder.typicode.com/photos')
    }

    getPhotos2():Promise<any>{
        return this.Http.get('https://jsonplaceholder.typicode.com/photos').toPromise();
    }
}