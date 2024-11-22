import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Register } from '../models/register';
import { Observable } from 'rxjs';
import { get } from 'http';
import { register } from 'module';

@Injectable({
  providedIn: 'root'
})
export class RegisterServiceService {
private baseUrl:string="http://localhost:8081/animal_rescue/Registration"
  constructor(private http:HttpClient ) { }
  newUser(register:Register):Observable<Register>
  {
  return this.http.post<Register>(`${this.baseUrl}`,register);
  }
  login(register:Register):Observable<Register>
  {
    return this.http.get<Register>(`${this.baseUrl}`+"/"+register.emailid+"/"+register.password);
  }
  getAll():Observable<Register[]>
  {
    return this.http.get<Register[]>(`${this.baseUrl}`);
  }
}
