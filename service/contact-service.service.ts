import { Injectable } from '@angular/core';
import { Contact } from '../models/contact';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ContactServiceService {
  private baseUrl:string="http://localhost:8081/animal_rescue/Contact"
  constructor(private http:HttpClient ) { }
  newcontact(c:Contact):Observable<Contact>
  {
  return this.http.post<Contact>(`${this.baseUrl}`,c);
  }
  getAll():Observable<Contact[]>{
    return this.http.get<Contact[]>(`${this.baseUrl}`);
    }
  
}
