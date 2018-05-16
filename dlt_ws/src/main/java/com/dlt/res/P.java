package com.dlt.res;

public class P {
	/*import { Pipe, PipeTransform } from '@angular/core';

	//Pablo Sanchez
	//This pipe receives ONE or TWO arrays containing [key, order]
	//Key:string -> the property to order by
	//order:string -> 'asc' or 'desc' (ascending, descending) order criterias

	@Pipe({
	    name: 'orderByKeys',
	    pure: false
	})
	export class OrderArrayByKeysFilterPipe implements PipeTransform {
	    private ko1:Array<string> = ['', ''];
	    private ko2:Array<string> = ['', ''];

	    transform(array:Array<any>, keyOrder1:Array<string>, keyOrder2?:Array<string>):Array<any> {
	        if (keyOrder1 != undefined) this.ko1 = keyOrder1;
	        if (keyOrder2 != undefined) this.ko2 = keyOrder2;
	        return array.sort(this.criteria(this.ko1, this.ko2));
	    }

	    criteria(ko1:Array<string>, ko2:Array<string>){
	        const order1:string = ko1[1];
	        const order2:string = ko2[1];
	        const pipeComparators:any = (...fns) => (a, b) => {
	            const compare = (a, b, f = 0) => fns[f](a, b) ? fns[f](a, b) : fns[f](b, a) ? fns[f](b, a) : (f !== fns.length - 1) ? compare(a, b, f + 1) : 0;
	            return compare(a, b);
	        };
	        
	        const comparator = fn => (a, b) => fn(a, b) ? 1 : fn(b, a) ? -1 : 0;
	        const byKey1 = comparator((a, b) => order1 == 'asc' ? a[ko1[0]] > b[ko1[0]] : a[ko1[0]] < b[ko1[0]]);
	        const byKey2 = comparator((a, b) => order2 == 'asc' ? a[ko2[0]] > b[ko2[0]] : a[ko2[0]] < b[ko2[0]]);
	        return ko2 != undefined ? pipeComparators(byKey1, byKey2) : pipeComparators(byKey1);
	    }
	}*/
}
