import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'phoneno'
})

export class PhoneNumberPipe implements PipeTransform {
    
    transform(val: any, args: any[]): any {
        val = val[0] != 0 ? '0' + val : '' + val;
        let newStr = '';
        let x=0;
        for(let i=0; i < (Math.floor(val.length/3) - 1); i++){
           newStr = newStr+ val.substr(i*3, 3) + '-';
           x=i+1;
        }
        return newStr+ val.substr(x*3);
    }
}