import { Component,OnInit} from '@angular/core';
import {PhotosService} from './photos.service';
import {Photos} from './photos'
@Component({
    selector: 'photos',
    template: `
      <h1>List of photos</h1>
      <table border="1">
      <tr *ngFor='let pt of photos;let i=index;'>
      <td>{{pt.albumId}}</td>
      <td>{{pt.id}}</td>
      <td>{{pt.title}}</td>
      <td>{{pt.url}}</td>
      <td><img [src]="pt.thumbnailUrl"/></td>
    </tr>
      </table>
    `,
    providers:[PhotosService]
})

export class PhotosComponent implements OnInit {
     photos:any;
    constructor(private photosservice:PhotosService) { }

    ngOnInit(){

        // this.photosservice.getPhotos().subscribe(data=>{
        //     this.photos=data;
        // })
        this.photosservice.getPhotos2().then(data=>{
            this.photos=data;
        })
    }
    
}